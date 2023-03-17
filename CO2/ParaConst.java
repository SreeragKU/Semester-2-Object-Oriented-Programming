import java.util.*;
public class ParaConst{
	int Rnum;
	String name;
	public ParaConst(int n, String s){
		Rnum = n;
		name = s;
		System.out.println(Rnum);
		System.out.println(name);
	}
	public void display(){
		System.out.println(Rnum);
		System.out.println(name);
	}
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the roll number: ");
		int n = Snr.nextInt();
		System.out.println("Enter the student name: ");
		String s = Snr.next();
		ParaConst ob1 = new ParaConst(n,s);
		System.out.println(ob1.Rnum);
		System.out.println(ob1.name);
		ob1.display();
	}
}