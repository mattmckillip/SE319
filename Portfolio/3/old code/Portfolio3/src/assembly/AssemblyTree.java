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
    System.out.println("parse tree: "+t.toStringTree(parser));
	String str = t.toStringTree(parser);
	Scanner splitter = new Scanner(str).useDelimiter("\\s*[;]\\s*");
	StringHandler handler = new StringHandler();
	while (splitter.hasNext()){
		String string = splitter.next();
		handler.addStatement(string);
	}
	splitter.close();
	return handler.output();
  }
}
