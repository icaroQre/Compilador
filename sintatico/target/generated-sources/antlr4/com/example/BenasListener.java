// Generated from com/example/Benas.g4 by ANTLR 4.13.1
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BenasParser}.
 */
public interface BenasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BenasParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(BenasParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(BenasParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(BenasParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(BenasParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(BenasParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(BenasParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(BenasParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(BenasParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(BenasParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(BenasParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(BenasParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(BenasParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(BenasParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(BenasParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(BenasParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(BenasParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(BenasParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(BenasParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(BenasParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(BenasParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(BenasParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(BenasParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(BenasParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(BenasParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(BenasParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(BenasParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(BenasParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(BenasParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(BenasParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(BenasParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenasParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(BenasParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenasParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(BenasParser.SubAlgoritmoContext ctx);
}