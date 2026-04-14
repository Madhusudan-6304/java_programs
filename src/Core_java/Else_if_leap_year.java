package Core_java;

public class Else_if_leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2025;
		if(year%4==0)
			System.out.println(year+" is leap year");
		else if((year%400==0)&&(year%100!=0))
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is  not leap year");
			

	}

}
