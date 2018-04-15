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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, POW=10, 
		MUL=11, DIV=12, PLUS=13, MINUS=14, DOLLAR=15, LPARENS=16, RPARENS=17, 
		COMMA=18, EQUALS=19, NEWLINE=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "INT", "POW", 
		"MUL", "DIV", "PLUS", "MINUS", "DOLLAR", "LPARENS", "RPARENS", "COMMA", 
		"EQUALS", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' if '", "'AND'", "'OR'", "'TRUE'", "'FALSE'", "'depends'", "'is_const'", 
		null, null, "'^'", "'*'", "'/'", "'+'", "'-'", "'$'", "'('", "')'", "','", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "INT", "POW", "MUL", 
		"DIV", "PLUS", "MINUS", "DOLLAR", "LPARENS", "RPARENS", "COMMA", "EQUALS", 
		"NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\tW"+
		"\n\t\r\t\16\tX\3\n\6\n\\\n\n\r\n\16\n]\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\5\25u\n\25\3\25\3\25\3\26\6\26z\n\26\r\26\16\26{\3\26\3\26\2\2\27\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\2\u0082"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\62\3\2"+
		"\2\2\7\66\3\2\2\2\t9\3\2\2\2\13>\3\2\2\2\rD\3\2\2\2\17L\3\2\2\2\21V\3"+
		"\2\2\2\23[\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35"+
		"g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)t\3\2\2"+
		"\2+y\3\2\2\2-.\7\"\2\2./\7k\2\2/\60\7h\2\2\60\61\7\"\2\2\61\4\3\2\2\2"+
		"\62\63\7C\2\2\63\64\7P\2\2\64\65\7F\2\2\65\6\3\2\2\2\66\67\7Q\2\2\678"+
		"\7T\2\28\b\3\2\2\29:\7V\2\2:;\7T\2\2;<\7W\2\2<=\7G\2\2=\n\3\2\2\2>?\7"+
		"H\2\2?@\7C\2\2@A\7N\2\2AB\7U\2\2BC\7G\2\2C\f\3\2\2\2DE\7f\2\2EF\7g\2\2"+
		"FG\7r\2\2GH\7g\2\2HI\7p\2\2IJ\7f\2\2JK\7u\2\2K\16\3\2\2\2LM\7k\2\2MN\7"+
		"u\2\2NO\7a\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7u\2\2ST\7v\2\2T\20\3\2\2"+
		"\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\22\3\2\2\2Z\\\t"+
		"\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\24\3\2\2\2_`\7`\2\2`"+
		"\26\3\2\2\2ab\7,\2\2b\30\3\2\2\2cd\7\61\2\2d\32\3\2\2\2ef\7-\2\2f\34\3"+
		"\2\2\2gh\7/\2\2h\36\3\2\2\2ij\7&\2\2j \3\2\2\2kl\7*\2\2l\"\3\2\2\2mn\7"+
		"+\2\2n$\3\2\2\2op\7.\2\2p&\3\2\2\2qr\7?\2\2r(\3\2\2\2su\7\17\2\2ts\3\2"+
		"\2\2tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2w*\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\26\2\2~,\3\2\2\2\7\2X]t{\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}