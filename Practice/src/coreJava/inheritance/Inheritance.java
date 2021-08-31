package coreJava.inheritance;

class Machine {
	
	protected static String name = "Machine Type 1";
	public void start() {
		System.out.println("Machine started.");
	}

	public void stop() {
		System.out.println("Machine stopped.");
	}
}
// Inheritance
class Car extends Machine{
	// Method Overriding
	@Override // Override is a class, it checks if the method is actually an overridden method or not.
	// If it's present in the superclass or not
	public void start() {
		System.out.println("Car started.");
	}
	
	public void wipeWindSheild(){
		System.out.println("Wiping Wind Sheild");
	}
	
	public static void getInfo() {
		System.out.println("Car name: " + name);
	}
}

public class Inheritance {
	public static void main(String args[]) {
		Machine mach1 = new Machine();
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.wipeWindSheild();
		car1.stop();
	}
}
