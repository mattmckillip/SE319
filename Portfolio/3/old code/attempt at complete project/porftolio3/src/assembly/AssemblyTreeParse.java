package assembly;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.runtime.ParserInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.Grammar;
import org.antlr.v4.tool.LexerGrammar;
import java.util.Scanner;
import java.util.Stack;

public class AssemblyTreeParse {
  public AssemblyTreeParse( String inputFile, String inputGrammerFile, String inputStart ) throws IOException{

    ParseTree t = parse(inputFile, inputGrammerFile, inputStart);
  }

  public static ParseTree parse(String fileName,
                              String combinedGrammarFileName,
                              String startRule)
    throws IOException
  {
    final Grammar g = Grammar.load(combinedGrammarFileName);
    LexerInterpreter lexEngine = g.createLexerInterpreter(new ANTLRFileStream(fileName));
    CommonTokenStream tokens = new CommonTokenStream(lexEngine);
    ParserInterpreter parser = g.createParserInterpreter(tokens);
    ParseTree t = parser.parse(g.getRule(startRule).index);
    System.out.println("parse tree: "+t.toStringTree(parser));
	String str = t.toStringTree(parser);
	Scanner splitter = new Scanner(str).useDelimiter("\\s*[;]\\s*");
	//TODO: Create instance of Phil's class
	while (splitter.hasNext()){
		String string = splitter.next();
		Scanner scanner = new Scanner(string);
		//TODO: Put data into correct form and pass to Phil's function		
	}
	return t;
  }
}
