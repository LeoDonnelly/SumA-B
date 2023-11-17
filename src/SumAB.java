import java.util.Scanner;
import javax.swing.JOptionPane;

public class SumAB { 
	public static void main(String[] args) {  
	    
		int total = 0;
		Scanner num = new Scanner(System.in); 
		System.out.println("How many numbers would you like to add together? ");
		int loop = num.nextInt();
		for(int i = 0;i < loop;i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number to add:  ");
			int a = input.nextInt();
			total +=a;
		}
		
		System.out.println("The total of the numbers you inputed is "+total);
	    JOptionPane.showMessageDialog(null, "The total of the numbers you inputted is " + total);


		
		//Scanner input = new Scanner(System.in);  
	   // System.out.println("Enter your first number to add:  ");
	   // int a = input.nextInt();
	    
	   // Scanner input2 = new Scanner(System.in);
	   // System.out.println("Enter your second number to add:  ");
	   // int b = input2.nextInt();
	    
	  //  int total = a + b;
	    
	   // System.out.println("Your total of the 2 numbers is; "+total);
	}
}
