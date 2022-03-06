package ecommerceordersystem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderSystemRepository extends CrudRepository<OrderSystem, String> {
	public List<OrderSystem> findByOid(String oid);
}