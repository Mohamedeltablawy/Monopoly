
public class Property {
	  protected String name;
	  protected int type;
	  
	  
	  //
	  // Constructors
	  //
	  public Property (String name, int type ) { 
		  this.setName(name);
		  this.setType(type);
		  
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
	  protected void setName ( String newVar ) {
	    name = newVar;
	  }

	  /**
	   * Get the value of name
	   * @return the value of name
	   */
	  protected String getName ( ) {
	    return name;
	  }

	  /**
	   * Set the value of firstName
	   * @param newVar the new value of firstName
	   */
	  protected void setType ( int newVar ) {
	    type = newVar;
	  }

	  /**
	   * Get the value of firstName
	   * @return the value of firstName
	   */
	  protected int getType ( ) {
	    return type;
	  }

	
}
