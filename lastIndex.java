package Assigment3;
import java.util.Scanner;

public class lastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.print("enetr the elements of array :" );
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Array element at last position is " +arr[n-1]);
		
		

	}

}
