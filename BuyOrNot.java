import java.util.Arrays;
import javax.swing.JOptionPane;
import java.io.*; 
import java.util.*; 
public class BuyOrNot {
	
	
	protected String currentStation;
	protected int d;	
    protected int i;
	  
	  //
	  // Constructors
	  //
	public BuyOrNot() {
	
	 free.add("OLD_KENT_ROAD") ;
	 free.add("WHITECHAPEL_ROAD") ;
	 free.add("KINGS_CROSS_STATION") ;
	 free.add("THE_ANGEL_ISLINGTON") ;
	 free.add("EUSTON_ROAD") ;
	 free.add("PENTOVILLE_ROAD") ;
	 free.add("PALL_MALL") ;
	 free.add("ELECTRIC_COMPANY") ;
	 free.add("WHITEHALL") ;
	 free.add("NORTHUMRLD_AVENUE") ;
	 free.add("MARYLEBONE_STATION") ;
	 free.add("BOW_STREET") ;
	 free.add("MARLBOROUGH_STREET") ;
	 free.add("VINE_STREET") ;
	 free.add("STRAND") ;
	 free.add("FLEET_STREET") ;
	 free.add("TRAFALGER_SQUARE") ;
	 free.add("FENCHURCH_STATION") ;
	 free.add("LEICESTER_SQUARE") ;
	 free.add("COVENTRY_STREET") ;
	 free.add("WATER_WORKS") ;
	 free.add("PICCADILLY") ;
	 free.add("REGENT_STREET") ;
	 free.add("OXFORD_STREET") ;
	 free.add("BOND_STREET") ;
	 free.add("LIVERPOOL_STATION") ;
	 free.add("PARK_LANE" );
	 free.add("MAYFAIR" );}
	
	static ArrayList<String> free = new ArrayList<String>();
	static ArrayList<String> notFree = new ArrayList<String>();
         
	protected void setCurrent ( String newVar ) {
		String curr = newVar;
		for (int ii=0;ii<free.size();ii++) {
			
		         if(curr==free.get(ii)) {
				String[] buttons = { "Yes",  "No"  };
				int rc = JOptionPane.showOptionDialog(null, "Want to buy" + curr +" ? ha ? ", "Buy or Not ",
		    	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                 if(rc==0) { free.remove(ii); notFree.add(curr); System.out.println("number of occuiped land "+notFree.size()+" out of 28");}	
                   }
			
			
			
		}
	  }
	

      
      
          
}
