import java.util.*;
class Fibonacci implements Runnable{
	public void run(){
		Scanner Snr = new Scanner(System.in);
		int n1=0, n2=1, n3;
		System.out.println("::Fibonacci Number::");
		System.out.println("Enter the limit: ");
		int sz = Snr.nextInt();
		System.out.println("Required Fibonacci numbers: ");
		for(int i=0;i<sz;i++){
			System.out.print(n1 + " ");
			n3 = n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
class EvenNo implements Runnable{
	public void run(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("::Even Numbers::");
		System.out.println("Enter the Lower limit: ");
		int llt = Snr.nextInt();
		System.out.println("::Enter the Upper limit: ");
		int ult = Snr.nextInt();
		System.out.println("The required even numbers: ");
		for(int i=llt; i<=ult; i++){
			if(i%2 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
public class threadT{
	public static void main(String[] args) throws InterruptedException{
		Fibonacci obj1 = new Fibonacci();
		Thread a =new Thread(obj1);
		a.start();
		a.sleep(3000);
		EvenNo obj2 = new EvenNo();
		Thread b = new Thread(obj2);
		b.start();
		b.sleep(3000);
	}
}
		