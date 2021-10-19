package utilities;
import java.util.Set;

public class Dictionary {
	
	public static String[] dictionary= {"WORKING","RING","NIK","WRONG","WORK","OK","KING","WIN","IN"};

	public static boolean isEnglishWord(String word, Set<String> combinations)
	{
		for (String str : combinations) {
		
			if(str.equalsIgnoreCase(word))
			{
				return true;
			}
		}
		
		return false;
	}
}
