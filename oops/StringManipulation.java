import.java.util.Scanner;
public class StringManipulation
  {
    public static void main(String agrgs[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first string:");
      String str1=sc.nextLine();
      System.out.println("Enter the second string:");
      String str2=sc.nextLine();
      String concan_result=str1.concat(str2);
		  System.out.println("Concatenated string:"+concan_result);
      System.out.println("length of the string:"+concan_result.length());
      System.out.println("Uppercase:"+concan_result.toUpperCase());
		  System.out.println("Lowercase:"+concan_result.toLowerCase());
    }
  }
      
