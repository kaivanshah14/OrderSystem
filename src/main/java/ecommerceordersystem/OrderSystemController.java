package ecommerceordersystem;

import java.util.List;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderSystemController {
	@Autowired 
	private OrderService orderService;
	
	@RequestMapping("/orders")
	public List<OrderSystem> getAllOrders(){
		return orderService.getAllOrders();
		}
	
	@RequestMapping("/orders/{oid}")
	public OrderSystem getOrder(@PathVariable String oid){
		return orderService.getOrder(oid);
		}
	
	@RequestMapping(method=RequestMethod.POST, value="/orders")
	public void addOrder(@RequestBody OrderSystem order)
	{
		orderService.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/orders/{id}")
	public void updateorder(@PathVariable String id, @RequestBody OrderSystem order)
	{
		orderService.updateOrder(id, order);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/orders/{id}")
	public void deleteOrder(@PathVariable String id)
	{
		orderService.deleteOrder(id);
	}
	
	@RequestMapping(method = RequestMethod.PATCH, value="/orders/{id}")
	public void returnOrder(@PathVariable String id, @RequestParam("status") String status)
	{
		orderService.returnOrder(id, status);
	}
}
