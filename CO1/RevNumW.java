import java.util.*;
class RevNumW{
	public static void main(String[] args){
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sr.nextInt();
		int rev=0;
		int rem=0;
		int temp=num;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of "+ num + " is " + rev);
	}
}

