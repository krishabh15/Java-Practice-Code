package coreJava.interfaces;

class Machine implements Info {
	private int id = 7;
	protected static String name = "Machine Type 1";
	public void start() {
		System.out.println("Machine started.");
	}

	public void stop() {
		System.out.println("Machine stopped.");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine id is " + id);
		
	}
}

class Person implements Info{
	private String name;
	
	public void greet() {
		System.out.println("Hello there");
	}
	public Person(String name) {
		this.name = name;
	}
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Person name is " + name);
	}
}

abstract class Things{
	
}

public class Interfaces {
	public static void main(String agrs[]){
		Machine mach1 = new Machine();
		mach1.start();
		Person person1 = new Person("Rishabh");
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = new Person("Khanna");
		info2.showInfo();
	}
}
