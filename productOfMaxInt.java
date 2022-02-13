package Assigment3;
import java.util.Scanner;

public class productOfMaxInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,i,max=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of string : ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elemnts of array : ");
		for( i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for( i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
			if(i==1) {
				break;
			}
		}
		System.out.println(arr[i]);		

		System.out.println("Firt and sencnd largest element : " +arr[0]+","+arr[1]);

	}

}
