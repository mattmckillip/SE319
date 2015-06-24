package assembly;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.runtime.ParserInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.Grammar;

public class AssemblyTree {
	
  public AssemblyTree(){
  }

  public String parse(String fileName,
                              String combinedGrammarFileName,
                              String startRule)
    throws IOException
  {
    final Grammar g = Grammar.load(combinedGrammarFileName);
    LexerInterpreter lexEngine = g.createLexerInterpreter(new ANTLRFileStream(fileName));
    CommonTokenStream tokens = new CommonTokenStream(lexEngine);
    ParserInterpreter parser = g.createParserInterpreter(tokens);
    ParseTree t = parser.parse(g.getRule(startRule).index);
	String str = t.toStringTree(parser);
	Scanner splitter = new Scanner(str).useDelimiter("\\s*[;]\\s*");
	StringHandler handler = new StringHandler();
	String[] instrs = {"ADD","AND","OR","SLT","SLL","SRL","XOR","ADDI","SLTI","LW","SW","LWI"};
	while (splitter.hasNext()){
		String instruction = "";
		String inst = splitter.next();
		inst = inst.replace(")", "");
		Scanner scanner = new Scanner(inst);
		while (scanner.hasNext()){
			String word = scanner.next();
			for (int i=0; i<instrs.length; i++){
				if (word.equals(instrs[i])){
					instruction = instruction + word + " ";
				}
			}
			if (word.contains("$")){
				instruction = instruction + word;
			}
			else if (word.contains(",")){
				instruction = instruction + ", ";
			}
			else if (isInteger(word)){
				instruction = instruction + word;
			}
		}
		handler.addStatement(instruction);
		scanner.close();
	}
	splitter.close();
	return handler.output();
  }
  
  private boolean isInteger(String str){
	  try { 
	        Integer.parseInt(str); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    return true;
  }
}
