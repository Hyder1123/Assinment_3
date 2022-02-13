package Assigment3;
import java.util.Scanner;

public class positivearray {

	public static void main(String[] args) {
		int pos=0,neg=0;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enetr the size of array : ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
		if(arr[i]>0) {
			System.out.print("positive elements of array :" +arr[i]);
		}
		
		}

	}

}
