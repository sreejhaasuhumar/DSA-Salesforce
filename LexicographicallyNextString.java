package Salesforce;

public class LexicographicallyNextString {
/*
 * Given a string, find lexicographically next string.
 * Input : geeks
Output : geekt
The last character 's' is changed to 't'.

Input : raavz
Output : raawz
Since we can't increase last character, 
we increment previous character.

Input :  zzz
Output : zzza
If string is empty, we return ‘a’. If string contains all characters as ‘z’, we append ‘a’ at the end. Otherwise we find first character from end which is not z and increment it.
 */
	public static void main(String[] args) {

		 String str = "samez";
		 System.out.print(nextWord(str));
	}

	public static String nextWord(String str)
	{
	     
	    // if string is empty
	    if (str == "")
	    return "a";
	     
	    // Find first character from
	    // right which is not z.
	    int i = str.length() - 1;
	    while (str.charAt(i) == 'z' && i >= 0)
	        i--;
	         
	    // If all characters are 'z',
	    // append an 'a' at the end.
	    if (i == -1)
	        str = str + 'a';
	 
	// If there are some
	// non-z characters
	else
	    str = str.substring(0, i) +
	         (char)((int)(str.charAt(i)) + 1) +
	                      str.substring(i + 1);
	return str;
	}
}
