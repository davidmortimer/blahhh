package com.picstickapp.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
/**
 * Created by David on 02/02/2015.
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    protected JdbcTemplate jdbc;

    @Override
    public Account findByUsername(String username) {
        String sql = "SELECT * FROM memberp WHERE username = ?";
        return jdbc.queryForObject(sql, new Object[]{username}, new AccountMapper());
    }

    @Override
    public Account findByUserId(int userId) {
        String sql = "SELECT * FROM memberp WHERE id = ?";
        return jdbc.queryForObject(sql, new Object[]{userId}, new AccountMapper());
    }

    @Override
    public List<Account> getAllUsers() {
        String sql = "SELECT * FROM memberp";
        return jdbc.query(sql, new AccountMapper());
    }

    @Override
    public void createUser(Account account) {
        String sql = "INSERT INTO memberp (username, password, email) VALUES (?, ?, ?)";
        jdbc.update(sql, account.getUsername(), account.getPassword(), account.getEmail());
    }

}
