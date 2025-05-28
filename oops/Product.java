//Write a java program to design and use 'Product' class
//Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price.

class Product{
int code;
String name;
int price;
Product(int c,String n,int p)
{
code=c;
name=n;
price=p;
}
void display()
{
System.out.println(code+" "+name+" "+price);
}
public static void main(String args[])
{
Product p1=new Product(100,"Shampoo",250);
Product p2=new Product(101,"Paste",50);
Product p3=new Product(103,"Detergent",150);
p1.display();
p2.display();
p3.display();


if(p1.price<p2.price && p1.price<p3.price)
{
System.out.println("Product is:"+p1.name);
System.out.println("Lowest price is:"+p1.price);
}
else if(p2.price<p1.price && p2.price<p3.price)
{
System.out.println("Product is:"+p2.name);
System.out.println("Lowest price is:"+p2.price);
}
else if(p2.price<p1.price && p2.price<p3.price)
{
System.out.println("product is:"+p3.name);
System.out.println("Lowest price is:"+p3.price);
}
}
}



