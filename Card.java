package week06;

public class Card {
	String name;
	int value;
	
	public Card(int value, String name) {
		this.name = name;
		this.value = value;
	}
	
	
	public String getName() {return name;}
	public void setCardName(String name) {this.name = name;}
	
	public Integer getValue() {return value;}
	public void setCardvalue(int value) {this.value = value;}
	
	public void describe() {
		System.out.println(name + " (Value: " + value + ")");
	}
}
