// Generated from C:/Users/gabri/Documents/GitHub/projeto-compiladores\GerarJson.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GerarJsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GerarJsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GerarJsonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(GerarJsonParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GerarJsonParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GerarJsonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code obj}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(GerarJsonParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link GerarJsonParser#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(GerarJsonParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link GerarJsonParser#vetor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVetor(GerarJsonParser.VetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GerarJsonParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(GerarJsonParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GerarJsonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GerarJsonParser.ProgramContext ctx);
}