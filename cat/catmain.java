
public class catmain {
	
    public static void main(String[] args) {

        cat kedi1 = new cat();
        System.out.println(kedi1.age+" , "+kedi1.color+" , "+kedi1.name );
        
        cat kedi2 = new cat("Duman","gri",1);
        System.out.println(kedi2.age+" , "+kedi2.color+" , "+kedi2.name );
      
        cat kedi3 = new cat("Zeytin","siyah",2);
        System.out.println(kedi3.age+" , "+kedi3.color+" , "+kedi3.name );
      
        cat kedi4 = new cat(3,"Atlas","beyaz");
        System.out.println(kedi4.age+" , "+kedi4.color+" , "+kedi4.name );
      
  }
  

}
