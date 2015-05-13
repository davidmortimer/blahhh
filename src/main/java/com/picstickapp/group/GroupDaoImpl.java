package com.picstickapp.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by David on 08/02/2015.
 */
public class GroupDaoImpl extends NamedParameterJdbcDaoSupport implements GroupDao {

    @Override
    public Group getGroup(int groupId) {
        String sql = "SELECT * FROM groups WHERE id = ?";
        return this.getJdbcTemplate().queryForObject(sql, new Object[]{groupId}, new GroupMapper());
    }

    @Override
    public List<Group> getAllGroups() {
        String sql = "SELECT * FROM groups";
        return this.getJdbcTemplate().query(sql, new GroupMapper());
    }

    @Override
    public void createGroup(Group group) {
        String sql = "INSERT INTO groups (name, ownerId) VALUES (:name, :ownerId)";
        SqlParameterSource namedParameters = new MapSqlParameterSource("name", group.getName())
                .addValue("ownerId", group.getOwnerId());
        this.getNamedParameterJdbcTemplate().update(sql, namedParameters);
        logger.info("Created new group. Name: " + group.getName() +", Owner Id: " + group.getOwnerId());

    }

}
