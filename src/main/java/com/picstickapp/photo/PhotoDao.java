package com.picstickapp.photo;

import java.util.List;

/**
 * Created by David on 08/02/2015.
 */
public interface PhotoDao {

    public Photo getPhoto(int photoId);
    public List<Photo> getAllPhotos();
    public void uploadPhoto(Photo photo);

}
