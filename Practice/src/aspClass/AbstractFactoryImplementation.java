package aspClass;

import java.util.Scanner;

interface Machine {
	String MachineName();
}

class Car implements Machine {

	private String name;

	Car(String name) {
		this.name = name;
	}

	@Override
	public String MachineName() {
		// TODO Auto-generated method stub
		return name;
	}

}

class Truck implements Machine {

	private String name;

	Truck(String name) {
		this.name = name;
	}

	@Override
	public String MachineName() {
		// TODO Auto-generated method stub
		return name;
	}

}

class Bike implements Machine {

	private String name;

	Bike(String name) {
		this.name = name;
	}

	@Override
	public String MachineName() {
		// TODO Auto-generated method stub
		return name;
	}

}

abstract class Transport{
	protected int price;
	abstract void getPrice(int priceRange);
	public void displayInfo(){
		// price = priceRange;
		System.out.println("No of priceRange " + price);
	}
}

class Economy extends Transport{

	@Override
	void getPrice(int priceRange) {
		// TODO Auto-generated method stub
		price = priceRange;
	}
	
	public void displayInfo(){
		// price = priceRange;
		System.out.println("You are taking a economy vehical.");
	}
	
}

class MidRange extends Transport{

	@Override
	void getPrice(int priceRange) {
		// TODO Auto-generated method stub
		price = priceRange;
	}
	
	public void displayInfo(){
		// price = priceRange;
		System.out.println("You are taking a mid range vehical.");
	}
}

class HighEnd extends Transport{

	@Override
	void getPrice(int priceRange) {
		// TODO Auto-generated method stub
		price = priceRange;
		
	}
	
	public void displayInfo(){
		// price = priceRange;
		System.out.println("You are taking a high end vehical.");
	}
}

abstract class AbstractFactory{  
	  public abstract Machine MachineName(String name);  
	  public abstract Transport getPrice(int priceRange);  
	}  

class MachineFactory extends AbstractFactory{ 
	@Override
	public Machine MachineName(String name) {
		// TODO Auto-generated method stub
		if(name == null){  
	         return null;  
	      }  
	      if(name.equalsIgnoreCase("Car")){  
	         return new Car(name);  
	      } else if(name.equalsIgnoreCase("Truck")){  
	         return new Truck(name);  
	      } else if(name.equalsIgnoreCase("Bike")){  
	         return new Bike(name);  
	      }  
	      
		return null;
	}

	@Override
	public Transport getPrice(int priceRange) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class TransportFactory extends AbstractFactory{

	@Override
	public Machine MachineName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transport getPrice(int priceRange) {
		
		if(priceRange == 0){  
	         return null;  
	      }  
	      if(priceRange == 1000){  
	         return new HighEnd();  
	      } else if(priceRange == 500){  
	         return new MidRange();  
	      } else if(priceRange == 100){  
	         return new Economy();  
	      }  
		// TODO Auto-generated method stub
		return null;
	}
	
}

class FactoryCreator{
	public static AbstractFactory getFactory(String choice){  
	      if(choice.equalsIgnoreCase("Vehicals")){  
	         return new MachineFactory();  
	      } else if(choice.equalsIgnoreCase("Transport")){  
	          return new TransportFactory();  
	      }    
	      return null;  
	   }  
}

public class AbstractFactoryImplementation {
	public static void main(String agrs[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mode of transport you need");
		System.out.println("1.Car");
		System.out.println("2.Truck");
		System.out.println("3.Bike");
		String name = s.nextLine();
		
		AbstractFactory machineFactory = FactoryCreator.getFactory("Vehicals");
		Machine mach1 = machineFactory.MachineName(name);
		
		System.out.println("Enter you preffered price: ");
		System.out.println("1.100");
		System.out.println("2.500");
		System.out.println("3.1000");
		int price = s.nextInt();
		
		AbstractFactory transportFactory = FactoryCreator.getFactory("Transport");
		Transport trans1 = transportFactory.getPrice(price);
		
		trans1.displayInfo();
		
		s.close();
	}
}
