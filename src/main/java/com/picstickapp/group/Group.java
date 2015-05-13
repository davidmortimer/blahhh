package com.picstickapp.group;

/**
 * Created by David on 08/02/2015.
 */
public class Group {

    private int id;
    private String name;
    private int ownerId;

    public Group(int id, String name, int ownerId) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
    }

    public Group(String name, int ownerId) {
        this.name = name;
        this.ownerId = ownerId;
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

    //private List<Photo> photos;

}
