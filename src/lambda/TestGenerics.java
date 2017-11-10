package lambda;

public class TestGenerics<Integer> {
Integer obj;
void add(Integer obj){
	this.obj=obj;
	}

Integer get(){
	return obj;
}

}
