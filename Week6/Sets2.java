
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.HashSet;

	public class Sets2 {

		public static void main (String[]args) throws FileNotFoundException 
		{
			Set<String> Words=new HashSet<String>();
			Words=read();
			System.out.println(Words);
			
			Words.addAll(read());
			
			System.out.println(Words);
			
		}
		public static Set<String> read() throws FileNotFoundException{
			System.out.println("okumak istediðiniz dosya ismi:");
			Scanner input = new Scanner(System.in);
			
			String file=input.next();
			
			Scanner in=new Scanner(new File(file));
			
			Set<String> temp=new HashSet<String>();
			
			while(in.hasNext()) {
				String word=in.nextLine().toLowerCase();
				temp.add(word);
				
			}
			return temp;
			
			
			
		}
	}

