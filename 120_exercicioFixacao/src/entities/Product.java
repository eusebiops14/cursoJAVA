package entities;

public class Product {

	private String name;
	private Double price;
	
	//construtor padrão
	public Product() {
	}
	
	//construtores
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	//metodos getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
