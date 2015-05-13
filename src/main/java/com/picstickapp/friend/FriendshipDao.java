package com.picstickapp.friend;

/**
 * Created by David on 06/02/2015.
 */
public interface FriendshipDao {

    public void request(int requesterId, int requestedId);
    public void accept(int requesterId, int requestedId);

}
