package test;
import java.util.Set;

import utilities.Dictionary;
import utilities.FindCombinations;

public class Combinations {
    
    public static void main (String args[])
    {
    	FindCombinations combobj= new FindCombinations("WORKING");
        Set<String> listOfUniqueCombination= combobj.combine();
        System.out.println(listOfUniqueCombination);

        for (String string : Dictionary.dictionary) {
			boolean isEnglishWord= Dictionary.isEnglishWord(string, listOfUniqueCombination);
			if(!isEnglishWord)
			{
				System.out.println(string +" is not part of the list ");
			}
		}
    }
    
  
} 