package EscapeSequencesComments;

public class EscapeSequencesComments {
	public static void main( String[] args ) {
		// This exercise demonstrates escape sequences and comments
		System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
		System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
		// System.out.frimp( "Learn Java The Hard Way" );
		System.out.print( "Hello\n" ); // This line prints Hello.
		System.out.print( "Jello\by\n" ); // This line prints Jelly, but it doesn't
		/* The quick brown fox jumpes over a lazy dog.
		 * Quick wafting zephyrs vex bold Jim. 
		 */
		System.out /* testing */ .println( "Hard to believe, eh?" );
		System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
		System.out.println( "// \\ -=- \\ //" );
		System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
		System.out.print( "I hope you understand \"escape sequences\" now.\n" );
		// and comments :)
	}
}

/* 
 * \t tabs the print statement
 * \n starts a new line
 * \b is backspace
 * All escape sequences must be inside double quotes
 * Use comments to explain WHY code is there, not what it does
 * Exception may be a complicated script
 */