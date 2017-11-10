package lambda;

public class Student {
String name;
int age;

public String name(){
	return this.name;
}

public int age(){
	return this.age;
}

Student(String name, int age){
	this.name=name;
	this.age=age;
}

@Override
public int hashCode(){
	final int prime=31;
	int result=1;
	result=prime*result+age;
	return result;
	
}


@Override
public boolean equals(Object obj){
	if(obj==null){
		return false;
	}
	
	if(getClass()!=obj.getClass()){
		return false;
	}
	
	Student student=(Student)obj;
	if(age!=student.age){
		return false;
	}
	
	if(this==obj)
	return true;
	
	return true;
}

}
