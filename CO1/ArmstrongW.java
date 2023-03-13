import java.util.*;
class ArmstrongW{
	public static void main(String[] args){
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sr.nextInt();
		int sq=0;
		int rem=0;
		int arm=0;
		int temp=num;
		while(temp!=0){
			rem=temp%10;
			sq=rem*rem*rem;
			arm=arm+sq;
			temp=temp/10;
		}
		if(arm==num){
			System.out.println(num + " is an armstrong number");
		}
		else{
			System.out.println(num + " is not an armstrong number");
		}
	}
}
		
			