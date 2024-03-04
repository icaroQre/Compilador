// Generated from java-escape by ANTLR 4.11.1
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OswaldoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OswaldoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(OswaldoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(OswaldoParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(OswaldoParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#termoAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmetico(OswaldoParser.TermoAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAritmetico(OswaldoParser.FatorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(OswaldoParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#termoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoRelacional(OswaldoParser.TermoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(OswaldoParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(OswaldoParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#comandoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(OswaldoParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#comandoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(OswaldoParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#comandoCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCondicao(OswaldoParser.ComandoCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(OswaldoParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OswaldoParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAlgoritmo(OswaldoParser.SubAlgoritmoContext ctx);
}