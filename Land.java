import java.io.*; 
import java.util.*;

import javax.swing.JOptionPane; 
public class Land {
	
	
	protected String currentStation;
	protected Square d;	
    protected int i;
    protected int ii;
    protected int iii;
    protected int cardno=0;  //for the chance and community cards 
	  //
	  // Constructors
	  //
	  public Land () { 
		 
	
		     pos.add(new Square("GO",3,0,0,"NONE")) ;
	     	 pos.add(new Square("MEDITERRANEAN AVENUE",0,6000,200,"DARK PURPLE")) ;
	     	 pos.add(new Square("COMMUNITY CHEST",1,1000,10,"NONE")) ;
	     	 pos.add(new Square("BALTIC AVENUE",0,6000,200,"DARK PURPLE")) ;
	     	 pos.add(new Square("INCOME TAX",2,1000,10,"NONE")) ;
	     	 pos.add(new Square("READING RAILROAD",8,20000,2500, "STATION")) ;
	     	 pos.add(new Square("ORIENTAL AVENUE",0,10000,600,"LIGHT BLUE")) ;
	     	 pos.add(new Square("CHANCE",1,1000,10,"NONE")) ;
	     	 pos.add(new Square("VERMONT AVENUE",0,10000,600,"LIGHT BLUE")) ;
	     	 pos.add(new Square("CONNECTICUT AVENUE",0,12000,800,"LIGHT BLUE")) ;
	     	 pos.add(new Square("JUST VISITING JAIL/ IN JAIL",5,1000,10,"NONE")) ;
	     	 pos.add(new Square("ST CHARLES PLACE",0,14000,1000,"PINK")) ;
	     	 pos.add(new Square("ELECTRIC COMPANY",4,15000,1000, "COMPANY")) ;
	     	 pos.add(new Square("STATES AVENUE",0,14000,1000,"PINK")) ;
	     	 pos.add(new Square("VIRGINIA AVENUE",0,16000,1200,"PINK")) ;
	     	 pos.add(new Square("PENNSYLVANIA RAILROAD",8,20000,2500, "STATION")) ;
	     	 pos.add(new Square("ST JAMES PLACE",0,18000,1400,"ORANGE")) ;
	     	 pos.add(new Square("COMMUNITY CHEST",1,1000,10,"NONE")) ;
	     	 pos.add(new Square("TENNESSEE AVENUE",0,18000,1400,"ORANGE")) ;
	     	 pos.add(new Square("NEW YORK AVENUE",0,20000,1600,"ORANGE")) ;
	     	 pos.add(new Square("FREE PARKING",6,1000,10, "NONE")) ;
	     	 pos.add(new Square("KENTUCKY AVENUE",0,22000,1800, "RED")) ;
	     	 pos.add(new Square("CHANCE",1,1000,10,"NONE")) ;
	     	 pos.add(new Square("INDIANA AVENUE",0,22000,1800,"RED")) ;
	     	 pos.add(new Square("ILLINOIS AVENUE",0,24000,2000,"RED")) ;
	     	 pos.add(new Square("B & O RAILROAD",8,20000,2500,"STATION")) ;
	     	 pos.add(new Square("ATLANTIC AVENUE",0,26000,2200,"YELLOW")) ;
	     	 pos.add(new Square("VENTNOR AVENUE",0,26000,2200,"YELLOW")) ;
	     	 pos.add(new Square("WATER WORKS",4,15000,1000,"COMPANY")) ;
	     	 pos.add(new Square("MARVIN GARDEN",0,28000,2400,"YELLOW")) ;
	     	 pos.add(new Square("GO TO JAIL",7,1000,10,"NONE")) ;
	     	 pos.add(new Square("PACIFIC AVENUE",0,30000,2600,"GREEN")) ;
	     	 pos.add(new Square("NORTH CAROLINA AVENUE",0,30000,2600,"GREEN")) ;
	     	 pos.add(new Square("COMMUNITY CHEST",1,1000,10,"NONE")) ;
	     	 pos.add(new Square("PENNSYLVANIA AVENUE",0,32000,2800,"GREEN")) ;
	     	 pos.add(new Square("SHORT LINE",8,20000,2500,"STATION")) ;
	     	 pos.add(new Square("CHANCE" ,1,1000,10,"NONE"));
	     	 pos.add(new Square("PARK PLACE",0,35000,3500,"DARK BLUE") );
	     	 pos.add(new Square("LUXURY TAX",2,1000,10,"NONE")) ;
	     	 pos.add(new Square("BOARDWALK",0,40000,5000,"DARK BLUE"));
     	 for(int i=1;i<=pos.size()-1;i++) {
     		 d=pos.get(i);
     		 if(d.getType()==0 || d.getType()==8) {free.add(d);}
             }
     	for(int i=1;i<=pos.size()-1;i++) {
    		 d=pos.get(i);
    		 if(d.getType()==4) {freecompany.add(d);}
    		 
            }
     	
	  };
	Auction auc = new Auction();
	Cards c = new Cards();
	Rent klm = new Rent();
	Middel middel=new Middel();
	static ArrayList<Square> pos = new ArrayList<Square>();
	static ArrayList<Square> free = new ArrayList<Square>();
	static ArrayList<Square> notFree = new ArrayList<Square>();
	static ArrayList<Square> freecompany = new ArrayList<Square>();
	static ArrayList<Square> notFreecompany = new ArrayList<Square>();
         
         

      
         public void toString( int r , Player q) {
        	 Square t;
        	 Dice doubleDice = new Dice();
        	 ii=doubleDice.getD();
        	 iii=doubleDice.getD();
        	 
       	     
        	 i=ii+iii+r;
        	 
        	 if (i>39) {
        		 i=i-40;
        		 q.increase(20000);
        	 }
        	 t=pos.get(i);
        	 //check for jail
        	 if(q.getJail()==0 || q.getJail()>3 ) {
        	 
        	 q.setPositionNumber(i);
        	 q.setPositionName(t.getName());
        	 System.out.println(" The first dice "+ii+" The second dice "+iii+", Your new postion "+(i)+" (" + t.getName()+ ")");
        	 //start of Buying process
        	if(t.getType()==0) {
        		for (int p=0;p<free.size();p++) {
        			if(t==free.get(p)) {
        				String[] buttons = { "Yes",  "No"  };
        				int rc = JOptionPane.showOptionDialog(null, "Want to buy " + t.getName() +" ? ha ? ", q.getName()+ " turn",
        		    	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                         if(rc==0) {q.decrease(t.getPrice()); free.remove(p); notFree.add(t); q.addProperty(t);
                         System.out.println("number of occuiped land "+notFree.size()+" out of 28");}
                         else if(rc==1) {int yy=auc.auction(t);
                        	 if(yy==1) { free.remove(p); notFree.add(t);}
                         }
        			}
        			
        		}
        		for(int p=0;p<notFree.size();p++) {
        			if(t==notFree.get(p)) { klm.getRent(q,t);}
        		}
        		
        		
        	}
        	
        	//end of buying process
        	
        	//Start of Card process
        	else if(t.getType()==1) {Property o; o=c.getCard(cardno); cardno=+1; if(cardno>3) {cardno=0;}
        	 System.out.println("Your Card says " + o.getName());
        	 if(o.getType()==0){Square y=pos.get(10); q.setPositionNumber(10);q.setPositionName(y.getName());q.setJail(1);}
        	 if(o.getType()==1){q.decrease(100);}
        	 if(o.getType()==2){}
        	 if(o.getType()==3){q.increase(100);}
                         }
        	//end of Card process
        	
        	//Start Tax
        	else if(t.getType()==2) {if(t.getName()=="INCOME TAX"){q.decrease(1000);middel.increase(1000);} else{q.decrease(2000);middel.increase(20000);}}
        	//end Tax
        	
        	//Start go
        	else if(t.getType()==3) {}
        	//end go
        	
        	// start company
        	else if(t.getType()==4) {
        		for (int p=0;p<freecompany.size();p++) {
    			if(t==freecompany.get(p)) {
    				String[] buttons = { "Yes",  "No"  };
    				int rc = JOptionPane.showOptionDialog(null, "Want to buy " + t.getName() +" ? ha ? ",  q.getName()+ " turn",
    		    	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                     if(rc==0) { freecompany.remove(p); notFreecompany.add(t); q.addProperty(t);}
    			}
    			
    		}
        		for(int p=0;p<notFreecompany.size();p++) {
        			if(t==notFreecompany.get(p)) { klm.getRentc(q,t);}
        		}
        		
        	}
        	//end company
        	
        	//start jail
        	else if(t.getType()==5) {}
        	//end jail  
        	
        	//start parking
        	else if(t.getType()==6) {q.increase(middel.getBalance());middel.clear();}
        	//end parking
        	
        	//start go to jail
        	else if(t.getType()==7) {Square y=pos.get(10); q.setPositionNumber(10);q.setPositionName(y.getName()); q.setJail(1);}
        	//end go to jail
        	//start station
        	else if(t.getType()==8) {
        		for (int p=0;p<free.size();p++) {
    			if(t==free.get(p)) {
    				String[] buttons = { "Yes",  "No"  };
    				int rc = JOptionPane.showOptionDialog(null, "Want to buy " + t.getName() +" ? ha ? ",  q.getName()+ " turn",
    		    	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
                     if(rc==0) { free.remove(p); notFree.add(t); q.addProperty(t);  ;}
    			}
    			
    		}
        		for(int p=0;p<notFree.size();p++) {
        			if(t==notFree.get(p)) { klm.getRents(q,t);}
        		}
        		
        	}
        	//end station
        	
        	 }
        	 else if(q.getJail()!=0) {if(ii==iii) {System.out.println(" The first dice "+ii+" The second dice "+iii); q.setJail(0);}
        		 else if(ii!=iii) {System.out.println(" The first dice "+ii+" The second dice "+iii); q.increasejail(1);}
        	 }
        	  }
          protected int getPostion ( ) {
        	    return i;
        	  }
          protected int getDice1 ( ) {
      	    return ii;
      	  }
          protected int getDice2 ( ) {
      	    return iii;
      	  }
          
          
}
