package Assigment3;
import java.util.Scanner;

public class reverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("enter the size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("given array is : "+arr[i] +" ");
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("array in reverse order " +arr[i]);
		}

	}

}
