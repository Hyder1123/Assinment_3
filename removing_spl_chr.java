package Assigment3;
import java.util.Scanner;

public class removing_spl_chr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a string with special char's : ");
		String str=s.nextLine();
		str=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);

	







		
		

	}

}
