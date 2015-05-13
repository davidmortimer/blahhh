package com.picstickapp.group;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by David on 08/02/2015.
 */
public final class GroupMapper implements RowMapper<Group> {
    @Override
    public Group mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Group(rs.getInt("id"), rs.getString("name"), rs.getInt("ownerId"));
    }
}
