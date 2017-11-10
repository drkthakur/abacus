package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingLambda {

	public static void main(String[] args) {
		List<String> string1= Stream.of("A","B","A","B","D","C","D").collect(Collectors.toList());
		
		Map<String,Long> mp =string1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		mp.entrySet().forEach(System.out::println);
		
		Student s1=new Student("A",12);
		Student s2=new Student("B",8);
		Student s3=new Student("C",9);
		Student s4=new Student("D",12);
		
		List<Student> test1=Arrays.asList(s1,s2,s3,s4);
		List<Student> test2=Arrays.asList(s1,s2,s3,s4);
		test1.stream().
		collect(Collectors.groupingBy(Student::name,Collectors.summingInt(Student::age)))
		.entrySet().forEach(System.out::println);
		
		test2.stream().
		collect(Collectors.groupingBy(Student::age,
				Collectors.mapping(Student::name, Collectors.toSet()))).entrySet().forEach(System.out::println);
	
		
		
	}

}
