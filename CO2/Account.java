import java.util.Scanner;
public class Account{
	int Acct_num;
	int Acct_bal;
	String Acct_name;
	public void get(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the Account number: ");
		Acct_num = Snr.nextInt();
		System.out.println("Enter the Account holder name: ");
		Acct_name = Snr.next();
		System.out.println("Enter the Balance amount: ");
		Acct_bal = Snr.nextInt();
		System.out.println(" ");
	}
	public void print(){
		System.out.println("Account Number: "+ Acct_num);
		System.out.println("Account Holder number: "+ Acct_name);
		System.out.println("Account Balance amount: "+ Acct_bal);
	}
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the number of accounts: ");
		int sz = Snr.nextInt();
		Account Arr[] = new Account[sz];
		for(int i=0;i<sz;i++){
			Arr[i] = new Account();
			Arr[i].get();
		}
		System.out.println(":: ACCOUNT DETAILS ::");
		for(int i=0;i<sz;i++){
			Arr[i].print();
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println(":: ACCOUNT WITH LESS THAN 500 AS BALANCE ::");
		for(int i=0;i<sz;i++){
			if(Arr[i].Acct_bal < 500){
				Arr[i].print();
				System.out.println(" ");
			}
		}
	}
}