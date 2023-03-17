import java.util.Scanner;
public class itemprint{
	int it_num;
	String it_name;
	int it_cost;
	public void get(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the Item number: ");
		it_num = Snr.nextInt();
		System.out.println("Enter the Item name: ");
		it_name = Snr.next();
		System.out.println("Enter the cost: ");
		it_cost = Snr.nextInt();
		System.out.println(" ");
	}
	public void print(){
		System.out.println("Item number: "+ it_num);
		System.out.println("Item name: "+ it_name);
		System.out.println("Cost: "+ it_cost);
		System.out.println(" ");
	}
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int sz = Snr.nextInt();
		itemprint Arr[] = new itemprint[sz];
		for(int i=0;i<sz;i++){
			Arr[i] = new itemprint();
			Arr[i].get();
		}
		System.out.println(":: ITEM DETAILS ::");
		for(int i=0;i<sz;i++){
			Arr[i].print();
		}
	}
}