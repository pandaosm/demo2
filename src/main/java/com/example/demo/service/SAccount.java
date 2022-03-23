package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
/*
import com.capitalbanker.cgb.ws.common.enums.CommonErrors;
import com.capitalbanker.cgb.ws.common.exception.CBException;
import com.capitalbanker.cgb.ws.common.util.ErrorUtilities;
import com.capitalbanker.cgb.ws.common.util.RequestUtilities;
import com.example.ObjectUtil.StringUtilities;*/
import com.example.demo.Exception.ErrorObject;
import com.example.demo.dao.IAccount;
import com.example.demo.entity.Account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

@Service
public class SAccount {	
	@Autowired
	private  IAccount iAccount;
	
	//@Autowired 
//	private ErrorUtilities errorUtilities;
	
	public static StringUtils StringUtils;
	
	public List<Account> getAllAccounts(AccountListServiceRequestObject accountListServiceRequest){
		List<String> clientListId,accountListId;

		// List<String> clientListId = (accountListServiceRequest.getClientIds() != null) ? StringUtilities.constructListFromCommaSeparatedElement(accountListServiceRequest.getClientIds()) : null;
		  //  List<String> accountListId = (accountListServiceRequest.getAccountId() != null) ? StringUtilities.constructListFromCommaSeparatedElement(accountListServiceRequest.getAccountId()) : null;

		    
		//List<Account> listAccount= iAccount.findAllCompte(clientListId,accountListId);
		
		/*
		 * List<Account> listAccount = new ArrayList<Account>(); Account account = new
		 * Account(); listAccountDto.forEach(accountDto -> {
		 * account.setCompte(accountDto.getCompte());
		 * account.setCustomer(accountDto.getCustomer());
		 * account.setTyp(accountDto.getTyp());
		 * account.setDevise(accountDto.getDevise());
		 * account.setPosdev(accountDto.getPosdev());
		 * account.setDatfrm(accountDto.getDatfrm()); listAccount.add(account); });
		 */
		return null;
		}
	
	
	public Account getAccount(String customer , String acc) {

	     Account account= iAccount.getAccount(customer,acc);
	    return account ;
	}
	 
}
