// Generated from GerarJson.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GerarJsonParser}.
 */
public interface GerarJsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString(GerarJsonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString(GerarJsonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(GerarJsonParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(GerarJsonParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBool(GerarJsonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBool(GerarJsonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArray(GerarJsonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArray(GerarJsonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code obj}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterObj(GerarJsonParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code obj}
	 * labeled alternative in {@link GerarJsonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitObj(GerarJsonParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link GerarJsonParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(GerarJsonParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link GerarJsonParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(GerarJsonParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link GerarJsonParser#vetor}.
	 * @param ctx the parse tree
	 */
	void enterVetor(GerarJsonParser.VetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GerarJsonParser#vetor}.
	 * @param ctx the parse tree
	 */
	void exitVetor(GerarJsonParser.VetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GerarJsonParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(GerarJsonParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GerarJsonParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(GerarJsonParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GerarJsonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GerarJsonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GerarJsonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GerarJsonParser.ProgramContext ctx);
}