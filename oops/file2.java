import java.io.*;
import java.util.*;
public class file2 {
	public static void main(String args[ ])
	{
		try
		{
			FileWriter fw = new FileWriter("co6expl.txt");
		        fw.write("Hello. This is CO6 .");
		        fw.close();
		        System.out.println("File write done")
			FileReader in = new FileReader ("co6exp1.txt" ) ;
			FileWriter out = new FileWriter ("output.txt" ) ;
			int c ;
			while (( c = in.read( ))!= -1)
			{
				out.write(c) ;
			}
			System.out.println("File copied");
			in.close ( ) ;
			out.close ( ) ;
		}
		catch (IOException e )

		{
			System.out.println("There are some IOException") ;
		}
	}
}
