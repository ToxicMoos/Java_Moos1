package Lesson42.homeWork42.forum.dao;

import Lesson41.practice_41.album.model.Photo;
import Lesson42.homeWork42.forum.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ForumImpl implements Forum {
    //additional condition: Keep array of post sorted by author.
    // дополнительное условие: Хранить массив сообщений, отсортированных по автору

    //class Comparator
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
    private int size; //это количество всех писем на forum).

    //    constructor
    public ForumImpl(){
        posts = new Post[0];
    }


    @Override
    public boolean addPost(Post post) {
        //TODO throw RuntimeException if post == null
        if(post == null){
            throw new RuntimeException();
        }
        if (getPostById(post.getPostId()) != null) {
            return false;
        }
        posts = Arrays.copyOf(posts, posts.length + 1); // метод Arrays.copyOf позволяет копировать сам массив с увеличением его размера
        int index = Arrays.binarySearch(posts, 0, size, post, comparator); // ищем индекс, куда вставить пост в массив
        index = index >= 0 ? index : -index - 1; // обработка индекса
        System.arraycopy(posts, index, posts, index + 1, size - index); // расчистка места для поста
        posts[index] = post; // вставка поста
        size++;
        return true;
    }

    @Override
    public boolean removePost(int postId) {
        int index = searchById(postId);
        if (index < 0) {
            return false;
        }
        System.arraycopy(posts, index + 1, posts, index, size - index - 1); // затираем 1 пост
        posts = Arrays.copyOf(posts, posts.length - 1); // перезаписываем массив сам в себя с длиной - 1
        size--; // уменьшаем
        return true;
    }

    @Override
    public boolean updatePost(int postId, String newContent) {
        int index = searchById(postId);
        if (index < 0) {
            return false;
        }
        posts[index].setContent(newContent); // обновление контента
        return true;
    }

    @Override
    public Post getPostById(int postId) {
        int index = searchById(postId); // searchById - выненсен в отдельный метод
        if (index < 0) {
            return null;
        }
        return posts[index];
    }

    @Override
    public Post[] getPostByIAuthor(String author) {
        Post pattern = new Post(Integer.MIN_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.MIN);
        int from = -Arrays.binarySearch(posts, pattern, comparator) - 1;
        pattern = new Post(Integer.MAX_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.MAX);
        int to = -Arrays.binarySearch(posts, pattern, comparator) - 1;
        return Arrays.copyOfRange(posts, from, to); // возвращаем массив
    }

    @Override
    public Post[] getPostByIAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

//    @Override
//    public Post[] getPostByIAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
//        return new Post[0]; Post pattern = new Post(Integer.MIN_VALUE, author, null, null);
//        pattern.setDate(dateFrom.atStartOfDay());
//        int from = -Arrays.binarySearch(posts, pattern, comparator) - 1;
//        pattern = new Post(Integer.MAX_VALUE, author, null, null);
//        pattern.setDate(LocalDateTime.of(dateTo, LocalTime.MAX));
//        int to = -Arrays.binarySearch(posts, pattern, comparator) - 1;
//        return Arrays.copyOfRange(posts, from, to); // возвращаем массив
//    }

    @Override
    public int size() {
        return size;
    }

    //methods
    private int searchById(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                return i;
            }
        }
        return -1;
    }
    //find by predicate
    private Post[] findByPredicate(Predicate<Post> predicate) {
        Post[] res = new Post[size]; // массив res задаем максимально возможного размера
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(posts[i])) {
                res[j++] = posts[i]; // найденный пост помещаем в массив res
            }
        }
        return Arrays.copyOf(res, j); // копируем только те элементы, которые нашлись, т.к. их кол-во = j
    }
}
