package Assigment3;
import java.util.Scanner;

public class firstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("enter the array size :");
		int n= s.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the size of array :");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("array element which is resent in 1st positon :" +arr[1]);

	}

}
