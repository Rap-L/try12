import java.util.Scanner;
public class EmployeeSearch{
	int empid;
	String name;
	float salary;
	
	
	public void getInput()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the empid:");
		empid=in.nextInt();
		System.out.print("Enter the name:");
		name=in.next();
		System.out.print("Enter the salary:");
		salary=in.nextFloat();
	}
	
	public void display()
	{
		System.out.println("Employee id="+empid);
		System.out.println("Employee name="+name);
		System.out.println("Employee salary="+salary);
	}
	
	public static void main(String[] args)
	{
		Employee e[]=new Employee[5];
		
		for (int i=0;i<3;i++)
		{
			e[i]=new Employee();
			e[i].getInput();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target id");
		int a=sc.nextInt();
		int found=0;
		for(int i=0;i<3;i++)
		{
			if (e[i].empid==a)
			{
				System.out.println("target Employee found");
				found=1;
				e[i].display();
				break;
		
			}
		}
		if(found==0){
                  	System.out.println("Target not found ");
		}
	}
}
		
