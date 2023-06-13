/* Prepare bill with the given format using calculate method from interface.
Order No.
Date :
ProductId Name Quantity unitprice Total
	101 	A 		2 		25 		50
	102 	B 		1 		100 	100
Net. Amount 						150 */

import java.util.*;

interface calculate{
public void calc();
}
class bill implements calculate{
	String date,name;
	int qu,id;
	float uniP,total;
	Scanner Snr= new Scanner(System.in);
	public void get()
	{
			System.out.println("Enter product id: ");
			id=Snr.nextInt();
			System.out.println("Enter product name: ");
			name=Snr.next();
			System.out.println("Enter the quantity: ");
			qu=Snr.nextInt();
			System.out.println("Enter unit price: ");
			uniP=Snr.nextFloat();
	}
	public void calc()
	{
	total=qu*uniP;
	}
	public void disp()
	{
		System.out.println(":: PRODUCT DETAILS ::");
		System.out.println("Product id: " + id);
		System.out.println("Product name: " + name);
		System.out.println("Quantity: " + qu);	
		System.out.println("Unit price: "+ uniP);
		System.out.println("Total: "+ total);
	}
	public static void main(String[] args)
	{
		int n,i,o;
		float net=0;
		String date;
		Scanner Snr= new Scanner(System.in);
		System.out.println("Enter order number");
		o=Snr.nextInt();
		System.out.println("Enter order date");
		date=Snr.next();
		System.out.println("Enter no.of products");
		n=Snr.nextInt();
		bill b[]=new bill[n];
		for(i=0;i<n;i++)
		{
			b[i]=new bill();
			b[i].get();
			b[i].calc();
		}
	System.out.println("............BILL............");
	System.out.println("Order no.:"+o);
	System.out.println("Date:"+date);
	System.out.println("........................");
	System.out.println("ID     NAME     QUNTITY     PRICE");
	for(i=0;i<n;i++)
		{
			b[i].disp();
			net=net+b[i].total;
		}
		System.out.println("           Net Amount: "+net);
	}
}