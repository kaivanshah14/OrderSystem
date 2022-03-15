package ecommerceordersystem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSystemRepository extends JpaRepository<OrderSystem, String> {
	public List<OrderSystem> findByOid(String oid);
	
	@Query(value="SELECT * FROM orders WHERE orderstatus=:pr",nativeQuery=true)
	public List<OrderSystem> findByPrice(@Param("pr") String price);
	
	@Query(value="SELECT * FROM orders WHERE orderstatus=:os",nativeQuery=true)
	public List<OrderSystem> findByOrderstatus(@Param("os") String orderstatus);
	
	@Query(value="SELECT * FROM orders WHERE orderstatus=:pm",nativeQuery=true)
	public List<OrderSystem> findByPaymentmethod(@Param("pm") String paymentMethod);
	
	@Query(value="SELECT * FROM orders WHERE oid=?1",nativeQuery=true)
	public OrderSystem findByUnique(@Param("oid") String oid);
}