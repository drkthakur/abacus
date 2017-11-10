package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
	
	private void print(char c) {
	    System.out.println(c);
	}
	
	public static void main(String[] args) {
		String st="Dheeru";
		st.chars().forEach(i->System.out.println((char)i));
		
		char[] stCharArray=st.toCharArray();
		StringBuffer sb=new StringBuffer();
	for(int length=stCharArray.length-1;length>=0;length--){
		sb.append(stCharArray[length]);
	}	
	
	System.out.println("reversed String is -->"+sb);
	int left=0; 
	int right=stCharArray.length-1;
	for(left=0;left<right;left++,right--){
		char temp=stCharArray[left];
		stCharArray[left]=stCharArray[right];
		stCharArray[right]=temp;
	}
	System.out.println("Using two pointer is-->"+String.copyValueOf(stCharArray));
	new String(stCharArray);
	}
}
