package edu.gateway.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/balance")
public class BalanceCheckController {

    @GetMapping("/check")
    public String getBalance(){

        return "Your Balance is Rs.1000 Only";
    }
}