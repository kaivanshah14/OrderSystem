package ecommerceordersystem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSystemRepository extends JpaRepository<OrderSystem, String> {
	public List<OrderSystem> findByOid(String oid);

}