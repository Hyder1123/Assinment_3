package Assigment3;
import java.util.Scanner;

public class str_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str1=s.nextLine();
		System.out.print("Enter a string : ");
		String str2=s.nextLine();
		if(str1.equals(str2)) {
			System.out.println("You are enterd strings are euqal ");
		}
		else
			System.out.print(" you are entered strings are not equal" );


	}

}
