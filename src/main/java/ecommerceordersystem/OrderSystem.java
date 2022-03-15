package ecommerceordersystem;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderSystem {
	
	@Id
	@Column(name="oid")
	private String oid;
	
	@Column(name="order_date")
	private String order_date;
	
	@Column(name="order_items")
	private String order_items;
	
	@Column(name="cust_name")
	private String cust_name; 
	
	@Column(name="cust_no")
	private String cust_no;
	
	@Column(name="cust_add")
	private String cust_add;
	
	@Column(name="prod_name")
	private String prod_name;
	
	@Column(name="prod_color")
	private String prod_color;
	
	@Column(name="price")
	private String price;
	
	@Column(name="paymentmethod")
	private String paymentmethod;
	
	@Column(name="orderstatus")
	private String orderstatus;
	
	public OrderSystem() {}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getOrder_items() {
		return order_items;
	}

	public void setOrder_items(String order_items) {
		this.order_items = order_items;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_add() {
		return cust_add;
	}

	public void setCust_add(String cust_add) {
		this.cust_add = cust_add;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_color() {
		return prod_color;
	}

	public void setProd_color(String prod_color) {
		this.prod_color = prod_color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPaymentMethod() {
		return paymentmethod;
	}

	public void setPaymentMethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public OrderSystem(String oid, String order_date, String order_items, String cust_name, String cust_no,
			String cust_add, String prod_name, String prod_color, String price, String paymentmethod,
			String orderstatus) {
		super();
		this.oid = oid;
		this.order_date = order_date;
		this.order_items = order_items;
		this.cust_name = cust_name;
		this.cust_no = cust_no;
		this.cust_add = cust_add;
		this.prod_name = prod_name;
		this.prod_color = prod_color;
		this.price = price;
		this.paymentmethod = paymentmethod;
		this.orderstatus = orderstatus;
	}
	
	
	
}
