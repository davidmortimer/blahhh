package com.picstickapp.photo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by David on 08/02/2015.
 */
public final class PhotoMapper implements RowMapper<Photo> {
    @Override
    public Photo mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Photo(rs.getInt("id"), rs.getString("name"), rs.getInt("ownerId"), rs.getTimestamp("timestamp"));
    }
}
