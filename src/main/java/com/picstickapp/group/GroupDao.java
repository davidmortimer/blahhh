package com.picstickapp.group;

import java.util.List;

/**
 * Created by David on 08/02/2015.
 */
public interface GroupDao {

    public Group getGroup(int groupId);
    public List<Group> getAllGroups();
    public void createGroup(Group group);

}
