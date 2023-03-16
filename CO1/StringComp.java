import java.util.*;
public class StringComp{
	public static void main(String[] args){
		Scanner Sr = new Scanner(System.in);
		System.out.println("Enter the number of strings: ");
		int sz = Sr.nextInt();
		String Arr[] = new String[sz];
		System.out.println("Enter the strings: ");
		for(int i=0; i<sz; i++){
			Arr[i] = Sr.next();
		}
		System.out.println("String array before sorting: ");
		System.out.print("[");
		for(int i=0; i<sz; i++){
			System.out.print(Arr[i]+ " ");
		}
		System.out.println("]");
		for(int i=0; i<sz; i++){
			for(int j=i+1; j<sz; j++){
				if(Arr[i].compareTo(Arr[j]) > 0){
					String temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
		System.out.println("String array after sorting: ");
		System.out.print("[");
		for(int i=0; i<sz; i++){
			System.out.print(Arr[i]+ " ");
		}
		System.out.println("]");
	}
}
	

	
					