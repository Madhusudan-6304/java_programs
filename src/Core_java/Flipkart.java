package Core_java;

public class Flipkart {
	private String brand;
	private double price;
	private double ratings;
	public void setBrand(String brand){
		this.brand=brand;
		
	}
	public void setPrice(double price){
		if(price>0)
			this.price=price;
		else
			throw new PriceException();
		
	}
	public void setRatings(double ratings) throws RatingsExecption{
		if(ratings>=0)
			this.ratings=ratings;
		else
			throw new RatingsExecption();
		
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public double getRatings() {
		return ratings;
	}
	
	Flipkart(String brand,double price,double ratings) throws RatingsExecption {
		setPrice(price);
		setRatings(ratings);
		setBrand(brand);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
	Flipkart f=new Flipkart("Shoes",4789.99,-4.5);
	System.out.println(f.getBrand());
	System.out.println(f.getPrice());
	System.out.println(f.getRatings());
	
	}
	catch(PriceException e) {
	System.out.println("Price should not be zero");
	
	}
	catch(RatingsExecption e) {
		System.out.println("ratings should  be greater zero");
		
		}

	}
}
