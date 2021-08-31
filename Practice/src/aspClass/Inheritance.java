package aspClass;

class ParentAccount{
	int balance = 0;
	ParentAccount(int balance){
		this.balance = balance;
	}
	
	 void viewBalance(){
		System.out.println(this.balance);
	}
}

class ChildAccount extends ParentAccount{
	ChildAccount(int balance) {
		super(balance);
	}
	void viewBalance(){
		System.out.println(this.balance);
	}
	void viewChildBalance() {
		 System.out.println(super.balance);
	 }
}

public class Inheritance {
	public static void main(String agrs[]) {
		ParentAccount p = new ParentAccount(100000000);
		ChildAccount c = new ChildAccount(100);
		
		p.viewBalance();
		c.viewBalance();
		c.viewChildBalance();
		
		ParentAccount p2 = new ChildAccount(100000);
		p2.viewBalance();
		
	//	ChildAccount c2 = new ParentAccount(100000); // Gives Error
	}

}
