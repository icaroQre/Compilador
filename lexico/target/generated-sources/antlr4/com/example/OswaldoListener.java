// Generated from com/example/Oswaldo.g4 by ANTLR 4.13.1
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OswaldoParser}.
 */
public interface OswaldoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(OswaldoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(OswaldoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(OswaldoParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(OswaldoParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(OswaldoParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(OswaldoParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(OswaldoParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(OswaldoParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(OswaldoParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(OswaldoParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(OswaldoParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(OswaldoParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(OswaldoParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(OswaldoParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(OswaldoParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(OswaldoParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(OswaldoParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(OswaldoParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(OswaldoParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(OswaldoParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(OswaldoParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(OswaldoParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(OswaldoParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(OswaldoParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(OswaldoParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(OswaldoParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(OswaldoParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(OswaldoParser.SubAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link OswaldoParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(OswaldoParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link OswaldoParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(OswaldoParser.FuncContext ctx);
}