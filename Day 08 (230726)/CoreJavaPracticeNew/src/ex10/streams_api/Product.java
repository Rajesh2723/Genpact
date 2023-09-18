package ex10.streams_api;

public class Product {
	private int pId;
	private String brand;
	private String product;
	private double price;
	private boolean availability;

	public Product() {
		super();
	}

	public Product(int pId, String brand, String product, double price, boolean availability) {
		super();
		this.pId = pId;
		this.brand = brand;
		this.product = product;
		this.price = price;
		this.availability = availability;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "\n Product [pId=" + pId + ", brand=" + brand + ", product=" + product + ", price=" + price
				+ ", availability=" + availability + "]";
	}

}
