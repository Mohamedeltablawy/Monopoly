import java.util.Arrays;
import javax.swing.JOptionPane;
import java.io.*; 
import java.util.*; 
public class BuyAndRent {
	
	
	protected String currentStation;
	protected int d;	
    protected int i;
	  
	  //
	  // Constructors
	  //
	public BuyAndRent() {
	
	 free.add(new Square("OLD_KENT_ROAD",0,1000,10)) ;
	 free.add(new Square("WHITECHAPEL_ROAD",0,1000,10)) ;
	 free.add(new Square("KINGS_CROSS_STATION",0,1000,10)) ;
	 free.add(new Square("THE_ANGEL_ISLINGTON",0,1000,10)) ;
	 free.add(new Square("EUSTON_ROAD",0,1000,10)) ;
	 free.add(new Square("PENTOVILLE_ROAD",0,1000,10)) ;
	 free.add(new Square("PALL_MALL",0,1000,10)) ;
	 free.add(new Square("ELECTRIC_COMPANY",0,1000,10)) ;
	 free.add(new Square("WHITEHALL",0,1000,10)) ;
	 free.add(new Square("NORTHUMRLD_AVENUE",0,1000,10)) ;
	 free.add(new Square("MARYLEBONE_STATION",0,1000,10)) ;
	 free.add(new Square("BOW_STREET",0,1000,10)) ;
	 free.add(new Square("MARLBOROUGH_STREET",0,1000,10)) ;
	 free.add(new Square("VINE_STREET",0,1000,10)) ;
	 free.add(new Square("STRAND",0,1000,10)) ;
	 free.add(new Square("FLEET_STREET",0,1000,10)) ;
	 free.add(new Square("TRAFALGER_SQUARE",0,1000,10)) ;
	 free.add(new Square("FENCHURCH_STATION",0,1000,10)) ;
	 free.add(new Square("LEICESTER_SQUARE",0,1000,10)) ;
	 free.add(new Square("COVENTRY_STREET",0,1000,10)) ;
	 free.add(new Square("WATER_WORKS",0,1000,10)) ;
	 free.add(new Square("PICCADILLY",0,1000,10)) ;
	 free.add(new Square("REGENT_STREET",0,1000,10)) ;
	 free.add(new Square("OXFORD_STREET",0,1000,10)) ;
	 free.add(new Square("BOND_STREET",0,1000,10)) ;
	 free.add(new Square("LIVERPOOL_STATION",0,1000,10)) ;
	 free.add(new Square("PARK_LANE",0,1000,10));
	 free.add(new Square("MAYFAIR",0,1000,10));
	 }
	
	static ArrayList<Square> free = new ArrayList<Square>();
	static ArrayList<Square> notFree = new ArrayList<Square>();
         
	protected void setCurrent ( String newVar ) {
		String curr = newVar;
		for (int ii=0;ii<free.size();ii++) {
			
		        if(curr==free.get(ii).getName()) {
				String[] buttons = { "Yes",  "No"  };
				int rc = JOptionPane.showOptionDialog(null, "Want to buy" + curr +" ? ha ? ", "Buy or Not ",
		    	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                 if(rc==0) { notFree.add(free.get(ii)); free.remove(ii);  System.out.println("number of occuiped land "+notFree.size()+" out of 28");}	
                   }
			
			
			
		}
	  }
	

      
      
          
}
