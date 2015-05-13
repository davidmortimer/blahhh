package com.picstickapp.friend;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by David on 06/02/2015.
 */
public final class FriendshipMapper implements RowMapper<Friendship> {
    @Override
    public Friendship mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Friendship(rs.getInt("id"), rs.getInt("requestingId"), rs.getInt("requestedId"), rs.getInt("status"));
    }
}
