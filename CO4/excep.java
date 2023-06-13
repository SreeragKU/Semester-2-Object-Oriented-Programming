import java.util.*;
class intExcep extends Exception{
	public intExcep(String str){
		super(str);
	}
}
public class excep{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		int arr[];
		int sz, total = 0, avg, count=0;
		System.out.println("Enter the limit: ");
		sz = Snr.nextInt();
		arr = new int[sz];
		for(int i=0; i<sz; i++){
			System.out.print("Enter the value: ");
			int val = Snr.nextInt();
			arr[i] =val;
		}
		try{
			for(int i=0; i<sz; i++){
				if(arr[i] < 0){
					throw new intExcep("Numbers must be positive");
				}
				else{
					total += arr[i];
					count++;
				}
			}
			avg = total/count;
			System.out.println("Average " + avg);
		}
		catch(intExcep e){
			System.out.println("::Exception Occurred :: " +e);
		}
	}
}
