class FibonacciF{
	public static void main(String[] arg){
		int num=12;
		int n1=0;
		int n2=1;
		int i=0;
		int n3=0;
		System.out.println("Palindrome: ");
		System.out.print(n1);
		System.out.print(" "+ n2);
		for(i=2;i<num;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}