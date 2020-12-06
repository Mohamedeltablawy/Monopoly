import java.util.ArrayList;

public class Rent {
	private Player player;
	private ArrayList<Player> listOfPlayer = new ArrayList<Player>();
	TestPos test = new TestPos();
	PlayersGroup group = new PlayersGroup();
	int coff=1;
	protected int ii;
    protected int iii;
    Dice doubleDice = new Dice();
	  
	    
	    
	  ///////////////////////normal land rent
	  public void getRent (Player newVar, Square s) {
	        player = newVar;
	        listOfPlayer=test.getPlayer();
	        for(int i=1;i<=listOfPlayer.size();i++) {
	        	if(listOfPlayer.get(i-1)!=player) {
	        		Player u=listOfPlayer.get(i-1);
	        		ArrayList<Square> landList=u.getProperty();
	        		for(int z=1;z<=landList.size();z++) {
	        			if(landList.get(z-1)==s) {
	        				String y=group.getGroup(u,s);
	        				if(y=="t") {int coff=2;}
	        				else if (y=="f") {int coff=1;}
	        				player.decrease(s.getRent()*coff); u.increase(s.getRent()*coff);
	        				System.out.println(" The Rent is" + s.getRent()*coff );
	        				
	        			}
	        		}
	        	}
	        }
	     }
	  ///////////////////company Rent
	  public void getRentc (Player newVar, Square s) {
	        player = newVar;
	        listOfPlayer=test.getPlayer();
	        for(int i=1;i<=listOfPlayer.size();i++) {
	        	if(listOfPlayer.get(i-1)!=player) {
	        		Player u=listOfPlayer.get(i-1);
	        		ArrayList<Square> landList=u.getProperty();
	        		for(int z=1;z<=landList.size();z++) {
	        			if(landList.get(z-1)==s) {
	        				int cc=group.getCompany(u);
	        				int ii=doubleDice.getD();
	        	        	int iii=doubleDice.getD();
	        	        	int malt=4;
	        				if(cc==1) {malt=4;}
	        				else if(cc==2) {malt=10;}
	        				player.decrease((ii+iii)*malt); u.increase((ii+iii)*malt);
	        				System.out.println(" The Rent =(" + ii + "+" + iii+")*" + malt+"="+ (ii+iii)*malt);
	        				
	        			}
	        		}
	        	}
	        }
	     }	
	  ////////////////Station Rent
	  public void getRents (Player newVar, Square s) {
	        player = newVar;
	        listOfPlayer=test.getPlayer();
	        for(int i=1;i<=listOfPlayer.size();i++) {
	        	if(listOfPlayer.get(i-1)!=player) {
	        		Player u=listOfPlayer.get(i-1);
	        		ArrayList<Square> landList=u.getProperty();
	        		for(int z=1;z<=landList.size();z++) {
	        			if(landList.get(z-1)==s) {
	        				int ss=group.getStation(u);
	        				player.decrease(s.getRent()*ss); u.increase(s.getRent()*ss);
	        				System.out.println(" The Rent is" + s.getRent()*ss );
	        				
	        			}
	        		}
	        	}
	        }
	     }	

}
