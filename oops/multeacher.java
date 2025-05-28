import java.util.Scanner;
class Person {
	String name;
	String gender;
	String address;
	int age;		    
    Person(){}

    Person(String name,String gender,String address,int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
   
}
class Employee extends Person {
    int empid;
    String cname;
    String qual;
    float salary;

    Employee(String name,String gender,String address,int age,int empid,String cname,String qual,float salary) {
        super(name,gender,address,age);
        this.empid = empid;
        this.cname = cname;
        this.qual=qual;
        this.salary=salary;
    }
}    
    
class Teacher extends Employee {
    String department;
    String subject;
    int Tid;

    Teacher(String name, String gender, String address, int age, int empid, String cname, String qual, float salary, String department, String subject, int Tid) {
        super(name,gender,address,age,empid,cname,qual, salary);
        this.department = department;
        this.subject = subject;
        this.Tid=Tid;
    }
public void display( )
{

	System.out.println ("Teacher name :" + name );
	System.out.println ("Teacher gender :" + gender );
	System.out.println ("Teacher address :" + address );
	System.out.println ("Teacher age :" + age );
	
	System.out.println ("Teacher id :"+ empid ) ;
	System.out.println ("Teacher comapny name :" + cname );
	System.out.println ("Teacher qualification :" + qual );
	System.out.println ("Teacher salary :" + salary );
	
	System.out.println("Teacher department : "+ department ) ;
	System.out.println ("Teacher subject:"+ subject);
	System.out.println ("Teacher Tid:"+ Tid);
}
}

public class multeacher
{


public static void main ( String [] args )
{
	System.out.println ("Enter number of Teachers: ");

	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	
	System.out.println ( "Enter Teacher details one by one" ) ;
	Teacher teacher[]= new Teacher[n] ;

	
	
	String name;
	String gender;
	String address;
	int age;
	
	int empid;
    	String cname;
    	String qual;
    	float salary;
    	
    	String department;
	String subject;
	int Tid;
	
	
	
	for(int i =0; i<n ;i++)
	{
	System.out.println ("Enter teacher details.") ;
	System.out.println( "Enter teacher name :" ) ;
	name = sc.next();
	
	
	System.out.println (" Enter gender : ") ;
	gender = sc.nextLine();
	sc.nextLine();
	
	System.out.println( "Enter address :" ) ;
	address = sc.nextLine();
	
	
	System.out.println ( "Enter age :" ) ;
	age = sc.nextInt() ;
	sc.nextLine();
	
	System.out.println ("Enter empid : ") ;
	empid = sc.nextInt() ;
	sc.nextLine();
	
	System.out.println ("Enter company name :" ) ;
	cname= sc.nextLine() ;
	
	System.out.println ("Enter qualification :" ) ;
	qual= sc.nextLine() ;
	
	System.out.println ("Enter salary :" ) ;
	salary= sc.nextFloat() ;
	sc.nextLine();
	
	System.out.println ("Enter department :" ) ;
	department= sc.nextLine() ;
	
	System.out.println ("Enter subject :" ) ;
	subject= sc.nextLine() ;
	
	System.out.println ( "Enter Teacher id:" ) ;
	Tid = sc.nextInt() ;
	sc.nextLine();
	
	
	Teacher t = new Teacher (name,gender,address,age,empid, cname,qual,salary,department,subject,Tid);

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
	    	

	





























