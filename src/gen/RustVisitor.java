package gen;// Generated from D:/University-Universytet/42SI Stvorennja IDE/source/src/Rust.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RustParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RustVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RustParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(RustParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RustParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(RustParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(RustParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(RustParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(RustParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(RustParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(RustParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(RustParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(RustParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(RustParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(RustParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(RustParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustParser#data_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_types(RustParser.Data_typesContext ctx);
}