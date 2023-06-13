import java.util.*;
class Multiply implements Runnable{
	public void run(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("::Multiplication Table::");
		System.out.println("Enter the required number: ");
		int sz = Snr.nextInt();
		System.out.println("The required table: ");
		for(int i=0; i<=10; i++){
			System.out.println(sz + " * " + i + " = " + sz*i);
		}
	}
}
class Prime implements Runnable{
	public void run(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("::Prime Numbers::");
		System.out.println("Enter the limit: ");
		int sz = Snr.nextInt();
		System.out.println("Required prime numbers: ");
		for(int i=1; i<=sz; i++){
			if(i==0 || i==1){
				continue;
			}
			else{
				int flag = 0;
				for(int j=2;j<=i/2;j++){
					if(i%j == 0){
						flag = 1;
						break;
					}
				}
			if(flag == 0){
				System.out.println(i);
			}
			}
		}
	}
}
public class threadRun{
	public static void main(String[] args) throws InterruptedException{
		Multiply obj1 = new Multiply();
		Thread a = new Thread(obj1);
		a.start();
		a.sleep(3000);
		Prime obj2 = new Prime();
		Thread b = new Thread(obj2);
		b.start();
		b.sleep(3000);
	}
}

			
					
						
				