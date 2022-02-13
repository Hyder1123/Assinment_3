package Assigment3;
import java.util.Scanner;

public class internIsunique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a first String :");
		String str=s.nextLine();
		System.out.print("Enter a second String :");
		String str1=s.nextLine();
		String str2=str.intern();
		String str3=str1.intern();
		System.out.println(str2==str3);
		


	}

}
