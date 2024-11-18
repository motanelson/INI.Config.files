// Generated from INI.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link INIParser}.
 */
public interface INIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link INIParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(INIParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link INIParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(INIParser.FileContext ctx);
}