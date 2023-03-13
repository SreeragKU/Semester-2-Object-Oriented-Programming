import java.util.*;
public class Findval{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int sz = Snr.nextInt();
		int Arr[] = new int[sz];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<sz;i++)
		{
			Arr[i] = Snr.nextInt();
		}
		System.out.print("The array: ");
		System.out.print("[ ");
		for(int i=0;i<sz;i++)
		{
			System.out.print(Arr[i]+" ");
		}
		System.out.println("]");
		System.out.println("Enter the value to be searched: ");
		int val = Snr.nextInt();
		int flag=0;
		int num=0;
		for(int i=0;i<sz;i++){
			if(Arr[i] == val){
				int ps=i+1;
				System.out.println("Value is found and is in position "+ ps);
				flag=1;
				num=num+1;
			}
		}
		if(flag!=1)
		{
			System.out.println("Value not found");
		}
		else
		{
			System.out.println("The value occured "+ num +" times");
		}
	}
}
