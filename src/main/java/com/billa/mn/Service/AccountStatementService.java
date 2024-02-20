package com.billa.mn.Service;


import org.springframework.stereotype.Service;

@Service
public class AccountStatementService {


    public String checkBalance(){
     return"Balance:$10000.80";
    }

    public String updateBalance(){
        return"Balance Updated";
    }

}
