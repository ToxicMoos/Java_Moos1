package Lesson41.practice_41.album.dao;

import Lesson41.practice_41.album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album albums;
    LocalDateTime now = LocalDateTime.now();
    Photo[] ph = new Photo[6];

    @BeforeEach
    void setUp() {
        albums = new AlbumImpl(7);
        ph[0] = new Photo(1,1,"Title1","url1",now.minusDays(7));
        ph[1] = new Photo(1,2,"Title2","url2",now.minusDays(7));
        ph[2] = new Photo(1,3,"Title3","url3",now.minusDays(5));
        ph[3] = new Photo(2,1,"Title1","url1",now.minusDays(7));
        ph[4] = new Photo(2,4,"Title4","url4",LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));
        ph[5] = new Photo(1,4,"Title4","url1",LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));

        for (int i = 0; i < ph.length; i++) {
            albums.addPhoto(ph[i]);

        }
    }

    @Test
    void addPhotoTest() {
         assertFalse(albums.addPhoto(null));//добавление пустого фото
         assertFalse(albums.addPhoto(ph[1]));
         Photo photo = new Photo(1,5,"Title5","Url5",now.minusDays(3));
         assertTrue(albums.addPhoto(photo));
         assertEquals(7,albums.size());
         photo = new Photo(1,6,"Title6","Url6",now.minusDays(3));
         assertFalse(albums.addPhoto(photo));
    }

    @Test
    void removePhoto() {
        assertFalse(albums.removePhoto(5,1));//не можем удалить несуществующего фото
        assertTrue(albums.removePhoto(1,1));
        assertEquals(4,albums.size());
        assertNull(albums.getPhotoFromAlbum(1,1));
    }

    @Test
    void updatePhoto() {
        assertTrue(albums.updatePhoto(1,1,"new url"));
        assertEquals("new url",albums.getPhotoFromAlbum(1,1).getUrl());
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(ph[0],albums.getPhotoFromAlbum(1,1));
        assertNull(albums.getPhotoFromAlbum(3,3));
    }

    @Test
    void getAllPhotoFromAlbum() {
        Photo[] actual = albums.getAllPhotoFromAlbum(2);
        Arrays.sort(actual);
        Photo[] expected = {ph[3], ph[4]  };
        assertArrayEquals(expected,actual);
    }

    @Test
    void getPhotoBeetwenDate() {
        LocalDate ld = now.toLocalDate();
        System.out.println(ld);
        Photo[] actual = albums.getPhotoBeetwenDate(ld.minusDays(5),ld.minusDays(2));
        Arrays.sort(actual);

        Photo[] expected = {ph[2],ph[5],ph[4]};
        assertArrayEquals(expected,actual);
    }

    @Test
    void size() {
        assertEquals(6,albums.size());
    }
}