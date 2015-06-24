// Generated from Assembly.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblyParser}.
 */
public interface AssemblyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#rtype}.
	 * @param ctx the parse tree
	 */
	void enterRtype(@NotNull AssemblyParser.RtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#rtype}.
	 * @param ctx the parse tree
	 */
	void exitRtype(@NotNull AssemblyParser.RtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(@NotNull AssemblyParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(@NotNull AssemblyParser.ImmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull AssemblyParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull AssemblyParser.InstructionContext ctx);
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
	 * Enter a parse tree produced by {@link AssemblyParser#itype}.
	 * @param ctx the parse tree
	 */
	void enterItype(@NotNull AssemblyParser.ItypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#itype}.
	 * @param ctx the parse tree
	 */
	void exitItype(@NotNull AssemblyParser.ItypeContext ctx);
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