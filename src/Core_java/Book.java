package Core_java;

public class Book {
	String title;
	int bid;
	double price;
 public Book(int bid,String title,double price) {
	 this.bid=bid;
	 this.title=title;
	 this.price=price;
	 
 }
 public String toString() {
	 return title+" "+bid+" "+price;
 }
 public boolean equals(Object obj) {
	 Book b=(Book) obj;
	 return (this.bid==bid && this.title.equals(b.title) && this.price==price);
 }
 public int hashCode() {
	 int pricehash=(int) price;
	 return bid+title.hashCode()+Double.hashCode(price);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"java",345.99);
		Book b2=new Book(2,"python",245.99);
		Book b3=new Book(1,"java",345.99);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(b3.equals(b2));
      System.out.println(b1.hashCode());
      System.out.println(b2.hashCode());
      System.out.println(b3.hashCode());
	}

}
