package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambda {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("A");al.add("F");al.add("B");al.add("C");
		al.forEach(p->System.out.println("Value is List-->"+p));
	
		al.sort(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}}.reversed());
		System.out.println("==Sorted==");
		
		
		
		
		al.forEach(p->System.out.println("Value is List-->"+p));
	
	}

}
