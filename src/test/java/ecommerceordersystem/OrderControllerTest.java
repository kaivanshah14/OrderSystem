package ecommerceordersystem;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.hamcrest.Matchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;



@WebMvcTest(OrderSystemController.class)
public class OrderControllerTest {
//	@Autowired
//    MockMvc mockMvc;
//    @Autowired
//    ObjectMapper mapper;
//    
//    @MockBean
    OrderSystemRepository orderRepository;
//    
//    OrderSystem o1 = new OrderSystem("105","11-03-2022","1","Skye","7666984915","Berlin","Jacket","Green","700","Card","new");
//    OrderSystem o2 = new OrderSystem("106","12-03-2022","2","Yoru","7777984915","Icebox","Chain","Blue","300","Cash","new");
    
    
//    @Test
//    public void getOrders_success() throws Exception {
//        ArrayList<OrderSystem> orders = new ArrayList<>(Arrays.asList(o1, o2));
//        
//        Mockito.when(orderRepository.findAll()).thenReturn(orders);
//        
//        mockMvc.perform(MockMvcRequestBuilders
//                .get("/orders")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[0].oid", is("105")));;
//    }
	
	@Test
	public void testReadAll() {
		List list = orderRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
}
