package Core_java;

public class Car_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Swift");
		System.out.println(c.getName());
		Tyre [] ty=c.getTyres();
		for(int i=0;i<ty.length;i++){
			System.out.println(ty[i].getBrand());
		}

	}

}
