package Lesson41.homeWork41.album.dao;

import Lesson41.homeWork41.album.model.Photo;

import java.time.LocalDate;

public class AlbumImpl implements Album {
    //fields
    private Photo[] photos;
    private int size;

    //constructor
    public AlbumImpl(int capacity){
        this.photos = new Photo[capacity];//new Photo[capacity] - это оператор создания нового массива объектов типа Photo с размером capacity. То есть, это выделяет память для хранения фотографий в альбоме
    }

//implements methods from Album
    @Override
    public boolean addPhoto(Photo photo) {
        return false;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        return false;
    }

    @Override
    public Photo[] getPhotoFromAlbum(int photoId, int albumId) {
        return new Photo[0];
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return new Photo[0];
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
