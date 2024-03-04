package com.example;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class OswaldoSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Erro %d:%d - %s", linha, coluna, mensagem));
    }
    
    public static TabelaDeSimbolos.TipoOswaldo verificarTipo(TabelaDeSimbolos tabela, OswaldoParser.ExpressaoAritmeticaContext ctx) {
        TabelaDeSimbolos.TipoOswaldo ret = null;
        for (var ta : ctx.termoAritmetico()) {
            TabelaDeSimbolos.TipoOswaldo aux = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoOswaldo.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoOswaldo.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoOswaldo verificarTipo(TabelaDeSimbolos tabela, OswaldoParser.TermoAritmeticoContext ctx) {
        TabelaDeSimbolos.TipoOswaldo ret = null;

        for (var fa : ctx.fatorAritmetico()) {
            TabelaDeSimbolos.TipoOswaldo aux = verificarTipo(tabela, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoOswaldo.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoOswaldo.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoOswaldo verificarTipo(TabelaDeSimbolos tabela, OswaldoParser.FatorAritmeticoContext ctx) {
        if (ctx.NUMINT() != null) {
            return TabelaDeSimbolos.TipoOswaldo.INTEIRO;
        }
        if (ctx.NUMREAL() != null) {
            return TabelaDeSimbolos.TipoOswaldo.REAL;
        }
        if (ctx.VARIAVEL() != null) {
            String nomeVar = ctx.VARIAVEL().getText();
            if (!tabela.existe(nomeVar)) {
                adicionarErroSemantico(ctx.VARIAVEL().getSymbol(), "Variável " + nomeVar + " não foi declarada antes do uso");
                return TabelaDeSimbolos.TipoOswaldo.INVALIDO;
            }
            return verificarTipo(tabela, nomeVar);
        }
        // se não for nenhum dos tipos acima, só pode ser uma expressão
        // entre parêntesis
        return verificarTipo(tabela, ctx.expressaoAritmetica());
    }
    
    public static TabelaDeSimbolos.TipoOswaldo verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}