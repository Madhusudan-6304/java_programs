package Core_java;

public class Else_if_num_vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='Z';
		if(ch<=0 && ch>='9')
			System.out.println(ch+" is a number");
		else if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
				System.out.println(ch+" is a vowel");
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println(ch+" is a consonant");
		else
			System.out.println(ch+" is a neither number nor alphabet");
				

	}

}
