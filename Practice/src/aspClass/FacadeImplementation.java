package aspClass;

import java.io.IOException;
import java.util.Scanner;

interface CarHub {
	public void CarName();

	public void price();
}

class Audi implements CarHub {
	@Override
	public void CarName() {
		System.out.println("Audi");
	}

	@Override
	public void price() {
		System.out.println(" $ 65000.00 ");
	}
}

class Tesla implements CarHub {
	@Override
	public void CarName() {
		System.out.println(" Tesla ");
	}

	@Override
	public void price() {
		System.out.println(" $ 45000.00 ");
	}
}

class Bentley implements CarHub {
	@Override
	public void CarName() {
		System.out.println(" Bentley ");
	}

	@Override
	public void price() {
		System.out.println(" $ 55000.00 ");
	}
}

class Dealer {
	private CarHub audi;
	private CarHub tesla;
	private CarHub bentley;

	public Dealer() {
		audi = new Audi();
		tesla = new Tesla();
		bentley = new Bentley();
	}

	public void audiSale() {
		audi.CarName();
		audi.price();
	}

	public void teslaSale() {
		tesla.CarName();
		tesla.price();
	}

	public void bentleySale() {
		bentley.CarName();
		bentley.price();
	}
}

public class FacadeImplementation {
	private static int option;

	public static void main(String args[]) throws NumberFormatException, IOException {
		
			System.out.println("What car do you want to buy, enter your choice: \n");
			System.out.println("1. Audi ");
			System.out.println("2. Tesla ");
			System.out.println("3. Bentley ");
			System.out.println("4. Exit");

			Scanner s = new Scanner(System.in);
			option = s.nextInt();
			s.close();
			Dealer d = new Dealer();

			switch (option) {
			case 1: {
				d.audiSale();
			}
				break;
			case 2: {
				d.teslaSale();
			}
				break;
			case 3: {
				d.bentleySale();
			}
				break;
			default: {
				System.out.println("You didn't choose any of the given car options");
			}
				return;
			}
	}

}
