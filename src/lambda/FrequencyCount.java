package lambda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dheeru";
		System.out.println(s.substring(1, 2));
		
		
Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
int arr[]=new int[]{1,2,2,3,4,5,6,7,4,3,2,4};

System.out.println("Please enter the Number of elements to Insert");
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int[] arr1=new int[len];
System.out.println("Please enter the Elements:->");
for(int i=0;i<len;i++){
	int t=sc.nextInt();
	arr1[i]=t;
}
System.out.println("Please enter String===>");
String enteredString=sc.next();
System.out.println("Entered String is ==>"+enteredString);

System.out.println("Entered Array was===>");

IntStream.of(arr1).forEach(System.out::print);

for(int i=0;i<arr.length;i++){
		if(hm.containsKey(arr[i])){
			hm.put(arr[i],hm.get(arr[i])+1);
		}else {
			hm.put(arr[i], 1);
		}
		
	}
	
TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
	tm.putAll(hm);
	tm.entrySet().stream().forEach(System.out::println);
	
hm.entrySet().
	stream().
	sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).
	forEach(System.out::println);	

	System.out.println("**********************");
	
	System.out.println(IntStream.of(arr).reduce(Integer::max).getAsInt());

	}

}
