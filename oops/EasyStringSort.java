import java.util.Scanner; 
public class EasyStringSort { 
 	public static void main(String[] args) { 
 		Scanner scanner = new Scanner(System.in); 
  
 		System.out.print("Enter the number of words: ");  int n = scanner.nextInt(); 
 		scanner.nextLine(); 
 
 		String[] words = new String[n];

 		System.out.println("Enter " + n + " words:");  			for (int i = 0; i < n; i++) { 
 			words[i] = scanner.nextLine(); 
 		} 
 // Bubble Sort  
 		for (int i = 0; i < n - 1; i++) { 
 			for (int j = 0; j < n - i - 1; j++) { 
 				if (words[j].compareTo(words[j + 1]) > 0) {  String temp = words[j]; 
 			words[j] = words[j + 1]; 
 			words[j + 1] = temp; 
 	} 
 	} 
 }

 	System.out.println("\nSorted Words:");  for (String word : words) { 
 	System.out.println(word); 
 	} 
 	scanner.close(); 
 	} 
}

