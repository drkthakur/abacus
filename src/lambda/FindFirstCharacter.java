package lambda;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First non repitting character is--> "+
										"77777776".
										chars().
										mapToObj(i -> (char)i).
										collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
										entrySet().
										stream().filter((it)->it.getValue()==1).map(it->it.getKey()).findFirst().get());
        

	}

}
