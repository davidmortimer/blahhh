package com.picstickapp.friend;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

/**
 * Created by David on 06/02/2015.
 */
public class FriendshipDaoImpl extends NamedParameterJdbcDaoSupport implements FriendshipDao {

    @Override
    public void request(int requesterId, int requestedId) {
        String sql = "INSERT INTO friendship (requesterId, requestedId, status) VALUES (:requesterId, :requestedId, :status)";
        SqlParameterSource namedParameters = new MapSqlParameterSource("requesterId", requesterId).addValue("requestedId", requestedId).addValue("status", "0");
        this.getNamedParameterJdbcTemplate().update(sql, namedParameters);
        logger.info("UserId(" + requesterId + ")" + "sent friend request to userId(" + requestedId + ").");
    }

    @Override
    public void accept(int requesterId, int requestedId) {
        String sql = "UPDATE friendship SET status='1' WHERE (requesterId, requestedId, status) VALUES (:requesterId, :requestedId, :status)";
        SqlParameterSource namedParameters = new MapSqlParameterSource("requesterId", requesterId).addValue("requestedId", requestedId).addValue("status", "0");
        this.getNamedParameterJdbcTemplate().update(sql, namedParameters);
        logger.info("UserId(" + requestedId + ")" + "accepted friend request from userId(" + requesterId + ").");
    }
}
