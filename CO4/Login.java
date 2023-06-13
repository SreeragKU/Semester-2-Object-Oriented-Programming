import java.util.*;
class UName extends Exception {
	public UName(String msg) {
		super(msg);
	}
}
class Pass extends Exception {
	public Pass(String msg) {
		super(msg);
	}
}
public class Login {
	public static void main(String[] args) {
		Scanner Snr = new Scanner(System.in);
		String username, password;
		System.out.print("Enter username :: ");
		username = Snr.nextLine();
		System.out.print("Enter password :: ");
		password = Snr.nextLine();
		int length = username.length();
		try {
			if(length < 6){
				throw new UName("Username must be greater than 6 characters!");
			}
			else if(!password.equals("passWd")){
				throw new Pass("Incorrect password\nType correct password!");
			}
			else{
				System.out.println("Login Successful!");
			}
		}
		catch (UName u) {
			u.printStackTrace();
		}
		catch (Pass p) {
			p.printStackTrace();
		}
		finally {
			System.out.println("The finally statement is executed");
		}
	}
}