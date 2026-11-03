package Com.java.hotel;

public class Hotel {

	int id;
	String name;
	String room;
	float price;
	public Hotel(int id, String name, String room, float price) {
		super();
		this.id = id;
		this.name = name;
		this.room = room;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRoom() {
		return room;
	}
	public float getPrice() {
		return price;
	}
	
	
	
}
