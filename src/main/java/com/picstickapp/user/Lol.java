package com.picstickapp.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by David on 01/02/2015.
 */
public class Lol {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        UserDaoImpl dao = ctx.getBean("userDaoImpl", UserDaoImpl.class);

//        for (User user : dao.getAllUsers()){
//            System.out.println("[ ID: " + user.getId() + ", Username: " + user.getUsername() + ", Email: " + user.getEmail() + " ]");
//        }
        dao.createUser(new User("jbiuh", "jiuh2", "ddeed"));
    }
}
