import java.util.*;
class Symetric{
    public static void main(String[] args){
    
   	 Scanner sc=new Scanner(System.in);
   	 
   		 System.out.print("Enter the number of rows: ");
   		 int row = sc.nextInt();
   		 System.out.print("Enter the number of columns: ");
   		 int col = sc.nextInt();

   		 int[][] matrix = new int[row][col];
   		 if (row != col) {
               	System.out.println("Not a square matrix.");
               	return;
            	}

  		      
  		      System.out.println("Enter elements to matrix:");
   		 for (int i = 0; i < row; i++) {
       			 for (int j = 0; j < col; j++) {
           			 matrix[i][j] = sc.nextInt();
       			 }
   		 }
   		 int flag=1;
   		 
   	 for (int i = 0; i < row; i++) {
       			 for (int j = 0; j < col; j++) {
           			 if(matrix[i][j]!=matrix[j][i])
           			 
             			 {
               				flag=0;
               				break;
              			 }
       			 }
       		     	if (flag==0) {
                      	break;
                    	}
   		 }
   		 
           	 
           	if (flag == 1) {
              	System.out.println("Symmetric matrix");
           	} else {
              	System.out.println("Not a symmetric matrix");
           	}
           	 
}
}
    	


