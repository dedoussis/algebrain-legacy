// Generated from Expr.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INT=15, POW=16, MUL=17, 
		DIV=18, ADD=19, SUB=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "ID", "INT", "POW", "MUL", "DIV", "ADD", 
		"SUB", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "' if '", "'('", "')'", "'$'", "','", "'AND'", "'OR'", "'=='", 
		"'TRUE'", "'FALSE'", "'depends('", "'is_const('", null, null, "'^'", "'*'", 
		"'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "INT", "POW", "MUL", "DIV", "ADD", "SUB", "NEWLINE", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\6\17h\n\17\r\17\16\17i\3\20\6\20m\n\20\r\20\16\20n"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26|\n\26\3\26"+
		"\3\26\3\27\6\27\u0081\n\27\r\27\16\27\u0082\3\27\3\27\2\2\30\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\2\u0089"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2"+
		"\2\5\61\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2"+
		"\2\2\21B\3\2\2\2\23E\3\2\2\2\25H\3\2\2\2\27M\3\2\2\2\31S\3\2\2\2\33\\"+
		"\3\2\2\2\35g\3\2\2\2\37l\3\2\2\2!p\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'v\3\2"+
		"\2\2)x\3\2\2\2+{\3\2\2\2-\u0080\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62"+
		"\7\"\2\2\62\63\7k\2\2\63\64\7h\2\2\64\65\7\"\2\2\65\6\3\2\2\2\66\67\7"+
		"*\2\2\67\b\3\2\2\289\7+\2\29\n\3\2\2\2:;\7&\2\2;\f\3\2\2\2<=\7.\2\2=\16"+
		"\3\2\2\2>?\7C\2\2?@\7P\2\2@A\7F\2\2A\20\3\2\2\2BC\7Q\2\2CD\7T\2\2D\22"+
		"\3\2\2\2EF\7?\2\2FG\7?\2\2G\24\3\2\2\2HI\7V\2\2IJ\7T\2\2JK\7W\2\2KL\7"+
		"G\2\2L\26\3\2\2\2MN\7H\2\2NO\7C\2\2OP\7N\2\2PQ\7U\2\2QR\7G\2\2R\30\3\2"+
		"\2\2ST\7f\2\2TU\7g\2\2UV\7r\2\2VW\7g\2\2WX\7p\2\2XY\7f\2\2YZ\7u\2\2Z["+
		"\7*\2\2[\32\3\2\2\2\\]\7k\2\2]^\7u\2\2^_\7a\2\2_`\7e\2\2`a\7q\2\2ab\7"+
		"p\2\2bc\7u\2\2cd\7v\2\2de\7*\2\2e\34\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2j\36\3\2\2\2km\t\3\2\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o \3\2\2\2pq\7`\2\2q\"\3\2\2\2rs\7,\2\2s$\3\2\2\2tu\7"+
		"\61\2\2u&\3\2\2\2vw\7-\2\2w(\3\2\2\2xy\7/\2\2y*\3\2\2\2z|\7\17\2\2{z\3"+
		"\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\f\2\2~,\3\2\2\2\177\u0081\t\4\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\b\27\2\2\u0085.\3\2\2\2\7\2in{\u0082"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}