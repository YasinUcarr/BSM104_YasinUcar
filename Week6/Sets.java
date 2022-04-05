
	
	import java.util.*;

	public class Sets {
		public static void main(String[]args) {
			ArrayList<String> lits=new ArrayList<String>();
			
			lits.add("Kalem");
			lits.add("masa");
			lits.add("Bilgisayar");
			lits.add("Defter");
			lits.add(3,"dolap");
			lits.add("Kalem");
			lits.add("masa");
			
			System.out.println(lits);
			System.out.println(lits.size());
			//lits.get(0);
			
			
			Set<String> sets=new TreeSet<String>();
			
			sets.add("Kalem");
			sets.add("masa");
			sets.add("bilgisayar");
			sets.add("defter");
			sets.add("Kalem");
			sets.add("Masa");
			
			System.out.println(sets);
			System.out.println(sets.size());
			//System.out.println(sets.contains("dolap"));
			
			//sets.clear();
			//System.out.println(sets);
			//sets.addAll(lits);
			
			//System.out.println();
			//System.out.println();
			
			
		}

	}

