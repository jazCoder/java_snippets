class Palindrome {
	public static boolean isPalindrome(String s) {
		int n = s.length();
		for (int i=0; i<n/2; i++) {  
			if (s.charAt(i) != s.charAt(n-1-i)) {  
			return false;
			}
		}	
		return true;	
	}
		
	public static void main(String[] args) {
	if (isPalindrome(args[0])) {
		System.out.println("true");
	} else {
		System.out.println("false");
		}
	}
}
