package Core_java;

public class unary_incr_decr_op {

	public static void main(String[] args) {
		// increment and decrement operators are unary operators which operate on only one operand
		int a=11;
		System.out.println("The post increment value of a:"+a++);
		int b=11;
		System.out.println("The pre increment value of b:"+ ++b);
		int c=12,d=13;
		int e=c++ + ++d  + ++c +  d++;//12+14+14+14=54
		System.out.println("The value of e:"+e);
		int f=10,g=11;
		System.out.println("The pre decrement value of f:"+(--f));
		System.out.println("The post decrement value of g:"+(g--));
		int m= f-- + --g  + --f + g--;//9+9+7+9=34
		System.out.println("The value of m:"+m);
		int a1=10,b1=12;
		int c1= ++a1 + b1-- + a1++ - --b1;//11+12+11-10=24
		System.out.println("The value of c1:"+c1);
	}
}


