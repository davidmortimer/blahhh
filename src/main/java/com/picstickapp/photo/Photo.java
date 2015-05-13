package com.picstickapp.photo;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by David on 08/02/2015.
 */
public class Photo {

    private int id;
    private String name;
    private int ownerId;
    private Timestamp timestamp;

    public Photo(int id, String name, int ownerId, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
