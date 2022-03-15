package ecommerceordersystem;

import java.util.List;
import java.util.Optional;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import antlr.StringUtils;
import ecommerceordersystem.exception.OrderNotFoundException;
import ecommerceordersystem.exception.UniqueValidationException;


@RestController
public class OrderSystemController {
	@Autowired 
	private OrderService orderService;
	
	@RequestMapping("/orders")
	public Optional<List<OrderSystem>> getAllOrders (
			@RequestParam(required=false) Optional<String> orderstatus, 
			@RequestParam(required=false) Optional<String> price, 
			@RequestParam(required=false) Optional<String> paymentmethod
			) throws IllegalArgumentException {
		return orderService.getAllOrders(orderstatus,price,paymentmethod);
	}
	
	@RequestMapping("/orders/{oid}")
	public OrderSystem getOrder(@PathVariable String oid) throws IllegalArgumentException {
		return orderService.getOrder(oid);
		}
	
	@RequestMapping(method=RequestMethod.POST, value="/orders") 
	public void addOrder(@RequestBody OrderSystem order) throws UniqueValidationException, OrderNotFoundException, IllegalArgumentException {
		orderService.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/orders/{id}")
	public void updateorder(@PathVariable String id, @RequestBody OrderSystem order) throws OrderNotFoundException, IllegalArgumentException {
		orderService.updateOrder(id, order);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/orders/{id}") 
	public void deleteOrder(@PathVariable String id) throws IllegalArgumentException, OrderNotFoundException {
		orderService.deleteOrder(id);
	}
	
	@RequestMapping(method = RequestMethod.PATCH, value="/orders/{id}")
	public void returnOrder(@PathVariable String id, @RequestBody OrderSystem order) throws IllegalArgumentException, OrderNotFoundException
	{
		orderService.returnOrder(id, order);
	}
}
