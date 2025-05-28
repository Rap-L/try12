import java.util.*;
class LinearSearch{
	public static void main(String args[]){
		int Number[];
		Number=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0;i<5;i++){
                   Number[i] = sc.nextInt();
                }
                System.out.println("Enter your target");
                int a=sc.nextInt();
                int found=0;
                for(int i=0;i<5;i++){
                  if(Number[i]==a)
                  {
                    System.out.println("Target found at index"+i);
                    found=1;
                    break;
                   }
                  }
                  if(found==0){
                  	System.out.println("Target not found ");
                  	
  
}         
}                    	
}
