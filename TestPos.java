import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class TestPos {
	public static void main(String[] args) {
		Square t;
		int END=0;
		int Dice1;
		int Dice2;
		int newPostion;
		int m=0 ; // counter for double dice if m=3 the player will go to the jail
		Land place = new Land();
		PlayersGroup tr=new PlayersGroup();
		BuyOrNot p = new BuyOrNot();
		//identification of players
		String sValue = JOptionPane.showInputDialog(null, "Enter numbre of player:");
		int NoOfPlayer = Integer.parseInt(sValue);
		for(int i=1;i<=NoOfPlayer;i++) {
			String nname = JOptionPane.showInputDialog(null, "Enter name of player " + i);
			String color = JOptionPane.showInputDialog(null, "Enter color of player " + i);
			Players.add(new Player(nname,color));



		}


        
		
		while(END==0 && Players.size()!=1) {
			
			
			for(int i=1;i<=NoOfPlayer;i++){
				
				Player k=Players.get(i-1);
				System.out.println("//////////////////////////////////////Player " +i+" turn ("+k.getName()+")//////////////////////////////////////");
				place.toString(k.getPositionNumber(),k); //input=old position, output new position(name)
				Dice1=place.getDice1(); //first dice
				Dice2=place.getDice2(); // second dice
				newPostion=place.getPostion(); //new position(number)



				//double dice algorithm
				if(Dice1==Dice2) {
					m=m+1;
					if(m==3) {m=0;
					System.out.println("Player " +i+" Will go to jail");
					k.setPositionName("JAIL"); k.setPositionNumber(10); k.setJail(1);
					System.out.print("\n His Property \n");
					for(int x = 0; x < k.getProperty().size(); x++) {Square w=k.getProperty().get(x); System.out.print(w.getName()+ "\n");} 
					tr.getTheGroups(k);
					System.out.println("\n His balance " +  k.getBalance() +"\n position "+k.getPositionName()
					+","+ k.getPositionNumber()+"\n //////////////////////////////////////End of player " +i+" turn ("+k.getName()+")//////////////////////////////////////");
					}
					else { System.out.println("Player " +i+"("+k.getName()+") Will play again"); i=i-1;
					      }
				  } 
				else {
					
					System.out.print("\n His Property \n");
					for(int x = 0; x < k.getProperty().size(); x++) {Square w=k.getProperty().get(x); System.out.print(w.getName()+"\n");}  
					tr.getTheGroups(k);
					System.out.println("\n His balance " +  k.getBalance() +"\n position "+k.getPositionName()
					+","+ k.getPositionNumber()+"\n //////////////////////////////////////End of player " +i+" turn ("+k.getName()+")//////////////////////////////////////");
					
				}
				///////////////////////////////////end of turn display
				String[] button = {"OK"};
				int inf = JOptionPane.showOptionDialog(null, "End of "+ k.getName() + "'s turn \n His balance " +  k.getBalance() +"\n His position "+k.getPositionName()
				+","+ k.getPositionNumber()
				, "Resume the game ",
				JOptionPane.WARNING_MESSAGE, 0, null, button, button[0]);
				///////////////////////////////////////////////////////////
				String[] buttons = { "Yes",  "No"  };
				int end = JOptionPane.showOptionDialog(null, "Do you want to end the game my friend", "Resume the game ",
						JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
				
				if(end==0) {
					END=1;
					break;
				}
			if(k.getBalance()<0) {System.out.println(k.getName()+" gone bankrupt and lost the game"); Players.remove(k);NoOfPlayer-=1;
			if(NoOfPlayer==1) {System.out.println(Players.get(0).getName()+" is the last survivor and the WINNER"); }
			}	
			} 
			m=0;
		}
		
	}
	static ArrayList<Player> Players = new ArrayList<Player>();
	
	public ArrayList<Player> getPlayer () {
	    return Players;
	  }	
}
