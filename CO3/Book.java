/* Write a program has class Publisher, Book, Literature and Fiction. Read the information
and print the details of books from either the category, using inheritance. */

import java.util.*;
class Publisher{
    String Pname;
    Publisher(){
        Scanner Snr = new Scanner(System.in);
        System.out.println("Enter the publisher: ");
        Pname=Snr.next();
    }
}
class books extends Publisher{
    String Btype ;
    books(){
        Scanner Snr = new Scanner(System.in);
        System.out.println("Enter the type of the book Literature or Fiction: ");
        Btype= Snr.next();
    }
}
class Literature extends books{
    String title, author ;
    int price;
    Literature(){
        Scanner Snr = new Scanner(System.in);
        System.out.println("Enter the Title: ");
        title= Snr.next();
        System.out.println("Enter the Author: ");
        author= Snr.next();
        System.out.println("Enter the Price: ");
        price= Snr.nextInt();
    }
    void display(){
        System.out.println("");
        System.out.println(":: LITERATURE BOOK DETAILS ::");
        System.out.println("Publisher Name: "+Pname);
        System.out.println("Type of the Book: "+Btype );
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
class Fiction extends books{
    String title1 , author1 ;
    int price1;
    Fiction(){
        Scanner Snr = new Scanner(System.in);
        System.out.println("Enter the Title: ");
        title1= Snr.next();
        System.out.println("Enter the Author: ");
        author1= Snr.next();
        System.out.println("Enter the Price: ");
        price1= Snr.nextInt();
    }
    void display1(){
        System.out.println(" ");
        System.out.println(":: FICTION BOOK DETAILS ::");
        System.out.println("Publisher Name: "+Pname);
        System.out.println("Type of the Book: "+Btype );
        System.out.println("Title: "+title1);
        System.out.println("Author: "+author1);
        System.out.println("Price: "+price1);
    }
}
public class Book{
    public static void main(String[] args){
        Scanner Snr=new Scanner(System.in);
        System.out.print("Enter number of entries for Literature:");
        int ln=Snr.nextInt();
        Literature l[]=new Literature[ln];
        for(int i=0;i<ln;i++){
            l[i]=new Literature();
        }
        for(int i=0;i<ln;i++){
            l[i].display();
        }
        System.out.print(" ");
        System.out.print("Enter number of entries for Fiction:");
        int fn=Snr.nextInt();
        Fiction f[]=new Fiction[fn];
        for(int i=0;i<fn;i++){
            f[i]=new Fiction();
        }
        for(int i=0;i<fn;i++){
            f[i].display1();
        }
    }
}