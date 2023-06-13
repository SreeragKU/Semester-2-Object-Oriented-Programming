import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
public class set{
	public static void insert(Set<Integer> st){
		Scanner Snr = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int line = Snr.nextInt();
		st.add(line);
	}
	public static void del(Set<Integer> st){
		Scanner Snr = new Scanner(System.in);
		System.out.print("Enter the position: ");
		int pos = Snr.nextInt();
		pos = pos-1;
		System.out.println(st.remove(pos) + " removed");;
	}
	public static void display(Set<Integer> st){
		System.out.println("Stack: " + st);
	}
	public static void delAll(Set<Integer> st){
		st.clear();
		System.out.println("Set successfully cleared");
	}
	public static void main(String[] args){
		Set<Integer> st = new LinkedHashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		Scanner Snr = new Scanner(System.in);
		int choice1 = 0, choice2 = 0, choice3 = 0;
		while(choice1 != 5){
			System.out.println(":: SET OPERATIONS ::");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Clear All");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice1 = Snr.nextInt();
			switch(choice1){
				case 1:
					insert(st);
					break;
				case 2:
					del(st);
					break;
				case 3:
					display(st);
					break;
				case 4:
					delAll(st);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Enter a valid choice");
			}
		}
	}
}

		
