import java.io.*;
import java.util.*;
class Readfl{
	public static void main(String[] args)
	{
		try
		{
			
			FileWriter fw = new FileWriter("co6exp1.txt") ;
			fw.write( "Hello. This is CO6 .") ;
fw.close( ) ;
			System.out.println( "\n File write done") ;
			FileReader fr = new FileReader("co6exp1.txt") ;
			Scanner sc = new Scanner(fr) ;
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
		fr.close();
		System.out.println( "\n File read done") ;

		}
		catch (IOException e )
		{
			System.out.println("There are some IOException") ;
		}
	}
}
		
