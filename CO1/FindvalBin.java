import java.util.*;
public class FindvalBin{
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
		int temp=0;
		for(int i=0;i<sz;i++)
		{
			for(int j=i+1;j<sz;j++)
			{
				if(Arr[i] > Arr[j])
				{
					temp= Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
		System.out.print("The sorted array: ");
		System.out.print("[ ");
		for(int i=0;i<sz;i++)
		{
			System.out.print(Arr[i]+" ");
		}
		System.out.println("]");
		System.out.println("Enter the value to be searched: ");
		int val = Snr.nextInt();
		int flag=0;
		int mid=sz/2;
		if(val == Arr[mid]){
			int ps=sz+1;
			System.out.println("Value is found and is in position "+ ps);
			flag=1;
		}
		else if(val>Arr[mid])
		{
			for(int i=0;i<sz;i++){
			if(Arr[i] == val){
				int ps=i+1;
				System.out.println("Value is found and is in position "+ ps);
				flag=1;
			}
		}
		}
		else
		{
			for(int i=mid;i>0;i--){
			if(Arr[i] == val){
				int ps=i+1;
				System.out.println("Value is found and is in position "+ ps);
				flag=1;
			}
		}		
	}
	if(flag!=1)
		{
			System.out.println("Value not found");
		}
	}
}

