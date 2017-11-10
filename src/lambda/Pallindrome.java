package lambda;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=454,quo,rem,sum=0;
StringBuffer sb=new StringBuffer(""+i);
StringBuffer sb1=sb.reverse();
System.out.println(sb.toString()==(String.valueOf(sb1)));

System.out.println("---->"+sb);
System.out.println("---->"+sb1);

System.out.println(sb.reverse().equals(""+i));

int temp=i;
while(i>0){
	rem=i%10;
	sum=(sum*10)+rem;
	i=i/10;
	System.out.println("value of i is-->"+i);	
}

System.out.println(temp==sum ? "Palindrome" :"Non Pallindrome");
	}

}
