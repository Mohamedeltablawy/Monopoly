
public class Dice {

  //
  // Fields
  //

  private int D;
  
  //
  // Constructors
  //
  public Dice () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of D
   * @param newVar the new value of D
   */
  public void setD (int newVar) {
    D = newVar;
  }

  /**
   * Get the value of D
   * @return the value of D
   */
  public int getD () {
	  int r1 ,r2 ; // random number
      r1 =  (int)(6*Math.random()+1) ;
      r2 =  0 ;
      D=r1+r2;
    return D;
  }

  //
  // Other methods
  //

}
