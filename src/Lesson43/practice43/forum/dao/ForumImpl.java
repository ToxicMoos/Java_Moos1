package Lesson43.practice43.forum.dao;

import Lesson43.practice43.forum.model.Post;

import java.time.LocalDate;
import java.util.Comparator;

public class ForumImpl implements Forum{
    //Comparator - компаратор для сравнения этих(p1, p2) объектов.
    //
    //Проверка на null: Если post1 или его свойства (автор или
    private static Comparator<Post> comparator = (p1, p2) -> {
        if(p1 == null || p1.getAuthor() == null || p1.getDate() == null) {
            return -1;
        }
        if(p2 == null || p2.getAuthor() == null || p2.getDate() == null) {
            return 1;
        }
        int res = p1.getAuthor().compareTo(p2.getAuthor()); // по автору, по алфавиту
        res = res != 0 ? res : p1.getDate().compareTo(p2.getDate()); // по дате в порядке времени
        return res != 0 ? res : Integer.compare(p1.getPostId(), p2.getPostId()); // по id поста
    };
    //fields
    private Post[] posts;
    private int size;
    //constructor

    public ForumImpl() { }//пустой конструктор

    @Override
    public boolean addPost(Post post) {

        return false;
    }

    @Override
    public boolean removePost(int postId) {
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public Post[] getPostByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

    @Override
    public int size() {
        return size;
    }
}
