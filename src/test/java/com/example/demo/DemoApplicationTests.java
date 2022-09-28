
package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Controller.AccountController;
import com.example.demo.dao.IAccount;
import com.example.demo.dao.IClient;
import com.example.demo.entity.Account;
import com.example.demo.entity.Client;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private IAccount iAccount;

	@MockBean
	private AccountController accountController;

	@Autowired
	private IClient repository;

	private static Logger LOGGER = null;

	@BeforeClass
	public static void setLogger() throws MalformedURLException {
		System.setProperty("log4j.configurationFile", "log4j2-testConfig.xml");
		LOGGER = LogManager.getLogger();
	}

	@Test
	public void testFindAll() {
		List<Account> items = iAccount.findAll();
		assertThat(3);


	}
//
//	@Test
//	public void getSaveNewProduct() throws Exception {
//		Client product = repository.findByCustomerId("000001");
//
//		System.out.println(product.getCustomerName());
//
//		assertThat(product.getCustomerName().equals("01099"));
//	}

}
