package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava8ForEach {

	public static void main(String[] args) {
		
		String fileName="/users/dharmendrakumar/a.txt";
		try {
			Stream<String> stream1=Files.lines(Paths.get(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		//WAY1
		myList.forEach(p->System.out.println("--->"+p));
		
		//WAY2
		myList.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.println("--->"+t);
				
			}});
	}
	private static int sumGretaerThan(List<Integer> list){
		return list.parallelStream().filter(i-> i>10).mapToInt(j->j).sum();
	}	
		
private static void toStreamPractice(){
	Stream<Integer> stream1=Stream.of(1,2,3,4,5);
	stream1.collect(Collectors.toMap(i->i,i->i+10));
	stream1.collect(Collectors.toList());
	

	
}
}
