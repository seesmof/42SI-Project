// Generated from D:/University-Universytet/42SI Stvorennja IDE/source/src/RustLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RustLexerParser}.
 */
public interface RustLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(RustLexerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(RustLexerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RustLexerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RustLexerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(RustLexerParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(RustLexerParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(RustLexerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(RustLexerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(RustLexerParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(RustLexerParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(RustLexerParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(RustLexerParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(RustLexerParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(RustLexerParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(RustLexerParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(RustLexerParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(RustLexerParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(RustLexerParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RustLexerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RustLexerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(RustLexerParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(RustLexerParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(RustLexerParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(RustLexerParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(RustLexerParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(RustLexerParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustLexerParser#data_types}.
	 * @param ctx the parse tree
	 */
	void enterData_types(RustLexerParser.Data_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustLexerParser#data_types}.
	 * @param ctx the parse tree
	 */
	void exitData_types(RustLexerParser.Data_typesContext ctx);
}