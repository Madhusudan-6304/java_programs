package Core_java;

public class Switch_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10;
		char op='-';
		switch(op) {
		case '+':System.out.println("Addition:"+(a+b));
                 break;
		case '-':System.out.println("Subtraction:"+(a-b));
                  break;
		case '*':System.out.println("Multiplication:"+(a*b));
                  break;
		case '/':System.out.println("Division:"+(a*b));
                  break;
		case '%':System.out.println("Remainder:"+(a%b));
                  break;
		default:System.out.println(" Invalid operator");
                break;

	}
		

}
}
