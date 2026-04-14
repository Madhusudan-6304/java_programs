package Core_java;

public class Product {
	int id;
	double price;
	String category;
	String name;
	public Product(int id,double price,String category,String name) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
		
	}
	public String toString() {
		return id+" "+name+" "+price+" "+category;
	}
	public boolean equals(Object obj) {
		Product p=(Product) obj;
		return (this.id==p.id && this.name.equals(p.name) && this.price==p.price && this.category.equals(p.category) );
		
	}
	public int hashCode() {
		return id+Double.hashCode(price)+category.hashCode()+name.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1,450.55,"Electronics","Phone");
		Product p2=new Product(2,250.55,"Handware","metal_handring");
		Product p3=new Product(1,450.55,"Electronics","Phone");
     System.out.println(p1.toString());
     System.out.println(p2);
     System.out.println(p3);
     System.out.println(p1.equals(p2));
     System.out.println(p2.equals(p3));
     System.out.println(p1.equals(p3));
     System.out.println(p1.hashCode());
     System.out.println(p2.hashCode());
     System.out.println(p3.hashCode());
	}

}
