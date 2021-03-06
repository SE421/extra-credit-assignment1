// Generated from Brainfuck.g4 by ANTLR 4.4

package com.se421.brainfuck.atlas.parser;

import java.io.File;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class BrainfuckLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int TAPE_INCREMENT = 1, TAPE_DECREMENT = 2, TAPE_LEFT = 3, TAPE_RIGHT = 4, INPUT = 5,
			OUTPUT = 6, WHITESPACE = 7;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'",
			"'\\u0005'", "'\\u0006'", "'\\u0007'" };
	public static final String[] ruleNames = { "TAPE_INCREMENT", "TAPE_DECREMENT", "TAPE_LEFT", "TAPE_RIGHT", "INPUT",
			"OUTPUT", "WHITESPACE" };

	private File file;

	public void setFile(File file) {
		this.file = file;
	}

	public File getFile() {
		return file;
	}

	public BrainfuckLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Brainfuck.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t!\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"
			+ "\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r"
			+ "\b\17\t\3\2\2 \2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"
			+ "\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\25\3\2\2\2"
			+ "\t\27\3\2\2\2\13\31\3\2\2\2\r\33\3\2\2\2\17\35\3\2\2\2\21\22\7-\2\2\22"
			+ "\4\3\2\2\2\23\24\7/\2\2\24\6\3\2\2\2\25\26\7>\2\2\26\b\3\2\2\2\27\30\7"
			+ "@\2\2\30\n\3\2\2\2\31\32\7.\2\2\32\f\3\2\2\2\33\34\7\60\2\2\34\16\3\2"
			+ "\2\2\35\36\13\2\2\2\36\37\3\2\2\2\37 \b\b\2\2 \20\3\2\2\2\3\2\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}