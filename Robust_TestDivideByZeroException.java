import java.util.*;

public class Robust_TestDivideByZeroException {

	public static void main(String[] args) {
		
        try { 
        		Scanner sc = new Scanner(System.in);
    			System.out.println("Let's compute a/b");
    			System.out.print("a = ");
    			int a = sc.nextInt();
    			System.out.print("b = ");
    			int b = sc.nextInt();
    			System.out.println("a/b = " + a/b);
    			sc.close();
        }
        
        catch (InputMismatchException e ){
            System.out.println("Exception caught by this program: Enter numeric value.");
        } 
        
        catch (ArithmeticException exc) {
            System.out.println("Exception caught by this program: Divisor was 0.");
        }
        
        System.out.println("\n Done");
	}
}