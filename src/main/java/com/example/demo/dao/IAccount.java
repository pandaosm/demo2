package com.example.demo.dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Generic.GenericRepository;
import com.example.demo.entity.Account;

@Repository
public interface IAccount extends GenericRepository<Account, String> {

	@Query(nativeQuery = true, countQuery = "SELECT COUNT(1)  FROM account_Temp account"
			+ "  WHERE (1=0 or account.client In :clientId  or account.compte In :accNum) "
			+ " ORDER BY account.client, account.compte ", value = "SELECT *  FROM account_temp account  "
					+ "WHERE (1=0 or account.client In :clientId  or account.compte In :accNum) "
					+ " ORDER BY account.client, account.compte ")
	List<Account> findAllCompte(@Param("clientId") List<String> paramList1, @Param("accNum") List<String> paramList2);

	/*
	 * @Query(nativeQuery = true, value =
	 * "Select CNT from table (pk_pwc.getmvtlist( :reference ,:accountNumber , :empty1 , :empty2 , :minAmount , :maxAmount , :startDate , :endDate , :transactionDescription , :transactionGroupCode, :filter , :startRowNumber , :endRowNumber , :order , :sign , :var ) )"
	 * ) BigDecimal getAccountActivityCount(@Param("reference") String paramString1,
	 * 
	 * @Param("accountNumber") String paramString2, @Param("empty1") String
	 * paramString3,
	 * 
	 * @Param("empty2") String paramString4, @Param("minAmount") String
	 * paramString5,
	 * 
	 * @Param("maxAmount") String paramString6, @Param("startDate") Date paramDate1,
	 * 
	 * @Param("endDate") Date paramDate2, @Param("transactionDescription") String
	 * paramString7,
	 * 
	 * @Param("transactionGroupCode") String paramString8, @Param("filter") String
	 * paramString9,
	 * 
	 * @Param("startRowNumber") Integer paramInteger1, @Param("endRowNumber")
	 * Integer paramInteger2,
	 * 
	 * @Param("order") String paramString10, @Param("sign") String paramString11,
	 * 
	 * @Param("var") String paramString12);
	 */

//	@Query(" SELECT new com.capitalbanker.cgb.ws.cbk.multichannel.business.domain.response.ProductResponseObject
//	 (Sum(account.bookBalalnce) as consolidatedBookBalance ,
//	 Sum(account.availableBalance) as consolidatedAvailableBalance,
//	 account.currencyIsoCode, account.productCode) FROM Account
//
//	account WHERE (1=0
//	 or account.client In :clientId or account.compte In :accNum ) GROUP BY
//	 account.currencyIsoCode,account.productCode ")
//
//	List<ProductResponseObject> getProductDistributionList(@Param("clientId") List<String> paramList1,
//			@Param("accNum") List<String> paramList2);
	
	@Query(countQuery = "SELECT COUNT(1)  FROM Account account  WHERE (:clientEmpty = 'O' or account.client= :clientId)"
			+ "  and  (:accountEmpty = 'O' or account.accountNumber= :accountNumber) "
			+ "and  account.accountNumber = :accountNumber ORDER BY account.clientId, account.accountNumber ", 
			value = "SELECT account  FROM Account account  WHERE (1=0 or  account.client = :clientId "
					+ " or account.accountNumber = :accountNumber)  and  account.accountNumber = :accountNumber "
					+ "ORDER BY account.customer.customerId, account.accountNumber ")
	  Account getAccount(@Param("clientId") String param1 , @Param("accountNumber") String paramString);
	
	
	@Query(value = "select account from Account account where account.customer.customerId='010330' and account.accountNumber='00103300036' ")
	  List<Account> findAll();
	
	
	@Query(value="select account from Account account where account.accountNumber=:account")
	Optional<Account> findById(@Param("account") String account);

	  
}
