import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Auction {
	private ArrayList<Player> listOfPlayer = new ArrayList<Player>();
	TestPos test = new TestPos();
	int highestBid=0;
	Player p;
	int rrr=0;
	int n=0;
	int v=0;
	
	public int auction(Square s) {
		rrr=0;
		listOfPlayer=test.getPlayer();
		highestBid=s.getPrice();
		String[] button = { "Yes",  "No"  };
		int rc = JOptionPane.showOptionDialog(null, "Does anyone want an Auction for " + s.getName() +"\n the auction will start with" + s.getPrice(), "",
    	        JOptionPane.WARNING_MESSAGE, 0, null, button, button[1]);
		if(rc==0) {
			while(rrr==0) {
				for(int i=1;i<=listOfPlayer.size();i++) {
					 Player u=listOfPlayer.get(i-1);
					 String sValue = JOptionPane.showInputDialog(null, "player " + i+ "bid");
					 int bid = Integer.parseInt(sValue);
					 if(bid>highestBid) {highestBid=bid; p=u; n=1;}
				}
				if(n==0) {System.out.println(s.getName()+" will remain free \n no player want to bid higher than the orginal price"); break;}
				String[] buttons = { "Yes",  "No"  };
				rrr = JOptionPane.showOptionDialog(null, "Does anyone want to increase the bid ", "End of the auction?",
		    	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
				if(rrr==1) {System.out.println(p.getName()+" won the auction"); p.decrease(highestBid); p.addProperty(s); rc=1;}
			}
          }
		else if(rc==1) {System.out.println(s.getName()+"will remain free"); int v=1;}
		
		
	
	
	
	
	return n;
	}
	
}
