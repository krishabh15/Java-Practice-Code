package aspClass;

import java.util.Scanner;

public class Shapes {
	public static void main(String agrs[]) {
		Scanner s = new Scanner(System.in);
		printOptions();
		String user_input = s.nextLine();
		/*
		 * while (!(user_input.equals("f"))) { switchCase(user_input); }
		 */
		if (user_input.equals("f")) {
			switchCase("f");
		} else {
			switchCase(user_input);
		}
		s.close();
	}
	
	// Method to initialize specific shape
	public static void switchCase(String input) {
		Scanner s = new Scanner(System.in);
		try {
			switch (input) {
			case "a":
				printTriangleOptions();
				Triangle t = new Triangle(s.nextInt(), s.nextInt());
				t.area();
				break;
			case "b":
				printRectangleOptions();
				Rectangle r = new Rectangle(s.nextInt(), s.nextInt());
				r.area();
				break;
			case "c":
				printSquareOptions();
				Square sq = new Square(s.nextInt());
				sq.area();
				break;
			case "d":
				printCircleOptions();
				Circle c = new Circle(s.nextInt());
				c.area();
				break;
			case "e":
				printParallelogramOptions();
				Parallelogram p = new Parallelogram(s.nextInt(), s.nextInt());
				p.area();
				break;
			case "f":
				System.out.println("End of Program");
				return;
			default:
				System.out.println("Enter a valid choice");
				break;
			}
		} catch (Exception e) {
			System.out.println("Error: " + e + ". Enter a valid(numerical) input.");
		}
		System.out.println();  // Leave a gap
		printOptions();
		Scanner s2 = new Scanner(System.in);
		String user_input = s2.nextLine();
		if (user_input.equals("f")) {
			switchCase("f");
		} else {
			switchCase(user_input);
		}
		s2.close();
		s.close();
	}
	
	// General Method to print out options to the user
	public static void printOptions() {
		System.out.println("Select any of the following options(a, b, c, d, e, f):");
		System.out.println("a. Triangle");
		System.out.println("b. Rectangle");
		System.out.println("c. Square");
		System.out.println("d. Circle");
		System.out.println("e. Parallelogram");
		System.out.println("f. Exit");
	}

	// Methods to print out Shape Options
	public static void printTriangleOptions() {
		System.out.println("Enter the base and the hight of the triangle");
	}

	public static void printRectangleOptions() {
		System.out.println("Enter the length and the breadth of the rectangle");
	}

	public static void printSquareOptions() {
		System.out.println("Enter the side of the square");
	}

	public static void printCircleOptions() {
		System.out.println("Enter the radius of the circle");
	}

	public static void printParallelogramOptions() {
		System.out.println("Enter the base and the hight of the paralellogram");
	}

	// Shape Classes
	public static class Parallelogram {
		float base;
		float height;
		float area;

		Parallelogram(int b, int h) {
			this.base = b;
			this.height = h;
			this.area = base * height;
		}

		public void area() {
			System.out.println("Area: "+ area + " sq. feet");
		}
	}

	public static class Rectangle {
		float length;
		float breadth;
		float area;

		Rectangle(int l, int b) {
			this.length = l;
			this.breadth = b;
			this.area = length * breadth;
		}

		public void area() {
			System.out.println("Area: "+ area + " sq. feet");
		}
	}

	public static class Square {
		float side;
		float area;

		Square(int s) {
			this.side = s;
			this.area = side * side;
		}

		public void area() {
			System.out.println("Area: "+ area + " sq. feet");
		}
	}

	public static class Circle {
		float radius;
		float area;

		Circle(int r) {
			this.radius = r;
			this.area = (float) (Math.PI * radius * radius);
		}

		public void area() {
			System.out.println("Area: "+ area + " sq. feet");
		}
	}

	public static class Triangle {
		float base;
		float height;
		float area;

		Triangle(float b, float h) {
			this.base = b;
			this.height = h;
			this.area = b * h * 1 / 2;
		}

		public void area() {
			System.out.println("Area: "+ area + " sq. feet");
		}
	}
}
