package ecommerceordersystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import ecommerceordersystem.exception.OrderNotFoundException;
import ecommerceordersystem.exception.UniqueValidationException;

@Service
public class OrderService {
	
	@Autowired
	private OrderSystemRepository orderRepo;
	
	public Optional<List<OrderSystem>> getAllOrders(@RequestParam(required=false) Optional<String> orderstatus, @RequestParam(required=false) Optional<String> price, @RequestParam(required=false) Optional<String> paymentmethod) throws IllegalArgumentException{
		if(orderstatus.isEmpty() && price.isEmpty() && paymentmethod.isEmpty())
			return Optional.ofNullable(orderRepo.findAll());
		else if(orderstatus.isPresent())
			return Optional.ofNullable(orderRepo.findByOrderstatus(orderstatus.get()));
		else if(price.isPresent())
			return Optional.ofNullable(orderRepo.findByPrice(price.get()));
		else if(paymentmethod.isPresent())
			return Optional.ofNullable(orderRepo.findByPaymentmethod(paymentmethod.get()));
		else return Optional.ofNullable(orderRepo.findAll());
//		
//		List<OrderSystem> orders = new ArrayList<>();
//		orderRepo.findAll()
//		.forEach(orders::add);
//		return orders;
	}
	
	public OrderSystem getOrder(String oid) throws IllegalArgumentException {
//		return orders.stream().filter(t -> t.getOid().equals(id)).findFirst().get();
		return orderRepo.findById(oid).get();
	}

	public void addOrder(OrderSystem order)  throws UniqueValidationException, OrderNotFoundException,IllegalArgumentException{
		if(orderRepo.findByUnique(order.getOid())!=null)
			throw new UniqueValidationException("Record already found with given order id");
		orderRepo.save(order);
	}

	public void updateOrder(String oid, OrderSystem order) throws OrderNotFoundException, IllegalArgumentException{
		if(!orderRepo.existsById(order.getOid()))
			throw new OrderNotFoundException("Mentioned Order ID doesn't exist");
		orderRepo.save(order);
	}

	public void deleteOrder(String oid) throws IllegalArgumentException, OrderNotFoundException {
//		orders.removeIf(t -> t.getOid().equals(id));
//		if(!orderRepo.existsById(order.getOid()))
//			throw new OrderNotFoundException("Mentioned Order ID doesn't exist");
		 orderRepo.deleteById(oid);
	}
	
	public OrderSystem returnOrder(String oid, OrderSystem order) throws IllegalArgumentException, OrderNotFoundException {
		if(!orderRepo.existsById(order.getOid()))
			throw new OrderNotFoundException("Mentioned Order ID doesn't exist");
		OrderSystem o = orderRepo.findById(oid).get();
		o.setOrderstatus(order.getOid());
		o.setOrderstatus(order.getOrderstatus());
		return orderRepo.save(o);
	}
}
