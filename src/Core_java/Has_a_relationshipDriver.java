package Core_java;

public class Has_a_relationshipDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Has_a_relationship_car c=new  Has_a_relationship_car("maruthi");
		 System.out.println(c.getBrand());
		 Has_a_relationship h=c.getHas_a_relationship_car();
		 System.out.println(h.getCc());

	}

}
