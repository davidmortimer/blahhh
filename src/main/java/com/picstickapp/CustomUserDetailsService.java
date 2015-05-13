package com.picstickapp;

import com.picstickapp.account.Account;
import com.picstickapp.account.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static java.util.Arrays.asList;

/**
 * Created by David on 10/05/2015.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountDao.findByUsername(username);
        if (account == null) {
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
        return new User(username, "password", getGrantedAuthorities(username));
    }
    private Collection<? extends GrantedAuthority> getGrantedAuthorities(String username) {
        Collection<? extends GrantedAuthority> authorities;
        if (username.equals("david")) {
            authorities = asList(() -> "ROLE_ADMIN", () -> "ROLE_BASIC");
        } else {
            authorities = asList(() -> "ROLE_BASIC");
        }
        return authorities;
    }
}