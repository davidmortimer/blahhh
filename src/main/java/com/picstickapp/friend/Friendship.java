package com.picstickapp.friend;

/**
 * Created by David on 06/02/2015.
 */
public class Friendship {

    private int id;
    private int requestingId;
    private int requestedId;
    private int status;

    public Friendship(int id, int requestingId, int requestedId, int status) {
        this.id = id;
        this.requestingId = requestingId;
        this.requestedId = requestedId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRequestingId() {
        return requestingId;
    }

    public void setRequestingId(int requestingId) {
        this.requestingId = requestingId;
    }

    public int getRequestedId() {
        return requestedId;
    }

    public void setRequestedId(int requestedId) {
        this.requestedId = requestedId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
