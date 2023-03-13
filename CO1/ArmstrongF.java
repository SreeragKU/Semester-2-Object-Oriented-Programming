import java.util.*;
class ArmstrongF{
	public static void main(String[] arg){
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the limit until which armstrong number should be generated: ");
		int num = sr.nextInt();
		int i=0;
		for(i=0;i<num;i++){
			int rem=0;
			int cb=0;
			int arm=0;
			int temp=i;
			while(temp!=0){
				rem=temp%10;
				cb=rem*rem*rem;
				arm=arm+cb;
				temp=temp/10;
			}
			if(arm==i)
			{
				System.out.println(arm + " is an armstrong number");
			}
		}
	}
}
