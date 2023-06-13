/* Create classes Student and Sports. Create another class Result inherited from Student and
Sports. Display the academic and sports score of a Student. */

import java.util.*;
interface Student{
    public void stdGet();
    public void stdDis();
}
interface Sports{
    public void sptGet();
    public void sptDis();
}
class Result implements Student,Sports{
    String name , sports ;
    int rollno , mrk1, mrk2, mrk3,total,percent , pos;
    public void stdGet(){
        Scanner Snr = new Scanner(System.in);
        System.out.print("Enter the Name of the Student: ");
        name = Snr.next();
        System.out.print("Enter the Roll No: ");
        rollno = Snr.nextInt();
        System.out.print("Enter the First Mark: ");
        mrk1 = Snr.nextInt();
        System.out.print("Enter the Second Mark: ");
        mrk2 = Snr.nextInt();
        System.out.print("Enter the Third Mark: ");
        mrk3 = Snr.nextInt();
        total = mrk1+mrk2+mrk3;
        percent = total/300*100;
    }
    public void stdDis(){
		System.out.println("");
		System.out.println(":: STUDENT DETAILS ::");
        System.out.print("The Student name: "+name);
        System.out.print("Roll No.: "+rollno);
        System.out.print("Total mrks.: "+total);
        System.out.print("Percentage: "+percent);
    }
    public void sptGet(){
        Scanner Snr = new Scanner(System.in);
        System.out.print("Enter the sports activity participated: ");
        sports = Snr.next();
        System.out.print("Enter the position scored:");
        pos = Snr.nextInt();
    }
    public void sptDis(){
		System.out.println("");
		System.out.println(":: SPORTS DETAILS ::");
        System.out.print("Activity Participated: "+sports);
        System.out.print("Position scored: "+pos);
    }
    
}
public class StudentSport{
    public static void main(String[] args){
        Result Obj = new Result();
        Obj.stdGet();
        Obj.sptGet();
        Obj.stdDis();
        Obj.sptDis();            
}
}