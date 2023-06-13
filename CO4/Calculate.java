package arithmetic;
import java.util.*;
interface operations{
   public double Sum();
   public double Difference();
   public double Product();
   public double Quotient();
}
public class Calculate implements operations {
    Scanner Snr = new Scanner(System.in);
    double num1,num2;
    double cal;
	public  double Sum(){
		System.out.print("Enter the First Number: ");
        num1=Snr.nextDouble();
        System.out.print("Enter the Second Number: ");
        num2=Snr.nextDouble();	
		cal=num1+num2;
		return cal;
	}
    public double Difference(){
        System.out.print("Enter the First Number: ");
        num1=Snr.nextDouble();
        System.out.print("Enter the Second Number: ");
        num2=Snr.nextDouble();	
		cal=num1-num2;
		return cal;
	}
    public double Product(){
        System.out.print("Enter the First Number: ");
        num1=Snr.nextDouble();
        System.out.print("Enter the Second Number: ");
        num2=Snr.nextDouble();	
		cal=num1*num2;
		return cal;
    }
    public double Quotient(){
		System.out.print("Enter the First Number: ");
        num1=Snr.nextDouble();
        System.out.print("Enter the Second Number: ");
        num2=Snr.nextDouble();	
		cal=num1/num2;
		return cal; 
    }   
}
