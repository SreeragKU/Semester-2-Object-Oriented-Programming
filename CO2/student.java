import java.util.Scanner;
public class student{
	int Roll_num;
	String name;
	int fee;
	public void get(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the Student roll number: ");
		Roll_num = Snr.nextInt();
		System.out.println("Enter the Student name: ");
		name = Snr.next();
		System.out.println("Enter the Fee paid: ");
		fee = Snr.nextInt();
		System.out.println(" ");
	}
	public void print(){
		System.out.println("Student roll number: "+ Roll_num);
		System.out.println("Student name: "+ name);
		System.out.println("Fee paid: "+ fee);
	}
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int sz = Snr.nextInt();
		student Arr[] = new student[sz];
		for(int i=0;i<sz;i++){
			Arr[i] = new student();
			Arr[i].get();
		}
		System.out.println(":: STUDENT DETAILS ::");
		for(int i=0;i<sz;i++){
			Arr[i].print();
			System.out.println(" ");
		}
		System.out.println(":: STUDENTS WITH PENDING FEE ::");
		for(int i=0;i<sz;i++){
			if(Arr[i].fee < 74000){
				Arr[i].print();
				int pend = 74000 - Arr[i].fee;
				System.out.println("Pending: "+ pend);
			}
		}
	}
}