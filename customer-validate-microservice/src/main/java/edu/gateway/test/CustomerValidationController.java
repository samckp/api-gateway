package edu.gateway.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/customer")
public class CustomerValidationController {

    @GetMapping("/valid")
    public String customerValidate(){

        return "Customer Validated successfully !!";
    }
}