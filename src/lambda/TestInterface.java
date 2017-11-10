package lambda;

@FunctionalInterface
public interface TestInterface {
default String myName(){
	return "Dheeru";
}

 static String myName2(){
	return "Dheeru";
}


boolean equals1(String o1, String o2);
}
