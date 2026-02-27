// Generated from D:/University-Universytet/42SI Stvorennja IDE/source/src/RustLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RustLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RustLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(RustLexerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RustLexerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(RustLexerParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(RustLexerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(RustLexerParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(RustLexerParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(RustLexerParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(RustLexerParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(RustLexerParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(RustLexerParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(RustLexerParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(RustLexerParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(RustLexerParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link RustLexerParser#data_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_types(RustLexerParser.Data_typesContext ctx);
}