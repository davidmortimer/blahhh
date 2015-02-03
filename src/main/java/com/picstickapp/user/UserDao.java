package com.picstickapp.user;

import java.util.List;

/**
 * Created by David on 01/02/2015.
 */
public interface UserDao {

    public User getUser(int userId);
    public List<User> getAllUsers();
    public void createUser(User user);

}
