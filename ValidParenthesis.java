package Salesforce;

public class ValidParenthesis {
	/*
	 * Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".*/
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "(*))**())";
		System.out.println(checkValidString(s));

	}
	
	 public static boolean checkValidString(String s) {
		 int leftBalance = 0;
		    for (int i=0; i<s.length(); i++) {
		      if ((s.charAt(i) == '(') || (s.charAt(i) == '*'))
		        leftBalance++;        
		      else
		        leftBalance--;
		        
		      if (leftBalance<0) return false;
		    }
		    if (leftBalance == 0) return true;            
		    int rightBalance = 0;
		    for (int i=s.length()-1; i>=0; i--) {
		      if ((s.charAt(i) == ')') || (s.charAt(i) == '*'))
		        rightBalance++;
		      else
		        rightBalance--;
		      
		      if (rightBalance<0) return false;
		    }
		    return true;
	    }

}
