// Generated from Expr.g4 by ANTLR 4.7.1
package common.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		INT=10, POW=11, MUL=12, DIV=13, PLUS=14, MINUS=15, DOLLAR=16, LPARENS=17, 
		RPARENS=18, COMMA=19, EQUALS=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
		"INT", "POW", "MUL", "DIV", "PLUS", "MINUS", "DOLLAR", "LPARENS", "RPARENS", 
		"COMMA", "EQUALS", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' if '", "'AND'", "'OR'", "'=='", "'TRUE'", "'FALSE'", "'depends'", 
		"'is_const'", null, null, "'^'", "'*'", "'/'", "'+'", "'-'", "'$'", "'('", 
		"')'", "','", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ID", "INT", "POW", 
		"MUL", "DIV", "PLUS", "MINUS", "DOLLAR", "LPARENS", "RPARENS", "COMMA", 
		"EQUALS", "NEWLINE", "WS"
	};
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\6\n\\\n\n\r\n\16\n]\3\13\6\13a\n\13\r\13\16\13"+
		"b\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26z\n\26\3\26\3\26\3\27\6\27\177\n"+
		"\27\r\27\16\27\u0080\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\78\3\2"+
		"\2\2\t;\3\2\2\2\13>\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21Q\3\2\2\2\23[\3\2"+
		"\2\2\25`\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3"+
		"\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+y\3\2\2\2-~"+
		"\3\2\2\2/\60\7\"\2\2\60\61\7k\2\2\61\62\7h\2\2\62\63\7\"\2\2\63\4\3\2"+
		"\2\2\64\65\7C\2\2\65\66\7P\2\2\66\67\7F\2\2\67\6\3\2\2\289\7Q\2\29:\7"+
		"T\2\2:\b\3\2\2\2;<\7?\2\2<=\7?\2\2=\n\3\2\2\2>?\7V\2\2?@\7T\2\2@A\7W\2"+
		"\2AB\7G\2\2B\f\3\2\2\2CD\7H\2\2DE\7C\2\2EF\7N\2\2FG\7U\2\2GH\7G\2\2H\16"+
		"\3\2\2\2IJ\7f\2\2JK\7g\2\2KL\7r\2\2LM\7g\2\2MN\7p\2\2NO\7f\2\2OP\7u\2"+
		"\2P\20\3\2\2\2QR\7k\2\2RS\7u\2\2ST\7a\2\2TU\7e\2\2UV\7q\2\2VW\7p\2\2W"+
		"X\7u\2\2XY\7v\2\2Y\22\3\2\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^\24\3\2\2\2_a\t\3\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2c\26\3\2\2\2de\7`\2\2e\30\3\2\2\2fg\7,\2\2g\32\3\2\2\2hi\7\61\2\2"+
		"i\34\3\2\2\2jk\7-\2\2k\36\3\2\2\2lm\7/\2\2m \3\2\2\2no\7&\2\2o\"\3\2\2"+
		"\2pq\7*\2\2q$\3\2\2\2rs\7+\2\2s&\3\2\2\2tu\7.\2\2u(\3\2\2\2vw\7?\2\2w"+
		"*\3\2\2\2xz\7\17\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\f\2\2|,\3\2\2\2"+
		"}\177\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\27\2\2\u0083.\3\2\2\2\7\2]by"+
		"\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}