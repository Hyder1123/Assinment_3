package Assigment3;
import java.util.Scanner;
public class StrEqual_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first string :");
		String str1=s.nextLine();
		System.out.print("Enter the second string :");
		String str2=s.nextLine();
		if(str1.equals(str2)) {
			System.out.println("given string are equal");
		}
		System.out.println("given string are not equal");




	}

}
