import java.util.Scanner;

class Employee {
    int empid;
    String name;
    float salary;
    String address;
    Employee(){}

    Employee(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
   
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empid, String name, float salary, String address, String department, String subject) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

public void display( )
{
	System.out.println ("Teacher id :"+ empid ) ;
	System.out.println ("Teacher name :" + name ) ;
	System.out.println ("Teacher salary :" + salary ) ;
	System.out.println ("Teacher address :" + address ) ;
	System.out.println("Teacher department : "+ department ) ;
	System.out.println ("Teacher subject:"+ subject);
}
}
public class teacher
{


public static void main ( String [] args )
{
	System.out.println ("Enter number of Teachers: ");

	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	
	System.out.println ( "Enter Teacher details one by one" ) ;
	Teacher teacher[]= new Teacher[n] ;


	int tid;
	String name;
	float salary;
	String address, department, subject;


	for(int i =0; i<n ;i++)
	{
	System.out.println ("Enter teacher details.") ;
	System.out.println( "Enter teacherid :" ) ;
	tid = sc.nextInt();
	sc.nextLine();
	
	System.out.println (" Enter name : ") ;
	name = sc.nextLine();
	
	System.out.println( "Enter salary :" ) ;
	salary = sc.nextFloat();
	sc.nextLine();
	
	System.out.println ( "Enter address :" ) ;
	address = sc.nextLine() ;
	
	System.out.println ("Enter department : ") ;
	department = sc.nextLine() ;
	
	System.out.println ("Enter subject :" ) ;
	subject= sc.nextLine() ;



	Teacher t = new Teacher (tid,name,salary,address,department,subject);

	teacher[i] = t ;
	}
	System.out.println ( "Teachers are :") ;
	for(int i=0;i<n;i++)
	{
		teacher[i].display();
		System.out.println( );
	}
}
}
