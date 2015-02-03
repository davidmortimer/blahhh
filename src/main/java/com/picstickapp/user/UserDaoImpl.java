package com.picstickapp.user;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by David on 02/02/2015.
 */
public class UserDaoImpl extends NamedParameterJdbcDaoSupport implements UserDao {

    @Override
    public User getUser(int userId) {
        String sql = "SELECT * FROM memberp WHERE id = ?";
        return this.getJdbcTemplate().queryForObject(sql, new Object[]{userId}, new UserMapper());
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM memberp";
        return this.getJdbcTemplate().query(sql, new UserMapper());
    }

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO memberp (username, password, email) VALUES (:username, :password, :email)";
        SqlParameterSource namedParameters = new MapSqlParameterSource("username", user.getUsername())
                                            .addValue("password", user.getPassword())
                                            .addValue("email", user.getEmail());
        this.getNamedParameterJdbcTemplate().update(sql, namedParameters);
        logger.info("Created new user. Username: " + user.getUsername() +", Password: " + user.getPassword() +", Email: " + user.getEmail() );
    }
}
