package lambda;

public class Person implements Comparable<Person>{
String id;
String name;
String address;
@Override
public int compareTo(Person o) {
	// TODO Auto-generated method stub
	return this.id.compareTo(o.id);
	}
}
