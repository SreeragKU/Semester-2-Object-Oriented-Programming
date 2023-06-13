/* Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data
members. Use array of objects to display details of N teachers. */

import java.util.*;

class Person{
	int age;
	String P_nm,P_add,P_gd;
	Scanner Snr=new Scanner(System.in);
	Person(){
		System.out.println("Enter the Name:  ");
		P_nm=Snr.next();
		System.out.println("Enter the Gender:  ");
		P_gd=Snr.next();
		System.out.println("Enter the Age:  ");
		age=Snr.nextInt();
		System.out.println("Enter the Address:  ");
		P_add=Snr.next();
	}
}
class Employee extends Person{
	int empid,Salary;
	String Cname,Qualification;
	Employee(){
		System.out.println("Enter the Empid:  ");
		empid=Snr.nextInt();
		System.out.println("Enter the Company Name:  ");
		Cname=Snr.next();
		System.out.println("Enter the Salary:  ");
		Salary=Snr.nextInt();
		System.out.println("Enter the Qualification:  ");
		Qualification=Snr.next();
	}
}
class PersonTeacher extends Employee{
	int tid;
	String Dep,Sub;
	PersonTeacher(){
		System.out.println("Enter the Teacher ID:  ");
		tid=Snr.nextInt();
		System.out.println("Enter the Department:  ");
		Dep=Snr.next();
		System.out.println("Enter the Subject:  ");
		Sub=Snr.next();
	}
	void Display(){
		System.out.println(" Name:  "+P_nm);
		System.out.println(" Gender:  "+P_gd);		
		System.out.println(" Age:  "+age);		
		System.out.println(" Address:  "+P_add);		
		System.out.println(" Empid:  "+empid);		
		System.out.println(" Company Name:  "+Cname);		
		System.out.println(" Salary:  "+Salary);		
		System.out.println(" Qualification:  "+Qualification);		
		System.out.println(" Teacher ID:  "+tid);		
		System.out.println(" Department:  "+Dep);		
		System.out.println(" Subject:  "+Sub);
		System.out.println(" ");	
	}
	public static void main(String[] args){
		int n,i;
		Scanner Snr=new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		n=Snr.nextInt();
		PersonTeacher array[]=new PersonTeacher[n];
		for(i=0;i<n;i++){
			System.out.println("Enter the details of Employee "+(i+1));
			array[i]=new PersonTeacher();
		}
		System.out.println(":: EMPLOYEE DETAILS ::");
		for(i=0;i<n;i++){
			array[i].Display();
		}
	}
}
