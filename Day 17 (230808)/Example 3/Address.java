package auto.wiring.annotation;

public class Address {
	private String houseAddress;

	public void setHouseAddress(String houseAddress) {
		System.out.println("Address class setHouseAddress");
		this.houseAddress = houseAddress;
	}

	@Override
	public String toString() {
		return "Address [houseAddress=" + houseAddress + "]";
	}

}
