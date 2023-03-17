import java.util.*;
public class Employ{
	int e_No;
	String e_Name;
	int e_Salary;
	public void get(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the employee number: ");
		e_No = Snr.nextInt();
		System.out.println("Enter the employee name: ");
		e_Name = Snr.next();
		System.out.println("Enter the employee salary: ");
		e_Salary = Snr.nextInt();
	}
	public void print(){
		System.out.println("Employee number: "+ e_No);
		System.out.println("Employee name: "+ e_Name);
		System.out.println("Employee Salary: "+ e_Salary);
		System.out.println(" ");
	}
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int sz = Snr.nextInt();
		Employ Arr[] = new Employ[sz];
		for(int i=0;i<sz;i++){
			 Arr[i] = new Employ();
			 Arr[i].get();
		}
		System.out.println(":: EMPLOYEE DETAILS ::");
		System.out.println(" ");
		for(int i=0;i<sz;i++){
			Arr[i].print();
		}
		System.out.println(" ");
		System.out.println("Enter the Employee number to be searched: ");
		int Src = Snr.nextInt();
		int flag = 0;
		for(int i=0;i<sz;i++)
		{
			if(Arr[i].e_No == Src){
				System.out.println("Employee Found!");
				flag = 1;
				Arr[i].print();
				break;
			}
		}
		if(flag !=1){
			System.out.println("Employee not found");
		}
	}
}
			