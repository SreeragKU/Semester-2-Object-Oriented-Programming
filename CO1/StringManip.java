import java.util.*;
public class StringManip{
	public static void main(String[] args){
		Scanner Sr = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = Sr.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = Sr.nextLine();
		System.out.println("Concatenate: "+ str1.concat(" "+ str2));
		if(str1.equals(str2)){
			System.out.println("Both string are the same");
		}
		else{
			System.out.println("Both string are not the same");
		}
		System.out.println("Length of the first string: "+ str1.length());
		System.out.println("Length of the second string: "+ str2.length());
		if(str1.length() == str2.length()){
			System.out.println("Boths string are of same length");
		}
		else if(str1.length() > str2.length()){
			System.out.println("The first string is longer than the second");
		}
		else{
			System.out.println("The second string is longer that the first");
		}
		String str3 = str1.concat(" "+ str2);
		System.out.println("String in uppercase: "+ str3.toUpperCase());
		System.out.println("String in lowercase: "+ str3.toLowerCase());
		System.out.println("Enter the number of character after which the new character should be formed: ");
		int ch =Sr.nextInt();
		System.out.println("Substring: "+ str3.substring(ch));
		System.out.println("compareTo: " + str1.compareTo(str2));
	}
}
		
		
		