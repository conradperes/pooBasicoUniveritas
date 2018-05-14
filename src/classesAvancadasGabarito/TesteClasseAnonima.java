package classesAvancadasGabarito;

public class TesteClasseAnonima {

	static public void enclosingMethod(final String arg1, final int arg2) {  
	      final String local = "A local final variable";  
	      String nonfinal = "A local non-final variable";  
	      Object obj = new Object() {  
	         public String toString() {  
	            return local + "," + arg2;  
	         }  
	         };  
	  
	      System.out.println(obj.toString());  
	   }  
	  
	   public static void main(String[] args) {  
	      enclosingMethod("fim", 0);  
	   }  



}
