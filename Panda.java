class Panda {
	Panda(){
		System.out.println("New Panda with no name!");
	}
	Panda(String s) {
		System.out.println("New Panda called " + s);
	}

	public static void main(String[] args) {
		Panda p1 = new Panda();

		String str = new String();

		try {
		str = args[0];
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
		System.out.println("No named Panda given...");
		System.exit(1);
		}
		
		Panda p2 = new Panda(str);
	}
}
