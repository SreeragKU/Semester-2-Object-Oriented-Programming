import java.util.*;
public class product{
	int p_code;
	String p_name;
	int price;
	public void get(){
		Scanner Snr = new Scanner(System.in);
		System.out.println("Enter the product code: ");
		p_code = Snr.nextInt();
		System.out.println("Enter the product name: ");
		p_name = Snr.next();
		System.out.println("Enter the price: ");
		price = Snr.nextInt();
	}
	public void print(){
		System.out.println("The product code: " + p_code);
		System.out.println("The product name: " + p_name);
		System.out.println("The price: " + price);
		System.out.println(" ");
	}
	public static void main(String[] args){
		product pdt1 = new product();
		product pdt2 = new product();
		product pdt3 = new product();
		pdt1.get();
		pdt2.get();
		pdt3.get();	
		System.out.println(":: THE FIRST PRODUCT DETAILS ::");
		pdt1.print();
		System.out.println(":: THE SECOND PRODUCT DETAILS ::");
		pdt2.print();
		System.out.println(":: THE THIRD PRODUCT DETAILS ::");
		pdt3.print();
		System.out.println(" ");
		if(pdt1.price < pdt2.price && pdt1.price < pdt3.price){
				System.out.println("The price of first product is lowest");
			}
		else if(pdt2.price < pdt3.price){
			System.out.println("The price of second product is lowest");
		}
		else{
			System.out.println("The price of third product is lowest");
		}	
	}
}