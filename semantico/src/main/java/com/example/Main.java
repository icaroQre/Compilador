package com.example;

import com.example.OswaldoParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        OswaldoLexer lexer = new OswaldoLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OswaldoParser parser = new OswaldoParser(tokens);
        ProgramaContext arvore = parser.programa();
        OswaldoSemantico as = new OswaldoSemantico();
        as.visitPrograma(arvore);
        OswaldoSemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
    }
}