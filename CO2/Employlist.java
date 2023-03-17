import java.util.*;
public class Employlist{
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
		Employlist Arr[] = new Employlist[sz];
		for(int i=0;i<sz;i++){
			 Arr[i] = new Employlist();
			 Arr[i].get();
		}
		System.out.println(":: EMPLOYEE DETAILS ::");
		System.out.println(" ");
		for(int i=0;i<sz;i++){
			Arr[i].print();
		}
		System.out.println(" ");
		System.out.println(":: EMPLOYEE WITH SALARY BETWEEN 10k and 15k::");
		for(int i=0;i<sz;i++){
			if(Arr[i].e_Salary > 10000 && Arr[i].e_Salary < 15000){
				Arr[i].print();
			}
		}
	}
}
			