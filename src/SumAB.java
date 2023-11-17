import javax.swing.JOptionPane;

public class SumAB { 
	public static void main(String[] args) {  
	    
		int total = 0;
		
		String loopasstring = JOptionPane.showInputDialog("Enter how many numbers you would like to add together: ");
		
		int loop = Integer.parseInt(loopasstring);
		for(int i = 0;i < loop;i++) {
			String numberA = JOptionPane.showInputDialog("Enter a number to add: ");
			int a = Integer.parseInt(numberA);
			total +=a;
		}

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
