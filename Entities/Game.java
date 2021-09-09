package Entities;

public class Game {
	public int Id;
	public String GameName;
	public String category;
	public int Price;
	
	public void game() {
		
	}
	
	
	
	
	
	
	// Fýeld
	public Game(int id, String gameName, String category,int Price) {
		super();
		this.Id = id;
		this.GameName = gameName;
		this.category = category;
		this.Price = Price;
	}
	
	
	// Getter and Setter
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	
}
