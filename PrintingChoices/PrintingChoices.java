package PrintingChoices;

public class PrintingChoices {
	public static void main( String[] args ) {
		System.out.println( "Alpha" );
		System.out.println( "Bravo" );
		
		System.out.println( "Charlie" );
		System.out.println( "Delta" );
		// print nothing, break to the next line
		System.out.println();
		
		// `print` does not add a line break
		System.out.print( "Echo" );
		System.out.print( "Foxtrot" );
		
		System.out.println( "Golf" );
		System.out.print( "Hotel" );
		System.out.println();
		System.out.println( "India" );
		
		System.out.println();
		System.out.println( "This" + " " + "is" + " " + "a" + " test." );
		System.out.println( "I am " + "learning Java " + "the" + " " + "hard way!");
	}
}