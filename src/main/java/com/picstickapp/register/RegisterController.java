package com.picstickapp.register;

import com.picstickapp.account.AccountDao;
import com.picstickapp.user.PicstickUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by David on 11/05/2015.
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    public AccountDao accountDao;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<PicstickUser> create(@RequestBody PicstickUser picstickUser, Map<String, Object> model) {

        // implement your own registration logic here...
        accountDao.createUser(picstickUser);
        // for testing purpose:
        System.out.println("first: " + picstickUser.getUsername());
        System.out.println("last: " + picstickUser.getPassword());
        System.out.println("email: " + picstickUser.getEmail());

        return new ResponseEntity<PicstickUser>(picstickUser, HttpStatus.OK);
    }
}
