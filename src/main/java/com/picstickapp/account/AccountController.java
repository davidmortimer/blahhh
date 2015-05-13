package com.picstickapp.account;

import com.picstickapp.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by David on 10/05/2015.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    public AccountDao accountDao;

    @RequestMapping(method= RequestMethod.GET)
    public void test() {
        System.out.println("Test!");
        Account newAccount = new Account("testacount", "testpass", "testemail");
        accountDao.createUser(newAccount);
        System.out.println(newAccount.toString());
    }

    @RequestMapping(value = "/test", method= RequestMethod.GET)
    public void test2() {
        System.out.println("Test!");
    }
}
