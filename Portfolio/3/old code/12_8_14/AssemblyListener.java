// Generated from Assembly.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblyParser}.
 */
public interface AssemblyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#twoRegArg}.
	 * @param ctx the parse tree
	 */
	void enterTwoRegArg(@NotNull AssemblyParser.TwoRegArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#twoRegArg}.
	 * @param ctx the parse tree
	 */
	void exitTwoRegArg(@NotNull AssemblyParser.TwoRegArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#oneRegImmArg}.
	 * @param ctx the parse tree
	 */
	void enterOneRegImmArg(@NotNull AssemblyParser.OneRegImmArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#oneRegImmArg}.
	 * @param ctx the parse tree
	 */
	void exitOneRegImmArg(@NotNull AssemblyParser.OneRegImmArgContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#threeRegArg}.
	 * @param ctx the parse tree
	 */
	void enterThreeRegArg(@NotNull AssemblyParser.ThreeRegArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#threeRegArg}.
	 * @param ctx the parse tree
	 */
	void exitThreeRegArg(@NotNull AssemblyParser.ThreeRegArgContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#twoRegImmArg}.
	 * @param ctx the parse tree
	 */
	void enterTwoRegImmArg(@NotNull AssemblyParser.TwoRegImmArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#twoRegImmArg}.
	 * @param ctx the parse tree
	 */
	void exitTwoRegImmArg(@NotNull AssemblyParser.TwoRegImmArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(@NotNull AssemblyParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(@NotNull AssemblyParser.RegisterContext ctx);
}