package utilities;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindCombinations {

	private StringBuilder output = new StringBuilder();
    Set<String> list= new LinkedHashSet<String>();
    private final String inputstring;
    public FindCombinations( final String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }
    
    public Set<String> combine() { return combine( 0 ); }
    private Set<String> combine(int start ){
    	
        for( int i = start; i < inputstring.length(); ++i ){
            output.append(inputstring.charAt(i) );
            list.add(output.toString());
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
        
        return list;
    }
}
