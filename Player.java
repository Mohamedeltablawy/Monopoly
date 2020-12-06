import java.util.ArrayList;

/**
 * Class Player
 */
public class Player {

  //
  // Fields
  //

  private String name;
  private String color;
  private int balance;
  private int positionNumber;
  private int jail;
  private String positionName;
  private ArrayList<Square> property = new ArrayList<Square>();
  //
  // Constructors
  //
  public Player (String name, String color) {
	  this.setName(name);
	  this.setColor(color);
	  this.balance=150000;
	  this.positionNumber=0;
	  this.positionName="GO";
	  this.jail=0;
	  
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of balance
   * @param newVar the new value of balance
   */
  public void setBalance (int newVar) {
    balance = newVar;
  }

  /**
   * Get the value of balance
   * @return the value of balance
   */
  public int getBalance () {
    return balance;
  }

  /**
   * Set the value of positionNumber
   * @param newVar the new value of positionNumber
   */
  public void setPositionNumber (int newVar) {
    positionNumber = newVar;
  }

  /**
   * Get the value of positionNumber
   * @return the value of positionNumber
   */
  public int getPositionNumber () {
    return positionNumber;
  }

  /**
   * Set the value of positionName
   * @param newVar the new value of positionName
   */
  public void setPositionName (String newVar) {
    positionName = newVar;
  }

  /**
   * Get the value of positionName
   * @return the value of positionName
   */
  public String getPositionName () {
    return positionName;
  }

  //
  // Other methods
  //
  public void increase(int step){
		balance+= step;
	}
	
	
  public void decrease(int step){
		balance-= step;
	}
  public void setJail (int newVar) {
		    jail = newVar;
		  }

		  /**
		   * Get the value of positionNumber
		   * @return the value of positionNumber
		   */
  public int getJail () {
		    return jail;
		  }
  public void increasejail(int step){
		jail+= step;
	}
  public ArrayList<Square> getProperty () {
	    return property;
	  }
  public void addProperty(Square b){
	    property.add(b);
      }
}
