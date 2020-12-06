import java.util.Arrays;
import java.io.*; 
import java.util.*;


/**
 * Class Manger
 */
public class Square extends Property {

  //
  // Fields
  //

  protected int price;
  protected int rent;
  protected String color;
  //
  // Constructors
  //
  public Square (String name, int type , int price, int rent, String color) { 
	  super(name, type );
	  this.price= price;
	  this.rent= rent;
	  this.color=color;
  };
  
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of bouns
   * @param newVar the new value of bouns
   */
  protected void setPrice ( int newVar ) {
    price= newVar;
  }


  protected int getPrice( ) {
	
    return price;
    		
  }

  protected void setRent ( int newVar ) {
	    rent= newVar;
	  }
  protected int getRent( ) {
		
	    return rent;
	    		
	  }
  protected String getName ( ) {
	    return name;
	  }

  protected int getType ( ) {
	    return type;
	  }
  protected void setColor ( String newVar ) {
		    color= newVar;
	  }


  protected String getColor( ) {
		    return color;
	  }

}
