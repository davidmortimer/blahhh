package com.picstickapp.register;

import com.picstickapp.Car;
import com.picstickapp.user.PicstickUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.Map;

/**
 * Created by David on 11/05/2015.
 */
@RestController
public class RegisterController {


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<PicstickUser> processRegistration(@RequestBody PicstickUser picstickUser,
                                      Map<String, Object> model) {

        // implement your own registration logic here...

        // for testing purpose:
        System.out.println("first: " + picstickUser.getFirstName());
        System.out.println("last: " + picstickUser.getLastName());
        System.out.println("email: " + picstickUser.getEmail());

        return new ResponseEntity<PicstickUser>(picstickUser, HttpStatus.OK);
    }
}
