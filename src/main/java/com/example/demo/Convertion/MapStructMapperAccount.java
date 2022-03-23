package com.example.demo.Convertion;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.demo.EntityDto.AccountDto;
import com.example.demo.entity.Account;

@Mapper

public interface MapStructMapperAccount {
	
//	@Mappings({
//	      @Mapping(target="accountNumber", source="compte"),
//	      @Mapping(target="customer", source="customer"),
//	      @Mapping(source = "devise" , target = "devise")
//	    })
//	AccountDto accountToAccountDto(Account book);
//
//	@Mappings({
//		@Mapping(source = "compte" , target = "compte"),
//		@Mapping(source = "customer" , target = "customer"),
//		@Mapping(source = "devise" , target = "devise")
//	})
//	Account accountDtoToAccount(AccountDto accountDto);


}
