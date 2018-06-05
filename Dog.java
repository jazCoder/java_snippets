class Dog {
	String name = new String();
	Dog() {
	name = "An unnamed dog";
	}
	Dog(String s) {
		name = s;
	}	
	void sound() {
		System.out.println(name + " is being very quiet...");
	}
	void sound(int i) {
		if (i == 1) {
		System.out.println(name + " barked once.");
		} else {
		System.out.println(name + " barked " + i + " times!");
		}
	}
	void sound(String s) {
		System.out.println(name + " went \"" + s + "\"...!");
	}
	
	public static void main (String[] args) {
		Dog d1 = new Dog("Rex");
		Dog d2 = new Dog("Rover");
		Dog d3 = new Dog("Bones");
		Dog d4 = new Dog();
		d1.sound();
		d2.sound(1);
		d3.sound("growl");
		d4.sound(3);
	}
}
