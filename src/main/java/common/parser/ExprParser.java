// Generated from Expr.g4 by ANTLR 4.7.1
package common.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INT=15, POW=16, MUL=17, 
		DIV=18, ADD=19, SUB=20, NEWLINE=21, WS=22;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_bexp = 3;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "bexp"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ID) | (1L << INT) | (1L << SUB) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case ID:
			case INT:
			case SUB:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				expr(0);
				setState(14);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNumUnaryContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public VarNumUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVarNumUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RuleContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public RuleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnaryContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DollarContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public DollarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RuleOpeContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public RuleOpeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRuleOpe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(20);
				match(T__2);
				setState(21);
				expr(0);
				setState(22);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new DollarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__4);
				setState(25);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new VarNumUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(SUB);
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(SUB);
				setState(29);
				expr(4);
				}
				break;
			case 5:
				{
				_localctx = new RuleOpeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				((RuleOpeContext)_localctx).op = match(ID);
				setState(31);
				match(T__2);
				setState(32);
				expr(0);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					{
					setState(33);
					match(T__5);
					}
					setState(34);
					expr(0);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(47);
						((PowContext)_localctx).op = match(POW);
						setState(48);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(50);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(51);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(52);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(53);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(54);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new RuleContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(56);
						match(T__0);
						setState(57);
						expr(0);
						setState(60);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(58);
							match(T__1);
							setState(59);
							bexp(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BexpContext extends ParserRuleContext {
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
	 
		public BexpContext() { }
		public void copyFrom(BexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TruefalseContext extends BexpContext {
		public TruefalseContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTruefalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndorContext extends BexpContext {
		public Token op;
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public AndorContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAndor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpcondContext extends BexpContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public OpcondContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOpcond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstContext extends BexpContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DependsContext extends BexpContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DependsContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDepends(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityContext extends BexpContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualityContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		return bexp(0);
	}

	private BexpContext bexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexpContext _localctx = new BexpContext(_ctx, _parentState);
		BexpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_bexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new OpcondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				match(ID);
				setState(69);
				match(T__2);
				setState(70);
				bexp(0);
				setState(71);
				match(T__3);
				}
				break;
			case T__2:
				{
				_localctx = new EqualityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(T__2);
				setState(74);
				expr(0);
				setState(75);
				match(T__8);
				setState(76);
				expr(0);
				setState(77);
				match(T__3);
				}
				break;
			case T__9:
			case T__10:
				{
				_localctx = new TruefalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__11:
				{
				_localctx = new DependsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(T__11);
				setState(81);
				expr(0);
				setState(82);
				match(T__5);
				setState(83);
				expr(0);
				setState(84);
				match(T__3);
				}
				break;
			case T__12:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(T__12);
				setState(87);
				expr(0);
				setState(88);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndorContext(new BexpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bexp);
					setState(92);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(93);
					((AndorContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==T__7) ) {
						((AndorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(94);
					bexp(7);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		//case 3:
		//	return bexp_sempred((BexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean bexp_sempred(BexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\3\3\5\3\24\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4&"+
		"\n\4\f\4\16\4)\13\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\7\4A\n\4\f\4\16\4D\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\7\5b\n\5\f\5\16\5e\13\5\3\5\2\4"+
		"\6\b\6\2\4\6\b\2\7\3\2\20\21\3\2\23\24\3\2\25\26\3\2\f\r\3\2\t\n\2u\2"+
		"\13\3\2\2\2\4\23\3\2\2\2\6.\3\2\2\2\b\\\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2"+
		"\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\20\5\6\4\2\20"+
		"\21\7\27\2\2\21\24\3\2\2\2\22\24\7\27\2\2\23\17\3\2\2\2\23\22\3\2\2\2"+
		"\24\5\3\2\2\2\25\26\b\4\1\2\26\27\7\5\2\2\27\30\5\6\4\2\30\31\7\6\2\2"+
		"\31/\3\2\2\2\32\33\7\7\2\2\33/\7\20\2\2\34\35\7\26\2\2\35/\t\2\2\2\36"+
		"\37\7\26\2\2\37/\5\6\4\6 !\7\20\2\2!\"\7\5\2\2\"\'\5\6\4\2#$\7\b\2\2$"+
		"&\5\6\4\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2"+
		"\2*+\7\6\2\2+/\3\2\2\2,/\7\21\2\2-/\7\20\2\2.\25\3\2\2\2.\32\3\2\2\2."+
		"\34\3\2\2\2.\36\3\2\2\2. \3\2\2\2.,\3\2\2\2.-\3\2\2\2/B\3\2\2\2\60\61"+
		"\f\r\2\2\61\62\7\22\2\2\62A\5\6\4\16\63\64\f\f\2\2\64\65\t\3\2\2\65A\5"+
		"\6\4\r\66\67\f\13\2\2\678\t\4\2\28A\5\6\4\f9:\f\n\2\2:;\7\3\2\2;>\5\6"+
		"\4\2<=\7\4\2\2=?\5\b\5\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@\60\3\2\2\2@\63"+
		"\3\2\2\2@\66\3\2\2\2@9\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2"+
		"\2DB\3\2\2\2EF\b\5\1\2FG\7\20\2\2GH\7\5\2\2HI\5\b\5\2IJ\7\6\2\2J]\3\2"+
		"\2\2KL\7\5\2\2LM\5\6\4\2MN\7\13\2\2NO\5\6\4\2OP\7\6\2\2P]\3\2\2\2Q]\t"+
		"\5\2\2RS\7\16\2\2ST\5\6\4\2TU\7\b\2\2UV\5\6\4\2VW\7\6\2\2W]\3\2\2\2XY"+
		"\7\17\2\2YZ\5\6\4\2Z[\7\6\2\2[]\3\2\2\2\\E\3\2\2\2\\K\3\2\2\2\\Q\3\2\2"+
		"\2\\R\3\2\2\2\\X\3\2\2\2]c\3\2\2\2^_\f\b\2\2_`\t\6\2\2`b\5\b\5\ta^\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\t\3\2\2\2ec\3\2\2\2\13\r\23\'.>@B"+
		"\\c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}