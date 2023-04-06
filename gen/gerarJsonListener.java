// Generated from C:/Users/gabri/Documents/GitHub/projeto-compiladores\gerarJson.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gerarJsonParser}.
 */
public interface gerarJsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gerarJsonParser#vetor}.
	 * @param ctx the parse tree
	 */
	void enterVetor(gerarJsonParser.VetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gerarJsonParser#vetor}.
	 * @param ctx the parse tree
	 */
	void exitVetor(gerarJsonParser.VetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gerarJsonParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(gerarJsonParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link gerarJsonParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(gerarJsonParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link gerarJsonParser#tupla}.
	 * @param ctx the parse tree
	 */
	void enterTupla(gerarJsonParser.TuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gerarJsonParser#tupla}.
	 * @param ctx the parse tree
	 */
	void exitTupla(gerarJsonParser.TuplaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString(gerarJsonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString(gerarJsonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(gerarJsonParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(gerarJsonParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBool(gerarJsonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBool(gerarJsonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArray(gerarJsonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArray(gerarJsonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objeto}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(gerarJsonParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objeto}
	 * labeled alternative in {@link gerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(gerarJsonParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gerarJsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(gerarJsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link gerarJsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(gerarJsonParser.JsonContext ctx);
}