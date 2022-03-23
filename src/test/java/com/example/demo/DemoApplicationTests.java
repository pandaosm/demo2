//
//package com.example.demo;
//
//import java.util.List;

//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.demo.Controller.AccountController;
//import com.example.demo.dao.IAccount;
//import com.example.demo.dao.IClient;
//import com.example.demo.entity.Account;
//import com.example.demo.entity.Client;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//class DemoApplicationTests {
//
//	@Autowired
//	private IAccount iAccount;
//
//
//	@MockBean
//	private AccountController accountController;
//
//    
//    @Autowired
//    private IClient repository;
//    
//	@Test
//	public void testFindAll() {
//		List<Account> items = iAccount.findAll();
//
//	}
//	
//	  @Test
//	    public void getSaveNewProduct() throws Exception{
//	 Client product = repository.findByCustomerId("000001");
//	        
//	        System.out.println(product.getCustomerName());
//	         
//	        assertThat(product.getCustomerName().equals("01099"));
//	    }
//	  
//
//	
//
//}
