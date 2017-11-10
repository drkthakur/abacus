package exceptionTest;

public class TestException {

	static void validate(int age) throws MyException{
		if(age<18){
			throw new MyException("Invalid Age"); 
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(10);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
