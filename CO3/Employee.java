/* Create a class ‘Employee’ with data members Empid, Name, Salary,
Address and constructors to initialize the data members. Create another class
‘Teacher’ that inherits the properties of class employees and contains its own data members department, Subjects taught and constructors to initialize these data members and also include a display function to display all the data members. Use an array of objects to display details of N teachers.
*/

import java.util.*;

class Employee{
	int Empid,Salary;
	String Name,Address;
	Scanner Snr=new Scanner(System.in);
	Employee(){
		System.out.println("Enter the Employee ID:  ");
		Empid=Snr.nextInt();
		System.out.println("Enter the Employee Name:  ");
		Name=Snr.next();
		System.out.println("Enter the Employee Salary:  ");
		Salary=Snr.nextInt();
		System.out.println("Enter the Employee Address:  ");
		Address=Snr.next();
	}
}

class Teacher extends Employee{
	String Dep,Sub;
	Teacher()
	{
	    	System.out.println("Enter the Department:  ");
		Dep=Snr.next();
        		System.out.println("Enter the Subject:  ");
		Sub=Snr.next();		
	}
	void Display(){
		System.out.println("Employee ID :"+Empid);
		System.out.println(" Employee Name:  "+Name);		
		System.out.println(" Employee salary:  "+Salary);		
		System.out.println(" Employee Address:  "+Address);		
	    	System.out.println(" Department:  "+Dep);		
       		System.out.println(" Subject:  "+Sub);
		System.out.println(" ");
	}
	public static void main(String[] args){
		int n,i;
		Scanner Snr=new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		n=Snr.nextInt();
		Teacher Arr[]=new Teacher[n];
		for(i=0;i<n;i++){
			System.out.println("Enter the details of Employee "+(i+1));
			Arr[i]=new Teacher();
		}
		System.out.println(":: EMPLOYEE DETAILS ::");
		for(i=0;i<n;i++){
			Arr[i].Display();	
		}
	}
}
