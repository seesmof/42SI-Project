// Generated from d:/42SI-Project/src/Rust.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RustParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, SINGLE_COMMENT=2, DOUBLE_COMMENT=3, AS=4, ASYNC=5, AWAIT=6, BREAK=7, 
		CONST=8, CONTINUE=9, CRATE=10, DYN=11, ELSE=12, ENUM=13, EXTERN=14, FALSE=15, 
		FN=16, FOR=17, IF=18, IMPL=19, IN=20, LET=21, LOOP=22, MATCH=23, MOD=24, 
		MOVE=25, MUT=26, PUB=27, REF=28, RETURN=29, SELF=30, STATIC=31, STRUCT=32, 
		SUPER=33, TRAIT=34, TRUE=35, TYPE=36, USE=37, WHERE=38, WHILE=39, BOOL_LIT=40, 
		INT_LIT=41, FLOAT_LIT=42, STRING_LIT=43, ID=44, INTEGER=45, UNSIGNED_INTEGER=46, 
		FLOAT=47, BOOL=48, CHAR=49, STRING=50, LEFT_CURLY_BRACE=51, RIGHT_CURLY_BRACE=52, 
		LEFT_SQUARE_BRACE=53, RIGHT_SQUARE_BRACE=54, LEFT_PARANTHESIS=55, RIGHT_PARANTHESIS=56, 
		EXCLAMATION=57, EXCLAMATORY_EQUAL=58, PERCENT=59, AMPERSAND=60, AMPERSAND_EQUAL=61, 
		AMPERSAND_AMPERSAND=62, STAR=63, STAR_EQUAL=64, PLUS=65, PLUS_EQUAL=66, 
		COMMA=67, DASH=68, DASH_EQUAL=69, RIGHT_ARROW=70, DOT=71, DOT_DOT=72, 
		DOT_DOT_EQUAL=73, DOT_DOT_DOT=74, SLASH=75, SLASH_EQUAL=76, COLON=77, 
		SEMICOLON=78, LEFT_LEFT=79, LEFT_LEFT_EQUAL=80, LEFT=81, LEFT_EQUAL=82, 
		EQUAL=83, EQUAL_EQUAL=84, RIGHT_ARROW_BIG=85, RIGHT=86, RIGHT_EQUAL=87, 
		RIGHT_RIGHT=88, RIGHT_RIGHT_EQUAL=89, AT=90, CARET=91, CARET_EQUAL=92, 
		PIPE=93, PIPE_EQUAL=94, PIPE_PIPE=95, QUESTION=96, UNDERSCORE=97, PATH_SEPARATOR=98, 
		POUND=99, DOLLAR=100, VEC_MACRO=101;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_method = 2, RULE_function = 3, RULE_struct = 4, 
		RULE_if = 5, RULE_else = 6, RULE_if_else = 7, RULE_else_if = 8, RULE_variable = 9, 
		RULE_binding = 10, RULE_vector = 11, RULE_loop = 12, RULE_data_types = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "method", "function", "struct", "if", "else", "if_else", 
			"else_if", "variable", "binding", "vector", "loop", "data_types"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'as'", "'async'", "'await'", "'break'", "'const'", 
			"'continue'", "'crate'", "'dyn'", "'else'", "'enum'", "'extern'", "'false'", 
			"'fn'", "'for'", "'if'", "'impl'", "'in'", "'let'", "'loop'", "'match'", 
			"'mod'", "'move'", "'mut'", "'pub'", "'ref'", "'return'", "'self'", "'static'", 
			"'struct'", "'super'", "'trait'", "'true'", "'type'", "'use'", "'where'", 
			"'while'", null, null, null, null, null, null, null, null, "'bool'", 
			"'char'", null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'!'", "'!='", 
			"'%'", "'&'", "'&='", "'&&'", "'*'", "'*='", "'+'", "'+='", "','", "'-'", 
			"'-='", "'->'", "'.'", "'..'", "'..='", "'...'", "'/'", "'/='", "':'", 
			"';'", "'<<'", "'<<='", "'<'", "'<='", "'='", "'=='", "'=>'", "'>'", 
			"'>='", "'>>'", "'>>='", "'@'", "'^'", "'^='", "'|'", "'|='", "'||'", 
			"'?'", "'_'", "'::'", "'#'", "'$'", "'vec!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "SINGLE_COMMENT", "DOUBLE_COMMENT", "AS", "ASYNC", "AWAIT", 
			"BREAK", "CONST", "CONTINUE", "CRATE", "DYN", "ELSE", "ENUM", "EXTERN", 
			"FALSE", "FN", "FOR", "IF", "IMPL", "IN", "LET", "LOOP", "MATCH", "MOD", 
			"MOVE", "MUT", "PUB", "REF", "RETURN", "SELF", "STATIC", "STRUCT", "SUPER", 
			"TRAIT", "TRUE", "TYPE", "USE", "WHERE", "WHILE", "BOOL_LIT", "INT_LIT", 
			"FLOAT_LIT", "STRING_LIT", "ID", "INTEGER", "UNSIGNED_INTEGER", "FLOAT", 
			"BOOL", "CHAR", "STRING", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_SQUARE_BRACE", 
			"RIGHT_SQUARE_BRACE", "LEFT_PARANTHESIS", "RIGHT_PARANTHESIS", "EXCLAMATION", 
			"EXCLAMATORY_EQUAL", "PERCENT", "AMPERSAND", "AMPERSAND_EQUAL", "AMPERSAND_AMPERSAND", 
			"STAR", "STAR_EQUAL", "PLUS", "PLUS_EQUAL", "COMMA", "DASH", "DASH_EQUAL", 
			"RIGHT_ARROW", "DOT", "DOT_DOT", "DOT_DOT_EQUAL", "DOT_DOT_DOT", "SLASH", 
			"SLASH_EQUAL", "COLON", "SEMICOLON", "LEFT_LEFT", "LEFT_LEFT_EQUAL", 
			"LEFT", "LEFT_EQUAL", "EQUAL", "EQUAL_EQUAL", "RIGHT_ARROW_BIG", "RIGHT", 
			"RIGHT_EQUAL", "RIGHT_RIGHT", "RIGHT_RIGHT_EQUAL", "AT", "CARET", "CARET_EQUAL", 
			"PIPE", "PIPE_EQUAL", "PIPE_PIPE", "QUESTION", "UNDERSCORE", "PATH_SEPARATOR", 
			"POUND", "DOLLAR", "VEC_MACRO"
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
	public String getGrammarFileName() { return "Rust.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RustParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				else_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				struct();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				method();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				if_else();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				else_if();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(35);
				function();
				}
				break;
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(RustParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(RustParser.RIGHT_CURLY_BRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(LEFT_CURLY_BRACE);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(39);
					matchWildcard();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(45);
			match(RIGHT_CURLY_BRACE);
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
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(RustParser.FN, 0); }
		public List<TerminalNode> ID() { return getTokens(RustParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RustParser.ID, i);
		}
		public TerminalNode LEFT_PARANTHESIS() { return getToken(RustParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(RustParser.RIGHT_PARANTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RIGHT_ARROW() { return getToken(RustParser.RIGHT_ARROW, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(FN);
			setState(48);
			match(ID);
			setState(49);
			match(LEFT_PARANTHESIS);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(50);
					matchWildcard();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(56);
			match(RIGHT_PARANTHESIS);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHT_ARROW) {
				{
				setState(57);
				match(RIGHT_ARROW);
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(60);
				match(ID);
				}
			}

			setState(63);
			block();
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(RustParser.FN, 0); }
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public TerminalNode LEFT_PARANTHESIS() { return getToken(RustParser.LEFT_PARANTHESIS, 0); }
		public TerminalNode RIGHT_PARANTHESIS() { return getToken(RustParser.RIGHT_PARANTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(FN);
			setState(66);
			match(ID);
			setState(67);
			match(LEFT_PARANTHESIS);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(68);
					matchWildcard();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(74);
			match(RIGHT_PARANTHESIS);
			setState(75);
			block();
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
	public static class StructContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(RustParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(RustParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(RustParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode IMPL() { return getToken(RustParser.IMPL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		try {
			int _alt;
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(STRUCT);
				setState(78);
				match(ID);
				setState(79);
				match(LEFT_CURLY_BRACE);
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(80);
						matchWildcard();
						}
						} 
					}
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(86);
				match(RIGHT_CURLY_BRACE);
				}
				break;
			case IMPL:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(IMPL);
				setState(88);
				match(ID);
				setState(89);
				block();
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RustParser.IF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IF);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(93);
					matchWildcard();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(99);
			block();
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RustParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ELSE);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(102);
					matchWildcard();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(108);
			block();
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
	public static class If_elseContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitIf_else(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			if_();
			setState(111);
			else_();
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
	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RustParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(RustParser.IF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitElse_if(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ELSE);
			setState(114);
			match(IF);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(115);
					matchWildcard();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(121);
			block();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(RustParser.LET, 0); }
		public TerminalNode ID() { return getToken(RustParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RustParser.EQUAL, 0); }
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public TerminalNode MUT() { return getToken(RustParser.MUT, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LET);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUT) {
				{
				setState(124);
				match(MUT);
				}
			}

			setState(127);
			match(ID);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(128);
				match(COLON);
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) {
				{
				setState(131);
				data_types();
				}
			}

			setState(134);
			match(EQUAL);
			setState(135);
			binding();
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
	public static class BindingContext extends ParserRuleContext {
		public TerminalNode FLOAT_LIT() { return getToken(RustParser.FLOAT_LIT, 0); }
		public TerminalNode INT_LIT() { return getToken(RustParser.INT_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(RustParser.STRING_LIT, 0); }
		public TerminalNode BOOL_LIT() { return getToken(RustParser.BOOL_LIT, 0); }
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitBinding(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674416640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class VectorContext extends ParserRuleContext {
		public TerminalNode VEC_MACRO() { return getToken(RustParser.VEC_MACRO, 0); }
		public TerminalNode LEFT_SQUARE_BRACE() { return getToken(RustParser.LEFT_SQUARE_BRACE, 0); }
		public TerminalNode RIGHT_SQUARE_BRACE() { return getToken(RustParser.RIGHT_SQUARE_BRACE, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vector);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(VEC_MACRO);
			setState(140);
			match(LEFT_SQUARE_BRACE);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(141);
					matchWildcard();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(147);
			match(RIGHT_SQUARE_BRACE);
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(RustParser.LOOP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(RustParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(RustParser.FOR, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		try {
			int _alt;
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(LOOP);
				setState(150);
				block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(WHILE);
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(152);
						matchWildcard();
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(158);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(FOR);
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(160);
						matchWildcard();
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(166);
				block();
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
	public static class Data_typesContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(RustParser.INTEGER, 0); }
		public TerminalNode UNSIGNED_INTEGER() { return getToken(RustParser.UNSIGNED_INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(RustParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(RustParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(RustParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(RustParser.STRING, 0); }
		public Data_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).enterData_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustListener ) ((RustListener)listener).exitData_types(this);
		}
	}

	public final Data_typesContext data_types() throws RecognitionException {
		Data_typesContext _localctx = new Data_typesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_data_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001e\u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002;\b\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003F\b"+
		"\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004R\b\u0004\n\u0004"+
		"\f\u0004U\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004[\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005_\b\u0005\n\u0005\f"+
		"\u0005b\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u0006h\b\u0006\n\u0006\f\u0006k\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bu\b\b\n"+
		"\b\f\bx\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t~\b\t\u0001\t\u0001"+
		"\t\u0003\t\u0082\b\t\u0001\t\u0003\t\u0085\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008f"+
		"\b\u000b\n\u000b\f\u000b\u0092\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u009a\b\f\n\f\f\f\u009d\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00a2\b\f\n\f\f\f\u00a5\t\f\u0001\f\u0003\f\u00a8\b"+
		"\f\u0001\r\u0001\r\u0001\r\n*5GS`iv\u0090\u009b\u00a3\u0000\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0002\u0001\u0000(+\u0001\u0000-2\u00b6\u0000$\u0001\u0000\u0000\u0000"+
		"\u0002&\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006A"+
		"\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000"+
		"\u0000\fe\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010"+
		"q\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0089\u0001"+
		"\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u00a7\u0001"+
		"\u0000\u0000\u0000\u001a\u00a9\u0001\u0000\u0000\u0000\u001c%\u0003\n"+
		"\u0005\u0000\u001d%\u0003\f\u0006\u0000\u001e%\u0003\u0002\u0001\u0000"+
		"\u001f%\u0003\b\u0004\u0000 %\u0003\u0004\u0002\u0000!%\u0003\u000e\u0007"+
		"\u0000\"%\u0003\u0010\b\u0000#%\u0003\u0006\u0003\u0000$\u001c\u0001\u0000"+
		"\u0000\u0000$\u001d\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000"+
		"$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&*\u00053\u0000\u0000\')\t\u0000\u0000\u0000("+
		"\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000-.\u00054\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0010\u0000\u000001\u0005,\u0000\u000015\u00057\u0000\u000024\t\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008:\u00058\u0000\u00009;\u0005F\u0000\u0000:"+
		"9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000"+
		"\u0000<>\u0005,\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0003\u0002\u0001\u0000@\u0005\u0001"+
		"\u0000\u0000\u0000AB\u0005\u0010\u0000\u0000BC\u0005,\u0000\u0000CG\u0005"+
		"7\u0000\u0000DF\t\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u00058\u0000\u0000"+
		"KL\u0003\u0002\u0001\u0000L\u0007\u0001\u0000\u0000\u0000MN\u0005 \u0000"+
		"\u0000NO\u0005,\u0000\u0000OS\u00053\u0000\u0000PR\t\u0000\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000V[\u00054\u0000\u0000WX\u0005\u0013\u0000\u0000XY\u0005,\u0000"+
		"\u0000Y[\u0003\u0002\u0001\u0000ZM\u0001\u0000\u0000\u0000ZW\u0001\u0000"+
		"\u0000\u0000[\t\u0001\u0000\u0000\u0000\\`\u0005\u0012\u0000\u0000]_\t"+
		"\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000cd\u0003\u0002\u0001\u0000d\u000b\u0001"+
		"\u0000\u0000\u0000ei\u0005\f\u0000\u0000fh\t\u0000\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000lm\u0003\u0002\u0001\u0000m\r\u0001\u0000\u0000\u0000no\u0003\n"+
		"\u0005\u0000op\u0003\f\u0006\u0000p\u000f\u0001\u0000\u0000\u0000qr\u0005"+
		"\f\u0000\u0000rv\u0005\u0012\u0000\u0000su\t\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000yz\u0003\u0002\u0001\u0000z\u0011\u0001\u0000\u0000\u0000{}\u0005"+
		"\u0015\u0000\u0000|~\u0005\u001a\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0005,\u0000\u0000\u0080\u0082\u0005M\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0003\u001a\r\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005S\u0000\u0000\u0087\u0088\u0003\u0014\n\u0000"+
		"\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0000\u0000\u0000"+
		"\u008a\u0015\u0001\u0000\u0000\u0000\u008b\u008c\u0005e\u0000\u0000\u008c"+
		"\u0090\u00055\u0000\u0000\u008d\u008f\t\u0000\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u00056\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0016\u0000\u0000\u0096\u00a8\u0003\u0002\u0001\u0000\u0097\u009b\u0005"+
		"\'\u0000\u0000\u0098\u009a\t\u0000\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a8\u0003\u0002"+
		"\u0001\u0000\u009f\u00a3\u0005\u0011\u0000\u0000\u00a0\u00a2\t\u0000\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a8\u0003\u0002\u0001\u0000\u00a7\u0095\u0001\u0000\u0000"+
		"\u0000\u00a7\u0097\u0001\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000"+
		"\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0001\u0000"+
		"\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u0012$*5:=GSZ`iv}\u0081\u0084"+
		"\u0090\u009b\u00a3\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}