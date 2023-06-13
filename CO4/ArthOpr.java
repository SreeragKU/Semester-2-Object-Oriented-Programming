import arithmetic.Calculate;
import java.util.*;
public class ArthOpr{
    public static void main(String []args){
		Scanner Snr = new Scanner(System.in);
		Calculate Obj = new Calculate();
		int choice = 0;
		while(choice != 5){
			System.out.println(" ");
			System.out.println(":: AREA OF SHAPES ::");
			System.out.println("1. Sum");
			System.out.println("2. Difference");
			System.out.println("3. Product");
			System.out.println("4. Quotient");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = Snr.nextInt();
			switch(choice){
				case 1:
					System.out.println("Sum: " + Obj.Sum());
					break;
				case 2:
					System.out.println("Difference: " + Obj.Difference());
					break;
				case 3:
					System.out.println("Product: " + Obj.Product());
					break;
				case 4:
					System.out.println("Quotient: " + Obj.Quotient());
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Select a valid option!");
			}
		}
	}
}
