/* Area of different shapes using overloaded functions */

import java.util.*;

public class ShapeArea{
	public static void main(String[] args){
		Scanner Snr = new Scanner(System.in);
		int choice=0, r, l, b,p1,p2,h1;
		double h,s,base,height;
		float mjaxis,maxis;
		while(choice !=8){
			System.out.println(":: AREA OF SHAPES ::");
			System.out.println("1. Circle");
			System.out.println("2. Triangle");
			System.out.println("3. Square");
			System.out.println("4. Rectangle");
			System.out.println("5. Parallelogram");
			System.out.println("6. Trapezium");
			System.out.println("7. Ellipse");
			System.out.println("8. Exit");
			System.out.println(" ");
			System.out.print("Enter your choice: ");
			choice = Snr.nextInt();
			ShapeArea obj=new ShapeArea();
			switch(choice){
				case 1:
					System.out.print("Enter the Radius of Circle: ");
					r=Snr.nextInt();
					obj.Area(r);
					break;
				case 2:
					System.out.print("Enter the Height of Triangle: ");
					h=Snr.nextDouble();
					System.out.print("Enter the Base of Triangle: ");
					b=Snr.nextInt();
					obj.Area(h,b);
					break;
				case 3:
					System.out.print("Enter the Side of Square: ");
					s=Snr.nextDouble();
					obj.Area(s);
					break;
				case 4:
					System.out.print("Enter the Length of Rectangle: ");
					l=Snr.nextInt();
					System.out.print("Enter the Breadth of Rectangle: ");
					b=Snr.nextInt();
					obj.Area(l,b);
					break;
				case 5:
					System.out.print("Enter the Base of Parallelogram: ");
					base=Snr.nextDouble();
					System.out.print("Enter the Height of Parallelogram: ");
					height=Snr.nextDouble();
					obj.Area(base,height);
					break;
				case 6:
					System.out.print("Enter the Length of first Parallel side of Trapezium: ");
					p1=Snr.nextInt();
					System.out.print("Enter the Length of second Parallel side of Trapezium: ");
					p2=Snr.nextInt();
					System.out.print("Enter the Height of Parallel side of Trapezium: ");
					h1=Snr.nextInt();
					obj.Area(p1,p2,h1);
					break;
				case 7:
					System.out.print("Enter the Length of Major axis of Ellipse: ");
					mjaxis=Snr.nextFloat();
					System.out.print("Enter the Length of Minor axis of Ellipse: ");
					maxis=Snr.nextFloat();
					obj.Area(mjaxis,maxis);
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Enter a valid choice!");
					break;
			}
		}
	}
	public void Area(int r)
	{
		System.out.println("AREA OF THE CIRCLE: "+(3.14*r*r));
		System.out.println(" ");
	}
	
	public void Area(int len , int breadth)
	{
		System.out.println("AREA OF THE RECTANGLE: "+(len*breadth));
		System.out.println(" ");
	}
	
	public void Area(double h , int b)
	{
		System.out.println("AREA OF THE TRIANGLE: "+((h*b)/2));
		System.out.println(" ");
	}
	
	public void Area(double s)
	{
		System.out.println("AREA OF THE SQUARE: "+(s*s));
		System.out.println(" ");
	}
	
	public void Area(double base, double height)
	{
		System.out.println("AREA OF THE PARALLELOGRAM: "+(base*height));
		System.out.println(" ");
	}
	
	public void Area(int p1 , int p2, int h1)
	{
		System.out.println("AREA OF THE TRAPEZIUM: "+(p1*p2*h1));
		System.out.println(" ");
	}
	public void Area(float mjaxis, float maxis)
	{
		mjaxis = mjaxis / 2f;
		maxis = maxis / 2f;
		System.out.println("AREA OF THE PARALLELOGRAM: "+(3.14f*mjaxis*maxis));
		System.out.println(" ");
	}
}
