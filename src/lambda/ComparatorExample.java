package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComparatorExample {

	public static void main(String ... args){
		Map<Student,String> hm=new HashMap<Student,String>();
		List<Student> l1=new ArrayList<Student>();
		Set<Student> s1=new HashSet<Student>();
		
		Student student0 =new Student("Dhiru",44067);
		Student student =new Student("Dheeroo",44065);
		Student student1 =new Student("Raju",44227);
		l1.add(student0);l1.add(student);l1.add(student1);l1.add(student0);
		s1.addAll(l1);
		
		l1.stream().filter(it->(it.age==44067 ) && it.name.equals("Dhiru")).forEach(System.out::println);;
			
		System.out.println("Size of list-->"+l1.size());
		l1.stream().forEach(System.out::println);
		
		System.out.println("Size of Set-->"+s1.size());
		s1.stream().forEach(System.out::println);
		
		System.out.println("******************************");
		
		hm.put(student0,"Student Objec");
		hm.put(student,"Student Object1");
		hm.put(student1,"Student Object2");
	
		System.out.println(hm.get(hm.keySet().toArray()[0]));
		
		hm.entrySet().stream().forEach(System.out::println);
	
		Comparator<Student> byName=(e1,e2)->e1.name.compareTo(e2.name);
		Comparator<Student> byAge=(e1,e2)->Integer.compare(e1.age,e2.age);
		
		hm.keySet().stream()
		.sorted(byName.thenComparing(byAge)).forEach(it->System.out.println(it.age));;
		
		hm.keySet().stream().
		sorted((e1,e2)->Integer.compare(e1.age, e2.age)).
		forEach(it->System.out.println(it.age));
	
	}
	
}
