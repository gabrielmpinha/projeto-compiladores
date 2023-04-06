// Generated from C:/Users/gabri/Documents/GitHub/projeto-compiladores\gerarJson.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gerarJsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, STRING=8, BOOL=9, 
		SKP=10;
	public static final int
		RULE_vetor = 0, RULE_obj = 1, RULE_tupla = 2, RULE_exp = 3, RULE_json = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"vetor", "obj", "tupla", "exp", "json"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'{'", "'}'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INT", "STRING", "BOOL", "SKP"
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

	@Override
	public String getGrammarFileName() { return "gerarJson.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gerarJsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VetorContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public VetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterVetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitVetor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitVetor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VetorContext vetor() throws RecognitionException {
		VetorContext _localctx = new VetorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vetor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case INT:
			case STRING:
			case BOOL:
				{
				setState(16);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(11);
						exp();
						setState(12);
						match(T__1);
						}
						} 
					}
					setState(18);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(19);
				exp();
				}
				break;
			case T__2:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(23);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public List<TuplaContext> tupla() {
			return getRuleContexts(TuplaContext.class);
		}
		public TuplaContext tupla(int i) {
			return getRuleContext(TuplaContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__3);
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(26);
						tupla();
						setState(27);
						match(T__1);
						}
						} 
					}
					setState(33);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(34);
				tupla();
				}
				break;
			case T__4:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(38);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TuplaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gerarJsonParser.STRING, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitTupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitTupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplaContext tupla() throws RecognitionException {
		TuplaContext _localctx = new TuplaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(STRING);
			setState(41);
			match(T__5);
			setState(42);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpContext {
		public TerminalNode STRING() { return getToken(gerarJsonParser.STRING, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(gerarJsonParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ExpContext {
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public ArrayContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjetoContext extends ExpContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ObjetoContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExpContext {
		public TerminalNode INT() { return getToken(gerarJsonParser.INT, 0); }
		public IntContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(INT);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(BOOL);
				}
				break;
			case T__0:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				vetor();
				}
				break;
			case T__3:
				_localctx = new ObjetoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				obj();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gerarJsonListener ) ((gerarJsonListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gerarJsonVisitor ) return ((gerarJsonVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_json);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				vetor();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				obj();
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

	public static final String _serializedATN =
		"\u0004\u0001\n8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000\n"+
		"\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0016"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u00046\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0000;\u0000\n\u0001\u0000\u0000\u0000\u0002\u0019\u0001"+
		"\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000"+
		"\u0000\b5\u0001\u0000\u0000\u0000\n\u0015\u0005\u0001\u0000\u0000\u000b"+
		"\f\u0003\u0006\u0003\u0000\f\r\u0005\u0002\u0000\u0000\r\u000f\u0001\u0000"+
		"\u0000\u0000\u000e\u000b\u0001\u0000\u0000\u0000\u000f\u0012\u0001\u0000"+
		"\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000"+
		"\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0013\u0016\u0003\u0006\u0003\u0000\u0014\u0016\u0001\u0000"+
		"\u0000\u0000\u0015\u0010\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0003"+
		"\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019$\u0005\u0004\u0000"+
		"\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b\u001c\u0005\u0002\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"%\u0003\u0004\u0002\u0000#%\u0001\u0000\u0000\u0000"+
		"$\u001f\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0005\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000"+
		"()\u0005\b\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0003\u0006\u0003\u0000"+
		"+\u0005\u0001\u0000\u0000\u0000,2\u0005\b\u0000\u0000-2\u0005\u0007\u0000"+
		"\u0000.2\u0005\t\u0000\u0000/2\u0003\u0000\u0000\u000002\u0003\u0002\u0001"+
		"\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0007"+
		"\u0001\u0000\u0000\u000036\u0003\u0000\u0000\u000046\u0003\u0002\u0001"+
		"\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\t\u0001\u0000"+
		"\u0000\u0000\u0006\u0010\u0015\u001f$15";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}