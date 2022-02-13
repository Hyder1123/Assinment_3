package Assigment3;
import java.util.Scanner;

public class rever_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("enter a string : ");
		String str=s.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string of given string is :" + rev);
		
	}

}
