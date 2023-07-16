package Lesson41.practice_41.album.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Photo implements Comparable<Photo>{
    //fields
    private int albumId;
    private int photoId;
    private String title;
    private String url;
    private LocalDateTime date;
    //constructor


    public Photo(int albumId, int photoId, String title, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }
    //getters

    public int getAlbumId() {
        return albumId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }
//setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    //toString

    @Override    //переопределение (или перегрузка) это полиморфизм
    public String toString() {
        return "Photo{" + "albumId=" + albumId + ", photoId=" + photoId + ", title='" + title +  ", url='" + url + ", date=" + date + '}';
    }
    //Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return albumId == photo.albumId && photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, photoId);
    }

    @Override
    public int compareTo(Photo o) {
        return date.compareTo(o.date);
    }


    //end of class
}
