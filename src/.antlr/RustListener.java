// Generated from d:/42SI-Project/src/Rust.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RustParser}.
 */
public interface RustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RustParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(RustParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(RustParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RustParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RustParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(RustParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(RustParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(RustParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(RustParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(RustParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(RustParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(RustParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(RustParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(RustParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(RustParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(RustParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(RustParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(RustParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(RustParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RustParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RustParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(RustParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(RustParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(RustParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(RustParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(RustParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(RustParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#data_types}.
	 * @param ctx the parse tree
	 */
	void enterData_types(RustParser.Data_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#data_types}.
	 * @param ctx the parse tree
	 */
	void exitData_types(RustParser.Data_typesContext ctx);
}