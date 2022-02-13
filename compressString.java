package Assigment3;
import java.util.Scanner;

public class compressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("enter a string :");
		String str=s.nextLine();
		int counter;
		String result="";
		int i=0;
		while(i<str.length()) {
			counter=1;
			for(int j=1+i;j<str.length();j++) {
				System.out.println("string length :" +str.length());
				if(str.charAt(i)==str.charAt(j)) {
					counter++;
				}
			}
			result=result+str.charAt(i)+counter;
			str=str.replaceAll(String.valueOf(str.charAt(i)), "");
		}
		System.out.println("results is : " +result);

	}

}
