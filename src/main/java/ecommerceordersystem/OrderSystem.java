package ecommerceordersystem;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderSystem")
public class OrderSystem {
	
	@Id
	@Column(name="Oid")
	private String oid;
	
	private String order_date, order_items;
	private String cust_name, cust_no, cust_add, cust_email;
	private String prod_id, prod_name, prod_color, prod_size, prod_price;
	private String payment_type, payment_method;
	private String status;
	public OrderSystem() {};
	public OrderSystem(String oid, String order_date, String order_items, String cust_name, String cust_no,
			String cust_add, String cust_email, String prod_id, String prod_name, String prod_color, String prod_size,
			String prod_price, String payment_type, String payment_method) {
		super();
		this.oid = oid;
		this.order_date = order_date;
		this.order_items = order_items;
		this.cust_name = cust_name;
		this.cust_no = cust_no;
		this.cust_add = cust_add;
		this.cust_email = cust_email;
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_color = prod_color;
		this.prod_size = prod_size;
		this.prod_price = prod_price;
		this.payment_type = payment_type;
		this.payment_method = payment_method;
		
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_data(String order_date) {
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
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
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
	public String getProd_size() {
		return prod_size;
	}
	public void setProd_size(String prod_size) {
		this.prod_size = prod_size;
	}
	public String getProd_price() {
		return prod_price;
	}
	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
