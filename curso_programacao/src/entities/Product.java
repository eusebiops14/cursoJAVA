//AULA 65
package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	


	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity; //o this deixa claro que quero acessar o atributo da fun��o e n�o o par�metro
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+", "
				+ quantity
				+" units, Total: $ "
				+String.format("%.2f", totalValueInStock());
	}

} 
