package com.spring.accounts.service.client;

import com.spring.accounts.model.Cards;
import com.spring.accounts.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("cards")
public interface CardsFeignClient {

  @RequestMapping(method = RequestMethod.POST, value = "myCards" ,  consumes =  "application/json")
    List<Cards> getCardsDetails(@RequestBody Customer customer);

}
