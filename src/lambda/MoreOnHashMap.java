package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MoreOnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		tm.put(10, 3);
		tm.put(30, 10);
		tm.put(9, 5);
	
	tm.entrySet().stream().forEach(System.out::println);
	System.out.println(tm.get(tm.higherKey(tm.higherKey(tm.firstKey()))));
	
	List<String> l1=new ArrayList<String>();
	String[] a={"Dheeru","Raju","Mahesh"};
	l1.add("Raju");l1.add("Dheeru");l1.add("Rohit");
	
	List l2=l1.stream().filter(it->it.startsWith("R")).collect(Collectors.toList());
	l2.stream().forEach(System.out::println);
	
	
	Stream<String> stream1=Stream.of("java8 ", "java7", " java6");
	Stream<String> stream2=Stream.of(new String[]{"ad1 ","abc  "," abc1"," abc2"});
	
	String string1=stream1.map(String::trim).collect(Collectors.joining("-"));
	Long string2=stream2.map(String::trim).collect(Collectors.counting());

	System.out.println("---->"+string1);	
	System.out.println("Count is---->"+string2);		
	
	int[] integerArr=new int[]{1,2,3,4,5,6,8,10};
	System.out.println("Sum of array Element is =>"+Arrays.stream(integerArr).sum());
	//List<Integer> evenList=Arrays.stream(integerArr).filter(it->it%2==0).collect(supplier, accumulator, combiner);
	System.out.println("Find any===>"+IntStream.range(5,10).findFirst().getAsInt());
	
	
	System.out.println("Find any===>"+IntStream.range(5,20).filter(it->it%2==0).limit(2).toArray());
	int [] evenArr=IntStream.range(5,20).filter(it->it%2==0).limit(2).toArray();
	IntStream.of(evenArr).forEach(System.out::println);
	
	Stream<String> genStream=Stream.generate(()->"Dheeru").limit(10);
	genStream.forEach(System.out::println);
	
	Map<Integer,String> streamOf=Stream.of("Dhee","Ram","Mahesh").
			collect(Collectors.toMap(it->it.length(), it->it));
	
	String[] arr2=Stream.of("Dhee","Ram","Mahesh").map(it->it+it.length()).toArray(String[]::new);
	Stream.of(arr2).forEach(System.out::println);
	
	System.out.println("Length is--->"+Stream.of("Dhee","Ram","Mahesh").map(it->it.length()).mapToInt(Integer::new).sum());
	
	Stream<String> emptyStream=Stream.empty();
	Stream.generate(Math::random).limit(10).forEach(System.out::println);
	Stream.generate(()->1*20).limit(10).forEach(System.out::println);
	int[] range1=IntStream.range(10, 100).filter(it->it%10==0).map(it->it+3).toArray();
	Arrays.stream(range1).forEach(System.out::println);
	
	
	
	}

	
	
}
