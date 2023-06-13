package Graphics;
import java.util.*;
class equations implements solve{
	double num1, num2, sum, pro, diff, quot;
	public void getNum(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the First Number: );
		num1 = Snr.nextDouble();
		System.out.println("Enter the Second Number: );
		num2 = Snr.nextDouble();
	}
	public void Sum(){
		sum = num1+num2;
		System.out.println("Sum : " + sum);
	}
	public void Product(){
		pro = num1*num2;
		System.out.println("Product : " + pro);
	}
	public void Difference(){
		diff = num1-num2;
		System.out.println("Difference: " + diff);
	}
	public void Quotient(){
		quot = num1/num2;
		System.out.println("Quotient: " + quo);
	}
}
public class operations extends shapes{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		int choice = 0;
		while(choice != 5){
			System.out.println(":: ARITHMETIC OPERATIONS ::");
			System.out.println("1. Sum, 2. Product, 3. Difference, 4. Quotient, 5. Exit");
			System.out.println("Enter your choice: ");
			choice = Snr.nextInt();
			operations obj = new operations();
			switch(choice){
				case 1:
					obj.getNum();
					obj.Sum();
					break;
				case 2:
					obj.getNum();
					obj.Product();
					break;
				case 3:
					obj.getNum();
					obj.Difference();
					break;
				case 4:
					obj.getNum();
					obj.Quotient();
					break
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Enter a valid choice!")
					break;
			}
		}
	}
}

					
			
			
			
