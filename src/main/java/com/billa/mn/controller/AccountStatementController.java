package com.billa.mn.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import com.billa.mn.Service.AccountStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountStatementController {

    @Autowired
    private AccountStatementService accountStatementService;

    @PostMapping("/Check-Balance")
    public String checkBalance(){
        String balance = accountStatementService.checkBalance();
        return balance;
    }

    @PostMapping("/Update-Balance")
    public String updateBalance(){
       String balanceUpdate = accountStatementService.updateBalance();
        return balanceUpdate;
    }

}
