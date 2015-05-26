package com.picstickapp.account;

import com.picstickapp.user.PicstickUser;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

/**
 * Created by David on 01/02/2015.
 */
public interface AccountDao {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Account findByUsername(String username);
    public Account findByUserId(int userId);
    public List<Account> getAllUsers();
    public void createUser(PicstickUser picstickUser);

}
