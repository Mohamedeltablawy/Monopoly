import javax.swing.JOptionPane;

public class ReadFromBox {
    
    static public int readNumber() {
    	  String[] buttons = { "Yes",  "No"  };

    	    int rc = JOptionPane.showOptionDialog(null, "Want to buy it? ha ? ", "Confirmation",
    	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);

    	    System.out.println(rc);
        String sValue = JOptionPane.showInputDialog(null, "Enter value:");
        int value = Integer.parseInt(sValue);
        return value;
    }

    public static void main(String[] args) {
        int number = readNumber();
        System.out.println(number);
        }
}