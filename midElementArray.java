package Assigment3;
import java.util.Scanner;

public class midElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,mid=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enetr the size of array : ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array elements : ");
		for( i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		if(n%2==1) {
			mid=arr[(n+1)/2-1];
		}
		else {
			mid=(arr[n/2-1]+arr[n/2])/2;
		}
		System.out.println(mid);
		
		

	}

}
