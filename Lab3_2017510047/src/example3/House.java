package example3;

public class House {
	
	private String kind;
	private int numOfRoom,area;
	private double price;
	private Address address;
	
	public House(String kind, int area, int numOfRoom, double price, Address address) {
		super();
		this.kind = kind;
		this.area = area;
		this.numOfRoom = numOfRoom;
		this.price = price;
		this.address = address;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getNumOfRoom() {
		return numOfRoom;
	}

	public void setNumOfRoom(int numOfRoom) {
		this.numOfRoom = numOfRoom;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "House [kind=" + kind + ", area=" + area + ", numOfRoom=" + numOfRoom + ", price=" + price + ", address="
				+ address + "]";
	}
	
	
	

}
