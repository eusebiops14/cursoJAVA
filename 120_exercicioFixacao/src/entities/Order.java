package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus orderstatus;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus orderstatus, Client client) {
		
		this.moment = moment;
		this.orderstatus = orderstatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(OrderStatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	//public List<OrderItem> getItems() { -- REMOVIDO PARA PROTEGER A LISTA QUE SO PODER� SER ALTERADA USANDO ADD OR REMOVE
	//	return items;
	//}

	//public void setItems(List<OrderItem> items) { -- NAO POSSO PERMITIR QUE A CLASSE ORDER RECEBA UMA NOVA LISTA ASSOCIADA A E0LA
	//	this.items = items;
	//}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.add(item);
	}
	
	public double total() {
		double sum =0.0;
		for (OrderItem it : items) {
			sum = sum + it.subTotal();
		}
		return sum;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(orderstatus + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
	
	
	
}
