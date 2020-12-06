import java.util.ArrayList;

public class PlayersGroup {
	private Player player;
	static ArrayList<String> listOfGroupe = new ArrayList<String>();

	public String getGroup(Player p, Square s) {
		int m=0;
		int n=0;
		String r="f";
		player=p;
		ArrayList<Square> landList=player.getProperty();
		for(int z=1;z<=landList.size();z++) {
			if(landList.get(z-1).getColor()!="DARK BLUE"){
				if(landList.get(z-1).getColor()==s.getColor()) {m+=1;}
			}
			else if(landList.get(z-1).getColor()=="DARK BLUE") {if(landList.get(z-1).getColor()==s.getColor()) {n+=1;}}
			
		}
		if(m==3 || n==2) {r="t";}
		return r;
	}
	public int getStation(Player p) {
		int station=0;
		player=p;
		ArrayList<Square> landList=player.getProperty();
		for(int z=1;z<=landList.size();z++) {if(landList.get(z-1).getColor()=="STATION") {station+=1;}}
		return station;
	}
	public int getCompany(Player p) {
		int company=0;
		player=p;
		ArrayList<Square> landList=player.getProperty();
		for(int z=1;z<=landList.size();z++) {if(landList.get(z-1).getColor()=="COMPANY") {company+=1;}}
		return company;
	}
	public String getTheGroups(Player p) {
		
		listOfGroupe.add("DARK PURPLE");listOfGroupe.add("LIGHT BLUE"); listOfGroupe.add("PINK"); listOfGroupe.add("ORANGE");
		listOfGroupe.add("RED"); listOfGroupe.add("YELLOW"); listOfGroupe.add("GREEN"); listOfGroupe.add("DARK BLUE");
		int m=0;
		int n=0;
		String r="f";
		player=p;
		ArrayList<Square> landList=p.getProperty();
		for(int q=1;q<=listOfGroupe.size();q++) {
		for(int z=1;z<=landList.size();z++) {
			if(landList.get(z-1).getColor()!="DARK BLUE"){
				if(landList.get(z-1).getColor()==listOfGroupe.get(q-1)) {m+=1;
				if(m==3) {System.out.println("Player "+ p.getName()+" collect the "+listOfGroupe.get(q-1)+"group");}
			}}
			else if(landList.get(z-1).getColor()=="DARK BLUE") {
				if(landList.get(z-1).getColor()==listOfGroupe.get(q-1)) {n+=1;
				if(n==2) {System.out.println("Player "+ p.getName()+" collect the "+listOfGroupe.get(q-1)+"group");}
				}}
			
		}
	}
		if(m!=3 || n!=2) {System.out.println("Player "+ p.getName()+" did not collect a full group");}
		return r;
	}
}
