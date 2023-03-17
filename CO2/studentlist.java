import java.util.Scanner;
public class studentlist{
	int Roll_num;
	int Enroll_num;
	String name;
	public void get(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the Student roll number: ");
		Roll_num = Snr.nextInt();
		System.out.println("Enter the Student Enrollment number: ");
		Enroll_num = Snr.nextInt();
		System.out.println("Enter the Student name: ");
		name = Snr.next();
		System.out.println(" ");
	}
	public void print(){
		System.out.println("Student Roll number: "+ Roll_num);
		System.out.println("Student Enrollment number: "+ Enroll_num);
		System.out.println("Student Name: "+ name);
	}
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int sz = Snr.nextInt();
		studentlist Arr[] = new studentlist[sz];
		for(int i=0;i<sz;i++){
			Arr[i] = new studentlist();
			Arr[i].get();
		}
		System.out.println(":: STUDENT DETAILS ::");
		for(int i=0;i<sz;i++){
			Arr[i].print();
			System.out.println(" ");
		}
	}
}