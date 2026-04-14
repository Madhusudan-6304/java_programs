package Core_java;

public class Inheritance_Cardiologist extends Inhertiance_Doctor {
	public static void bypasssurgery() {
		System.out.println("Cardiologist can do By-pass-surgery");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bypasssurgery();
		Inheritance_Cardiologist.checkpulse();
		System.out.println(Inheritance_Cardiologist.age+" "+Inheritance_Cardiologist.name);
		

	}

}
