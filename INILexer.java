// Generated from INI.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class INILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION=1, PAIR=2, SECTION_HEADER=3, KEY=4, VALUE=5, COMMENTS=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SECTION", "PAIR", "SECTION_HEADER", "KEY", "VALUE", "SECTION_NAME", 
			"COMMENTS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SECTION", "PAIR", "SECTION_HEADER", "KEY", "VALUE", "COMMENTS", 
			"WS"
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


	public INILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "INI.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5\"\n\5\r\5\16\5#\3\6\6"+
		"\6\'\n\6\r\6\16\6(\3\7\6\7,\n\7\r\7\16\7-\3\b\3\b\7\b\62\n\b\f\b\16\b"+
		"\65\13\b\3\t\6\t8\n\t\r\t\16\t9\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\2"+
		"\17\b\21\t\3\2\6\b\2\f\f\17\17==??]]__\4\2\f\f\17\17\6\2\62;C\\aac|\4"+
		"\2\13\f\17\17\2B\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\26\3\2\2\2\5\30\3\2\2\2\7\34\3\2"+
		"\2\2\t!\3\2\2\2\13&\3\2\2\2\r+\3\2\2\2\17/\3\2\2\2\21\67\3\2\2\2\23\27"+
		"\5\17\b\2\24\27\5\7\4\2\25\27\5\5\3\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25"+
		"\3\2\2\2\27\4\3\2\2\2\30\31\5\t\5\2\31\32\7?\2\2\32\33\5\13\6\2\33\6\3"+
		"\2\2\2\34\35\7]\2\2\35\36\5\r\7\2\36\37\7_\2\2\37\b\3\2\2\2 \"\n\2\2\2"+
		"! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\n\3\2\2\2%\'\n\3\2\2&%\3\2"+
		"\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\f\3\2\2\2*,\t\4\2\2+*\3\2\2\2,-\3"+
		"\2\2\2-+\3\2\2\2-.\3\2\2\2.\16\3\2\2\2/\63\7=\2\2\60\62\n\3\2\2\61\60"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\20\3\2\2\2\65\63"+
		"\3\2\2\2\668\t\5\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;<\b\t\2\2<\22\3\2\2\2\t\2\26#(-\639\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}