class EvenOdd {

	public static boolean isEven(int i) {
		if (i%2 == 0) {
			return true;
		} else return false;
	}

	public static void main(String[] args) {
		int num = 0;
		
		try {
		  num = Integer.parseInt(args[0]);	
		}
		catch(NumberFormatException nfe) {
		  System.out.println("OK, try entering a number!");
		  System.exit(1);	
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
		  System.out.println("err, hello... what about a number?");
		  System.exit(1);
		}
		
		if (isEven(num)) {
			System.out.println("True, " + num + " is even");
		} else System.out.println("False, " + num + " is bloody odd!");
		Dog k9 = new Dog();
		k9.sound("snarl");
	}

}
