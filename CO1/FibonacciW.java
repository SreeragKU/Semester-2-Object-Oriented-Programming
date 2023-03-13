import java.util.*;
class FibonacciW{
	public static void main(String[] args){
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the total number of FIbonacci numbers to be printed: ");
		int num = sr.nextInt();
		int n1=0;
		int n2=1;
		int i=0;
		int n3=0;
		System.out.println("Palindrome: ");
		System.out.print(n1);
		System.out.print(" "+ n2);
		while(i<num){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}
}