import java.util.ArrayList;

public class Cards {
	public Cards(){
		card.add(new Property("Go to jail",0));
		card.add(new Property("Pay 100 euro",1));
		card.add(new Property("get all the money in the middle",2));
		card.add(new Property("get 100 from the bank",3));
	}
	static ArrayList<Property> card = new ArrayList<Property>();
	public Property getCard(int var) {
		if(var>3) {var=var-4;}
		return card.get(var);
	}
	
}
