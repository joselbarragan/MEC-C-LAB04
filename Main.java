import java.util.ArrayList;
import java.util.List;




public class Main
{
	public static void main(String[] args) {
	    
	    String b ="";
	    ArrayList<String> nombres = new ArrayList<String>(List.of("jose","pedro","manuel","mario","lucia","camilo","samuel","david","juan","jaime","santiago","frank"));
	    ArrayList<String> colane = new ArrayList<String>();
	    ArrayList<String> colae = new ArrayList<String>();
	    
	    System.out.println(nombres);
	    
	    for (int i = 0;i<nombres.size() ; i++){ 
	        System.out.println("usted tiene alguna excepcion");
	        int n = (int) (Math.random() * (3 - 1)) + 1;
	       
        	if (n==2) {
            	    b = nombres.get(i);
            	    colae.add(b);
        		    
        		}else if (n == 1) {
        		    b = nombres.get(i);
        		    colane.add(b);
        		}
	    }		
		System.out.println(colane);
		System.out.println(colae);
	    
		
		
		
	}
}
