package com.picstickapp.account;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by David on 02/02/2015.
 */
public final class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Account(rs.getInt("id"), rs.getString("username"), rs.getString("email"));
    }
}
