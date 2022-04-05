package hafta5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vocabulary {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("test.txt"));
         
        ArrayList<String> list = new ArrayList<String>();
	    
        list = getWords(input);
        System.out.println(list);
        
	}

   public static ArrayList<String> getWords(Scanner input) {
	
	   ArrayList<String> words = new ArrayList<String>();
	   
	   while(input.hasNext()) {
		   words.add(input.next().toLowerCase());
		   /*String next = input.next().toLowerCase();
		   if(!words.contains(next))
		   words.add(next);
		   */
	   }
	   
	   return words; 
   }
	

}
