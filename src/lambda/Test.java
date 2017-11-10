package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Test {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Dheeru","True");
		Employee e2=new Employee("Dheeru","True");
		
		String s1="Dheeru";
		String s2="Dheeru";
		String s3=s1;
		
		String s4=new String("Dheeru");
		String s5=new String("Raju");
		
		Employee e3=e1;
		System.out.println(e1.hashCode()+" e2===> "+e2.hashCode());
		System.out.println(e3.equals(e1));
		System.out.println(e3.equals(e1));
	
		System.out.println(s4.hashCode()+" s4===> "+s1.hashCode());
		System.out.println(s4.equals(s1));
		System.out.println(s4==s5);
		
		System.out.println(s1.hashCode()+" e2===> "+s2.hashCode());
		System.out.println(s1==s2);
		System.out.println(s3.equals(s2));
		
List<String> al1=Arrays.asList("","","","Dheeru","Rahul");
List<Integer> al2=Arrays.asList(1,2,3,4,5,6,7);
System.out.println("yes"+al1.stream().filter(it->it.isEmpty()).count());
StringJoiner sj=new StringJoiner(".");
sj.add("q").add("b");
System.out.println("yes"+al2.stream().mapToInt(i->i).max().getAsInt());

		
	}
}
