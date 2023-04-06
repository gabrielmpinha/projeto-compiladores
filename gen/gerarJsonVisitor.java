// Generated from C:/Users/gabri/Documents/GitHub/projeto-compiladores\gerarJson.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gerarJsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gerarJsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gerarJsonParser#vetor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVetor(gerarJsonParser.VetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gerarJsonParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(gerarJsonParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link gerarJsonParser#tupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupla(gerarJsonParser.TuplaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(gerarJsonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(gerarJsonParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(gerarJsonParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(gerarJsonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objeto}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(gerarJsonParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gerarJsonParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(gerarJsonParser.JsonContext ctx);
}