package com.example;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) throws IOException {

        CharStream cs = CharStreams.fromFileName(args[0]);

        OswaldoLexer lexer = new OswaldoLexer(cs);

        Token token  = null;


        while((token = lexer.nextToken()).getType() != Token.EOF) {
            System.out.println("<"+token.getType() + "," + token.getText() + ">");
        }
    }
}