import java.util.Scanner; 

interface Shape { 
void area(); 
void perimeter(); 
} 

class Circle implements Shape { 
double radius; 
Circle(double r) { 
radius = r; 
} 
public void area() { 
System.out.println("Area of Circle = " + (3.14 * radius * radius)); } 
public void perimeter() { 
System.out.println("Perimeter of Circle = " + (2 * 3.14 * radius)); } 
} 
 
class Rectangle implements Shape { 
double length, breadth; 
Rectangle(double l, double b) { 
length = l; 
breadth = b; 
} 
public void area() { 
System.out.println("Area of Rectangle = " + (length * breadth)); } 
public void perimeter() { 
System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth))); }
} 

class ShapeMenu{ 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
int choice; 
do { 
	System.out.println("\n1. Circle"); 
	System.out.println("2. Rectangle"); 
	System.out.println("3. Exit"); 
	System.out.print("Choose a shape: "); 
	choice = sc.nextInt(); 
	switch (choice) { 
		case 1: 
			System.out.print("Enter radius: "); 
			double r = sc.nextDouble(); 
			Circle c = new Circle(r); 
			c.area(); 
			c.perimeter(); 
			break; 
		case 2: 
			System.out.print("Enter length: "); 
			double l = sc.nextDouble(); 
			System.out.print("Enter breadth: "); 
			double b = sc.nextDouble(); 
			Rectangle rect = new Rectangle(l, b); 
			rect.area(); 
			rect.perimeter(); 
			break; 
		case 3: 
			System.out.println("Exiting..."); 
			break; 
		default: 
			System.out.println("Invalid choice!"); 
	} 
} while (choice != 3); 
sc.close(); 
} 
}

