package AssignmrntForJAvaCourse;

import java.util.Arrays;

public class Assignexcercise {  
	    static void removeDuplicate(char str[], int length)   
	    {    
	        int index = 0;   
	        for (int i = 0; i < length; i++)   
	        {   
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }      
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
	    } 

	public static void main(String[] args) {
        String info = "javaTpoint is the best learning website";  
 
        char str[] = info.toCharArray();  
 
        int len = str.length;   

        removeDuplicate(str, len);
        
		/*
		 * for (int i = 0; i < s.length(); i++) {
		 * 
		 * // Checking the character for not being a // letter,digit or space if
		 * (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) &&
		 * !Character.isWhitespace(s.charAt(i))) { // Incrementing the countr for spl //
		 * characters by unity count++; }
		 */

	}

}
