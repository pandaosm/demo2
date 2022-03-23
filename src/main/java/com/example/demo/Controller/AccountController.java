package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dao.IAccount;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountListServiceRequestObject;
import com.example.demo.service.AccountServiceRequest;
import com.example.demo.service.SAccount;

@RestController
@RequestMapping("/account")
public class AccountController {

//	@Autowired
//	private CacheManager cacheManager;

	@Autowired
	private SAccount sAccount;

	@Autowired
	private IAccount iAccount;
	
	/*
	 * @GetMapping("/getAllAccounts")
	 * 
	 * @Cacheable(key = "listeAccount", value = "listeAccountCache") public
	 * List<Account> getAllAccounts(@RequestParam(value = "language", required =
	 * true) String language,
	 * 
	 * @RequestParam(value = "accountId", required = false) String accountId,
	 * 
	 * @RequestParam(value = "customerIdList", required = false) String clientId,
	 * 
	 * @RequestParam(value = "withTotalAmountExpenses", required = false) String
	 * withTotalAmountExpenses) throws Exception {
	 * 
	 * AccountListServiceRequestObject accountListServiceRequest = new
	 * AccountListServiceRequestObject();
	 * accountListServiceRequest.setLanguage(language);
	 * accountListServiceRequest.setAccountIds(accountId);
	 * accountListServiceRequest.setClientIds(clientId);
	 * accountListServiceRequest.setWithTotalAmountExpenses(withTotalAmountExpenses)
	 * ; List<Account> response =
	 * sAccount.getAllAccounts(accountListServiceRequest);
	 * 
	 * return response; }
	 */
	
	@GetMapping("/Accounts")
	@Cacheable(key = "listeAccount", value = "listeAccountCache")
	public List<Account> getAllAccounts()
			throws Exception {

		return iAccount.findAll();
	}
	
	

	/*
	 * @GetMapping("/getAccount") public Account getAccount(@RequestParam(value =
	 * "language", required = true) String language,
	 * 
	 * @RequestParam(value = "accountNumber", required = false) String
	 * accountNumber,
	 * 
	 * @RequestParam(value = "customerIdList", required = false) String customerId,
	 * 
	 * @RequestParam(value = "withTotalAmountExpenses", required = false) String
	 * withTotalAmountExpenses) throws Exception {
	 * 
	 * AccountServiceRequest accountServiceRequest = new AccountServiceRequest();
	 * accountServiceRequest.setLanguage(language);
	 * accountServiceRequest.setAccountNumber(accountNumber);
	 * accountServiceRequest.setCustomerId(customerId);
	 * accountServiceRequest.setWithTotalAmountExpenses(withTotalAmountExpenses);
	 * Account response = sAccount.getAccount(accountServiceRequest.getCustomerId(),
	 * accountServiceRequest.getAccountNumber());
	 * 
	 * return response; }
	 */
	
//	@GetMapping("/getAllAccount")
//	public List<Account> getAccounts(@RequestParam(value = "language", required = true) String language,
//			@RequestParam(value = "accountNumbers", required = false) String accountNumbers,
//			@RequestParam(value = "customerIds", required = false) String customerIds,
//			@RequestParam(value = "withTotalAmountExpenses", required = false) String withTotalAmountExpenses)
//			throws Exception {
//
//		
//	}
	
	
	

//Java reactive
	@GetMapping("/getAccountRemote")
	@Cacheable(key = "getAccount", value = "getAccountCache")
	public Account getAccount() {
		WebClient web = WebClient.create();
		WebClient.ResponseSpec responseSpec = web.get().uri(
				"https://localhost:10402/account/getAccount?language=EN&customerIdList=403361&withTotalAmountExpenses=true&accountNumber=04033610000")
				.retrieve();
		Account responseBody = responseSpec.bodyToMono(Account.class).block();
		return responseBody;
	}
	
//	@GetMapping("/cacheAccountsStatus")
//	Status allAccountCache(){
//		Status statusCache = cacheManager.getStatus();	
//	return statusCache;
//	}
	
	@GetMapping("/AllAccounts")
	public List<Account> getAccounts(){

		List<Account> response = iAccount.findAll();

		return response;
	}
}
