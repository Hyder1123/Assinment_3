package Assigment3;
import java.util.Scanner;

public class strdgits_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("enter the 10 digites number :");
		String str=s.nextLine();
		String str1="+91-";
		if(str.length()==10) {
		str=str1.concat(str);
		System.out.println(str);
		}
		else
			System.out.println("Enter a valid number");

	}

}
