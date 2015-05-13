package com.picstickapp.photo;

import com.picstickapp.group.Group;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.List;

/**
 * Created by David on 08/02/2015.
 */
public class PhotoDaoImpl extends NamedParameterJdbcDaoSupport implements PhotoDao {
    @Override
    public Photo getPhoto(int photoId) {
        String sql = "SELECT * FROM photos WHERE id = ?";
        return this.getJdbcTemplate().queryForObject(sql, new Object[]{photoId}, new PhotoMapper());
    }

    @Override
    public List<Photo> getAllPhotos() {
        String sql = "SELECT * FROM photos";
        return this.getJdbcTemplate().query(sql, new PhotoMapper());
    }

    @Override
    public void uploadPhoto(Photo photo) {
        String sql = "INSERT INTO photos (name, ownerId, timestamp) VALUES (:name, :ownerId, :timestamp)";
        SqlParameterSource namedParameters = new MapSqlParameterSource("name", photo.getName())
                .addValue("ownerId", photo.getOwnerId()).addValue("timestamp", photo.getTimestamp());
        this.getNamedParameterJdbcTemplate().update(sql, namedParameters);
        logger.info("Uploaded new photo. Name: " + photo.getName() + ", Owner Id: " + photo.getOwnerId() + ", Timestamp: " + photo.getTimestamp());
    }

}
