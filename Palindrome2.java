// this uses recursion - function calling itself. 
// first IF is test statement to exit

class Palindrome2 {
	public static boolean isPalindrome2(String s) {
		if ((s.length()==1) || (s.length()==0))	{
			return true;
		} else if (s.charAt(0) != s.charAt(s.length()-1)) { 
			return false;
		} else return isPalindrome2(s.substring(1, s.length()-1));
	}

public static void main(String[] args) {
	if (isPalindrome2(args[0])) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
}
}
