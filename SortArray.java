package Assigment3;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		int n=s.nextInt();
		int[] arr= new int[n];
		System.out.print("enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print("array after sorting :");
			System.out.println(arr[i]);
		}

	}

}
