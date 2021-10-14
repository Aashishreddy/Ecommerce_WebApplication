package com.example.controller;

import com.example.Dto.CustomerDetails;
import com.example.Dto.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRespository custRepo;

    @GetMapping("/addCustomer")
    public String addCustomer() throws Exception{
        CustomerDetails cust = new CustomerDetails();
        cust.setFirstName("Aashish Reddy");
        cust.setLastName("Vundhyala");
        cust.setAddress("17717 Preston Road");
        cust.setEmailId("aashishreddy5555@gmail.com");
        cust.setUserName("Aashish7*");
        cust.setPassword("Aashish1998");
        cust.setMobileNumber("(682)-241-2012");

        custRepo.save(cust);
        return "Saved";
    }

}
