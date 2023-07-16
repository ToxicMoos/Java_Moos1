package Lesson42.homeWork42.forum.dao;

import Lesson42.homeWork42.forum.model.Post;

import java.time.LocalDate;

public interface Forum {
    boolean addPost(Post post);
    boolean removePost(int postId);
    boolean updatePost(int postId,String content);
    Post getPostById(int postId);
    Post[] getPostByIAuthor(String author);
    Post[] getPostByIAuthor(String author, LocalDate dateFrom,LocalDate dateTo);
    int size();
}
