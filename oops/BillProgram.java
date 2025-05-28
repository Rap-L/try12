import java.util.Scanner;


interface Billable {
void calculate();
}


class Product implements Billable {
int productId;
String name;
int quantity;
double unitPrice;
double total;


void inputDetails(int id, String name, int qty, double price) {

this.productId = id;
this.name = name;
this.quantity = qty;
this.unitPrice = price;
}


public void calculate() {
total = quantity * unitPrice;
}


void display() {
System.out.printf("%-10d %-10s %-10d %-12.2f %.2f\n",
productId, name, quantity, unitPrice, total);
}

double getTotal() {
return total;
}
}
class BillProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       							 
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

       								 
        System.out.print("Enter Order No: ");
        int orderNo = sc.nextInt();
        sc.nextLine();                        
        System.out.print("Enter Date (dd-mm-yyyy): ");
        String date = sc.nextLine();

      							  
        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            System.out.println("\nEnter details of Product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 					
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            System.out.print("Unit Price: ");
            double price = sc.nextDouble();
	    sc.nextLine();
	    
            products[i].inputDetails(id, name, qty, price);
            products[i].calculate(); 
        }

        									// 
        System.out.println("\nOrder No.: " + orderNo);
        System.out.println("Date     : " + date);
        System.out.println("\nProduct Id Name       Quantity   Unit Price   Total");
        System.out.println("--------------------------------------------------------");

        double netAmount = 0;
        for (Product p : products) {
            p.display();
            netAmount += p.getTotal();
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Net Amount: %.2f\n", netAmount);

        sc.close();
    }
}

