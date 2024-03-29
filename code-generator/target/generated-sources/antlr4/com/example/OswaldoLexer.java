// Generated from java-escape by ANTLR 4.11.1
package com.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OswaldoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TIPO_VAR=17, 
		NUMINT=18, NUMREAL=19, CADEIA=20, STRING=21, OP_ARIT1=22, OP_ARIT2=23, 
		OP_REL=24, OP_BOOL=25, VARIAVEL=26, BOOLEANO=27, COMENTARIO=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "TIPO_VAR", 
			"NUMINT", "NUMREAL", "CADEIA", "STRING", "ESC_SEQ", "OP_ARIT1", "OP_ARIT2", 
			"OP_REL", "OP_BOOL", "VARIAVEL", "BOOLEANO", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'DECLARACOES'", "'ALGORITMO'", "'('", "')'", "'ATRIBUIR'", 
			"'A'", "'LER'", "'IMPRIMIR'", "'SE'", "'ENTAO'", "'SENAO'", "'ENQUANTO'", 
			"'INICIO'", "'FIM'", "'PLANEJE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TIPO_VAR", "NUMINT", "NUMREAL", "CADEIA", 
			"STRING", "OP_ARIT1", "OP_ARIT2", "OP_REL", "OP_BOOL", "VARIAVEL", "BOOLEANO", 
			"COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public OswaldoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Oswaldo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001d\u011c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00b6\b\u0010\u0001\u0011\u0004\u0011\u00b9\b\u0011"+
		"\u000b\u0011\f\u0011\u00ba\u0001\u0012\u0004\u0012\u00be\b\u0012\u000b"+
		"\u0012\f\u0012\u00bf\u0001\u0012\u0001\u0012\u0004\u0012\u00c4\b\u0012"+
		"\u000b\u0012\f\u0012\u00c5\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00cb\b\u0013\n\u0013\f\u0013\u00ce\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00d5\b\u0014\n\u0014\f\u0014"+
		"\u00d8\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00ec\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00f1\b\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u00f5\b"+
		"\u001a\n\u001a\f\u001a\u00f8\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0109\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u010d\b"+
		"\u001c\n\u001c\f\u001c\u0110\t\u001c\u0001\u001c\u0003\u001c\u0113\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0000-\u0016/\u00171\u00183\u00195\u001a"+
		"7\u001b9\u001c;\u001d\u0001\u0000\u0007\u0002\u0000\'\'\\\\\u0002\u0000"+
		"++--\u0002\u0000**//\u0002\u0000AZaz\u0003\u000009AZaz\u0002\u0000\n\n"+
		"\r\r\u0003\u0000\t\n\r\r  \u012e\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001="+
		"\u0001\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005K\u0001\u0000"+
		"\u0000\u0000\u0007U\u0001\u0000\u0000\u0000\tW\u0001\u0000\u0000\u0000"+
		"\u000bY\u0001\u0000\u0000\u0000\rb\u0001\u0000\u0000\u0000\u000fd\u0001"+
		"\u0000\u0000\u0000\u0011h\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000"+
		"\u0000\u0015t\u0001\u0000\u0000\u0000\u0017z\u0001\u0000\u0000\u0000\u0019"+
		"\u0080\u0001\u0000\u0000\u0000\u001b\u0089\u0001\u0000\u0000\u0000\u001d"+
		"\u0090\u0001\u0000\u0000\u0000\u001f\u0094\u0001\u0000\u0000\u0000!\u00b5"+
		"\u0001\u0000\u0000\u0000#\u00b8\u0001\u0000\u0000\u0000%\u00bd\u0001\u0000"+
		"\u0000\u0000\'\u00c7\u0001\u0000\u0000\u0000)\u00d1\u0001\u0000\u0000"+
		"\u0000+\u00db\u0001\u0000\u0000\u0000-\u00de\u0001\u0000\u0000\u0000/"+
		"\u00e0\u0001\u0000\u0000\u00001\u00eb\u0001\u0000\u0000\u00003\u00f0\u0001"+
		"\u0000\u0000\u00005\u00f2\u0001\u0000\u0000\u00007\u0108\u0001\u0000\u0000"+
		"\u00009\u010a\u0001\u0000\u0000\u0000;\u0118\u0001\u0000\u0000\u0000="+
		">\u0005:\u0000\u0000>\u0002\u0001\u0000\u0000\u0000?@\u0005D\u0000\u0000"+
		"@A\u0005E\u0000\u0000AB\u0005C\u0000\u0000BC\u0005L\u0000\u0000CD\u0005"+
		"A\u0000\u0000DE\u0005R\u0000\u0000EF\u0005A\u0000\u0000FG\u0005C\u0000"+
		"\u0000GH\u0005O\u0000\u0000HI\u0005E\u0000\u0000IJ\u0005S\u0000\u0000"+
		"J\u0004\u0001\u0000\u0000\u0000KL\u0005A\u0000\u0000LM\u0005L\u0000\u0000"+
		"MN\u0005G\u0000\u0000NO\u0005O\u0000\u0000OP\u0005R\u0000\u0000PQ\u0005"+
		"I\u0000\u0000QR\u0005T\u0000\u0000RS\u0005M\u0000\u0000ST\u0005O\u0000"+
		"\u0000T\u0006\u0001\u0000\u0000\u0000UV\u0005(\u0000\u0000V\b\u0001\u0000"+
		"\u0000\u0000WX\u0005)\u0000\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005A"+
		"\u0000\u0000Z[\u0005T\u0000\u0000[\\\u0005R\u0000\u0000\\]\u0005I\u0000"+
		"\u0000]^\u0005B\u0000\u0000^_\u0005U\u0000\u0000_`\u0005I\u0000\u0000"+
		"`a\u0005R\u0000\u0000a\f\u0001\u0000\u0000\u0000bc\u0005A\u0000\u0000"+
		"c\u000e\u0001\u0000\u0000\u0000de\u0005L\u0000\u0000ef\u0005E\u0000\u0000"+
		"fg\u0005R\u0000\u0000g\u0010\u0001\u0000\u0000\u0000hi\u0005I\u0000\u0000"+
		"ij\u0005M\u0000\u0000jk\u0005P\u0000\u0000kl\u0005R\u0000\u0000lm\u0005"+
		"I\u0000\u0000mn\u0005M\u0000\u0000no\u0005I\u0000\u0000op\u0005R\u0000"+
		"\u0000p\u0012\u0001\u0000\u0000\u0000qr\u0005S\u0000\u0000rs\u0005E\u0000"+
		"\u0000s\u0014\u0001\u0000\u0000\u0000tu\u0005E\u0000\u0000uv\u0005N\u0000"+
		"\u0000vw\u0005T\u0000\u0000wx\u0005A\u0000\u0000xy\u0005O\u0000\u0000"+
		"y\u0016\u0001\u0000\u0000\u0000z{\u0005S\u0000\u0000{|\u0005E\u0000\u0000"+
		"|}\u0005N\u0000\u0000}~\u0005A\u0000\u0000~\u007f\u0005O\u0000\u0000\u007f"+
		"\u0018\u0001\u0000\u0000\u0000\u0080\u0081\u0005E\u0000\u0000\u0081\u0082"+
		"\u0005N\u0000\u0000\u0082\u0083\u0005Q\u0000\u0000\u0083\u0084\u0005U"+
		"\u0000\u0000\u0084\u0085\u0005A\u0000\u0000\u0085\u0086\u0005N\u0000\u0000"+
		"\u0086\u0087\u0005T\u0000\u0000\u0087\u0088\u0005O\u0000\u0000\u0088\u001a"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005I\u0000\u0000\u008a\u008b\u0005"+
		"N\u0000\u0000\u008b\u008c\u0005I\u0000\u0000\u008c\u008d\u0005C\u0000"+
		"\u0000\u008d\u008e\u0005I\u0000\u0000\u008e\u008f\u0005O\u0000\u0000\u008f"+
		"\u001c\u0001\u0000\u0000\u0000\u0090\u0091\u0005F\u0000\u0000\u0091\u0092"+
		"\u0005I\u0000\u0000\u0092\u0093\u0005M\u0000\u0000\u0093\u001e\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005P\u0000\u0000\u0095\u0096\u0005L\u0000\u0000"+
		"\u0096\u0097\u0005A\u0000\u0000\u0097\u0098\u0005N\u0000\u0000\u0098\u0099"+
		"\u0005E\u0000\u0000\u0099\u009a\u0005J\u0000\u0000\u009a\u009b\u0005E"+
		"\u0000\u0000\u009b \u0001\u0000\u0000\u0000\u009c\u009d\u0005I\u0000\u0000"+
		"\u009d\u009e\u0005N\u0000\u0000\u009e\u009f\u0005T\u0000\u0000\u009f\u00a0"+
		"\u0005E\u0000\u0000\u00a0\u00a1\u0005I\u0000\u0000\u00a1\u00a2\u0005R"+
		"\u0000\u0000\u00a2\u00b6\u0005O\u0000\u0000\u00a3\u00a4\u0005R\u0000\u0000"+
		"\u00a4\u00a5\u0005E\u0000\u0000\u00a5\u00a6\u0005A\u0000\u0000\u00a6\u00b6"+
		"\u0005L\u0000\u0000\u00a7\u00a8\u0005S\u0000\u0000\u00a8\u00a9\u0005T"+
		"\u0000\u0000\u00a9\u00aa\u0005R\u0000\u0000\u00aa\u00ab\u0005I\u0000\u0000"+
		"\u00ab\u00ac\u0005N\u0000\u0000\u00ac\u00b6\u0005G\u0000\u0000\u00ad\u00ae"+
		"\u0005B\u0000\u0000\u00ae\u00af\u0005O\u0000\u0000\u00af\u00b0\u0005O"+
		"\u0000\u0000\u00b0\u00b1\u0005L\u0000\u0000\u00b1\u00b2\u0005E\u0000\u0000"+
		"\u00b2\u00b3\u0005A\u0000\u0000\u00b3\u00b4\u0005N\u0000\u0000\u00b4\u00b6"+
		"\u0005O\u0000\u0000\u00b5\u009c\u0001\u0000\u0000\u0000\u00b5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b6\"\u0001\u0000\u0000\u0000\u00b7\u00b9\u00020"+
		"9\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb$\u0001\u0000\u0000\u0000\u00bc\u00be\u000209\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005.\u0000\u0000\u00c2\u00c4"+
		"\u000209\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6&\u0001\u0000\u0000\u0000\u00c7\u00cc\u0005\'\u0000"+
		"\u0000\u00c8\u00cb\u0003+\u0015\u0000\u00c9\u00cb\b\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\'\u0000\u0000\u00d0"+
		"(\u0001\u0000\u0000\u0000\u00d1\u00d6\u0005\'\u0000\u0000\u00d2\u00d5"+
		"\u0003+\u0015\u0000\u00d3\u00d5\b\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\'\u0000\u0000\u00da*\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\\\u0000\u0000\u00dc\u00dd\u0005\'\u0000"+
		"\u0000\u00dd,\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0001\u0000\u0000"+
		"\u00df.\u0001\u0000\u0000\u0000\u00e0\u00e1\u0007\u0002\u0000\u0000\u00e1"+
		"0\u0001\u0000\u0000\u0000\u00e2\u00ec\u0005>\u0000\u0000\u00e3\u00e4\u0005"+
		">\u0000\u0000\u00e4\u00ec\u0005=\u0000\u0000\u00e5\u00ec\u0005<\u0000"+
		"\u0000\u00e6\u00e7\u0005<\u0000\u0000\u00e7\u00ec\u0005=\u0000\u0000\u00e8"+
		"\u00e9\u0005<\u0000\u0000\u00e9\u00ec\u0005>\u0000\u0000\u00ea\u00ec\u0005"+
		"=\u0000\u0000\u00eb\u00e2\u0001\u0000\u0000\u0000\u00eb\u00e3\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec2\u0001\u0000\u0000\u0000\u00ed\u00f1\u0005E\u0000\u0000"+
		"\u00ee\u00ef\u0005O\u0000\u0000\u00ef\u00f1\u0005U\u0000\u0000\u00f0\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f14\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f6\u0007\u0003\u0000\u0000\u00f3\u00f5\u0007"+
		"\u0004\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f76\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005V\u0000\u0000\u00fa\u00fb\u0005E\u0000\u0000"+
		"\u00fb\u00fc\u0005R\u0000\u0000\u00fc\u00fd\u0005D\u0000\u0000\u00fd\u00fe"+
		"\u0005A\u0000\u0000\u00fe\u00ff\u0005D\u0000\u0000\u00ff\u0100\u0005E"+
		"\u0000\u0000\u0100\u0101\u0005I\u0000\u0000\u0101\u0102\u0005R\u0000\u0000"+
		"\u0102\u0109\u0005O\u0000\u0000\u0103\u0104\u0005F\u0000\u0000\u0104\u0105"+
		"\u0005A\u0000\u0000\u0105\u0106\u0005L\u0000\u0000\u0106\u0107\u0005S"+
		"\u0000\u0000\u0107\u0109\u0005O\u0000\u0000\u0108\u00f9\u0001\u0000\u0000"+
		"\u0000\u0108\u0103\u0001\u0000\u0000\u0000\u01098\u0001\u0000\u0000\u0000"+
		"\u010a\u010e\u0005%\u0000\u0000\u010b\u010d\b\u0005\u0000\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111"+
		"\u0113\u0005\r\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005\n\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0006"+
		"\u001c\u0000\u0000\u0117:\u0001\u0000\u0000\u0000\u0118\u0119\u0007\u0006"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0006\u001d"+
		"\u0000\u0000\u011b<\u0001\u0000\u0000\u0000\u000f\u0000\u00b5\u00ba\u00bf"+
		"\u00c5\u00ca\u00cc\u00d4\u00d6\u00eb\u00f0\u00f6\u0108\u010e\u0112\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}