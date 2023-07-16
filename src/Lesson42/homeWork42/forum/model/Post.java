package Lesson42.homeWork42.forum.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post {
    //fields
    private int postId;
    private String title;
    private String author;
    private String content;
    private LocalDateTime date;
    private int likes;

    //constructor

    public Post(int postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    //getters

    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getLikes() {
        return likes;
    }

    //setters

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    //methods
     int addLike(){
        ++likes;
        return likes;
    }
    //toString


    @Override
    public String toString() {
        return   "PostId = " + postId + ", Title = '" + title +  "', Author = '" + author +   "', Content = '" + content + "', Date = " + date + ", Likes = " + likes + '}';
    }
    //equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postId == post.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }
//comparable

}
