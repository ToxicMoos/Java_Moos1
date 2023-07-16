package Lesson43.practice43.forum.dao;

import Lesson43.practice43.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    Forum forum;
    Post[] posts = new Post[6];


    @BeforeEach
    void setUp() {
        forum = new ForumImpl();
        posts[0] = new Post(0, "author1", "title1", "content");
        posts[1] = new Post(1, "author2", "title2", "content");
        posts[2] = new Post(2, "author2", "title3", "content");
        posts[3] = new Post(3, "author1", "title4", "content");
        posts[4] = new Post(4, "author3", "title1", "content");
        posts[5] = new Post(5, "author1", "title2", "content");
        for (int i = 0; i < forum.size(); i++) {

        }
    }

    @Test
    void addPost() {
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
    void getPostByAuthor() {
    }

    @Test
    void testGetPostByAuthor() {
    }

    @Test
    void size() {
    }
}