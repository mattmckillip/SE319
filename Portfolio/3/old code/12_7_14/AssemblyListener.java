// Generated from Assembly.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblyParser}.
 */
public interface AssemblyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull AssemblyParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull AssemblyParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull AssemblyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull AssemblyParser.ExprContext ctx);
}