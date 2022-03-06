package ecommerceordersystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private OrderSystemRepository orderRepo;
	
	public List<OrderSystem> getAllOrders()
	{
		List<OrderSystem> orders = new ArrayList<>();
		orderRepo.findAll()
		.forEach(orders::add);
		return orders;
	}
	
	public OrderSystem getOrder(String oid) {
//		return orders.stream().filter(t -> t.getOid().equals(id)).findFirst().get();
		return orderRepo.findById(oid).get();
	}

	public void addOrder(OrderSystem order) {
		orderRepo.save(order);
	}

	public void updateOrder(String oid, OrderSystem order) {
		orderRepo.save(order);
	}

	public void deleteOrder(String oid) {
//		orders.removeIf(t -> t.getOid().equals(id));
		 orderRepo.deleteById(oid);
	}
	
	public void returnOrder(String oid, String status) {
		OrderSystem o = orderRepo.findByOid(oid).get(0);
		o.setStatus(status);
	}
}
