package Assigment3;
import java.util.Scanner;

public class sumOfArray {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the array elements : ");
		for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		
		sum=sum+arr[i];
		}

		System.out.println("sum of the arrys is : " +sum);
		
		

	}

}
