package NationWide;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatMain {

	public static void main(String[] args) {
		
    String str="Missisippi";
    
    String uniq_string=RemoveDuplicates(str);
    String no_dup=RemoveDuplicates("Ethiopia");
    
    printString(uniq_string, no_dup);
	}

	private static void printString(String uniq_string, String no_dup) {
		System.out.println("\"Missisippi\" after removing Duplicates:"+uniq_string);
		System.out.println("\"Ethiopia\" after removing Duplicates:"+no_dup);
	}

	private static String RemoveDuplicates(String str) {
		Map<Character,Character> charsMap=new HashMap<Character,Character>();
		String uniq_string="";
		for(int i=0;i<str.length();i++){
			if(!charsMap.containsKey(str.charAt(i)))
			{
			       charsMap.put(str.charAt(i), str.charAt(i));
			       uniq_string+=str.charAt(i);
			}
		}
		return uniq_string;
	}
	
	
	Class<Employee> em=Employee.class;
	
	

}
