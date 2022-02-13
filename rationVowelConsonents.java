package Assigment3;
import java.util.Scanner;

public class rationVowelConsonents {

	public static void main(String[] args) {
		int vowel=0,consotunts=0;
		//char ch;
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter a sentane : ");
		String str=s.nextLine();
		str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
			
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch==' ') {
			vowel++;		
			
		}
		consotunts=str.length()-vowel;
		}
		System.out.println("no.of voels and consonents present in given senbtance "+vowel+":"+consotunts);

	}

}
