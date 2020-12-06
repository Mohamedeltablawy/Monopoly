

/**
 * Class Player
 */
public class Middel {

  //
  // Fields
  //

  
  private int balance;
  
  
  //
  // Constructors
  //
  public Middel () {
	  
	  this.balance=0;
	 
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
  
  //
  public int getBalance() {
	  return balance;
  }
  public void increase(int step){
		balance+= step;
	}
	
	
	public void clear(){
		balance= 0;
	}
}
