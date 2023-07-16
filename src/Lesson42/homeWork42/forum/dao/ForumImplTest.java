package Lesson42.homeWork42.forum.dao;

import Lesson41.practice_41.album.model.Photo;
import Lesson42.homeWork42.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    Forum forum;
    Post[] ps = new Post[4];//

    @BeforeEach
    void setUp() {
        forum = new ForumImpl();
        ps[0] = new Post(101,"North Bank","Rambo","Harry hello");
        ps[1] = new Post(104,"West Bank","Jack","John hello");
        ps[2] = new Post(103,"Ost Bank","Kelly","Tom hello");
        ps[3] = new Post(102,"South Bank","Mike","Sam hello");

        for (int i = 0; i < ps.length-1; i++) {
            forum.addPost(ps[i]);

        }
    }

    @Test
    void addPost() {
//TODO assert throw if forum.addPost(null)
        boolean flag;
        try {
            forum.addPost(null);
            flag = true;
        }catch (RuntimeException e){
            flag = false;
        }
        assertFalse(flag);


    }



    @Test
    void removePost() {
    }

    @Test
    void updatePost() {
    }

    @Test
    void getPostById() {
    }

    @Test
    void getPostByIAuthor() {
    }

    @Test
    void testGetPostByIAuthor() {
    }

    @Test
    void size() {
    }
}