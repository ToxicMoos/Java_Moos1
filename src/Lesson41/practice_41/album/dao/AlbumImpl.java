package Lesson41.practice_41.album.dao;

import Lesson41.practice_41.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {
    //class Comparator
    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());//сортировка по дате
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());//сортировка по photoId
    };

    //fields
    private Photo[] photos; //это массив типа Photo
    private int size;//это переменная - отвечает за общее кол-во массива
    //constructor
    public AlbumImpl(int capacity){
        this.photos = new Photo[capacity];
    }

    //implements methods
    @Override
    public boolean addPhoto(Photo photo) {
        //нельзя добавить null, нельзя добавить фото больше чем длина массива photo.lengths == capacity, нельзя добавить тоже-самое фото(проверка на два id)
        //шаг1.нужно иметь отсортированный массив, так работает binarySearch
        //Метод BinarySearch находит и возвращает index искомого элемента если находит
        //Если элемент не найден, то BinarySearch возвращает отрицательное число, где бы
        //нужно применить binarySearch(получим индекс), чтобы найти место, куда вставить фото
        //тогда можно делать addPhoto
        if (photo == null || photos.length == size || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null){//Здесь выполняется проверка. Если результат вызова getPhotoFromAlbum не равен null, это означает,
            // что фотография с такими photoId и albumId уже существует в альбоме. В таком случае, метод addPhoto возвращает false, поскольку нам не разрешается добавлять фотографии с одинаковыми ID в альбом.
            return false;
        }
        int index = Arrays.binarySearch(photos,0, size, photo, comparator);//Arrays.binarySearch для поиска позиции, на которую можно вставить новую фотографию в отсортированный массив photos.
        //1. photos: Это массив, в котором производится поиск. В данном случае, это массив объектов типа Photo. " 0 " ,Это индекс, с которого начинается поиск в массиве.
        // В данном случае, мы начинаем с индекса 0, то есть с начала массива.
        //size: Это индекс, до которого идет поиск в массиве. В данном случае, size представляет количество элементов (фотографий), находящихся в массиве до момента добавления новой фотографии.
        //photo: Это объект фотографии, который мы пытаемся вставить. Метод binarySearch будет искать позицию для вставки этой фотографии в отсортированный массив.
        //comparator: Это объект типа Comparator, который определяет способ сравнения элементов массива. В данном случае,  он определяет, как сравнивать фотографии для правильной сортировки.
        // метод Arrays.binarySearch ищет место для вставки новой фотографии в отсортированном массиве photos по указанным критериям. Если фотография с такими же photoId и albumId уже есть в альбоме, это место будет использовано для замены существующей фотографии.
        // Если фотографии с такими ID нет, это место будет использовано для вставки новой фотографии.
        //Результат binarySearch будет либо положительным числом (если найдено совпадение), либо отрицательным числом (если нет совпадения).
        // Если это отрицательное число, оно будет отрицательным индексом минус один, указывающим на позицию, на которую можно вставить новую фотографию, чтобы сохранить отсортированный порядок.

        index = index >=0 ? index : - index-1;//ternary operator. Выполняем обработку индекса для вставки
        System.arraycopy(photos, index, photos,index +1,size -index);//копируем элементы массива от индекса на одно место вправо. System.arraycopy для перемещения элементов в массиве, чтобы освободить место для вставки новой фотографии.
        //1. photos: Это исходный массив, в котором производится перемещение элементов.
        //2. index: Это позиция, с которой начнется копирование элементов. Она представляет индекс, полученный из метода binarySearch, который показывает, куда следует вставить новую фотографию.
        //3. photos: Это целевой массив, в который будут скопированы элементы. Он также является исходным массивом, потому что мы выполняем операцию "вставки" в этот же массив.
        //4. index + 1: Это индекс, с которого начнется копирование в целевой массив. Он на 1 больше, чем index, потому что мы хотим освободить место для новой фотографии.
        //5. size - index: Это количество элементов, которые нужно скопировать. Разница size - index представляет количество элементов, которые следует сдвинуть вправо, чтобы освободить место для вставки новой фотографии.
        //Таким образом, строка кода System.arraycopy(photos, index, photos, index + 1, size - index); перемещает элементы массива, начиная с позиции index и копируя их в массив начиная с позиции index + 1.
        // Это создает "пустое место" на позиции index, куда затем будет вставлена новая фотография. Количество элементов, которые будут скопированы, равно size - index, чтобы учесть сдвиг вправо.
        photos[index]= photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId){
                System.arraycopy(photos,i+1,photos,i,size-1 -i );
                photos[--size] = null;
                return true;

            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId,albumId);//нашли фото по двум ID
        if (photo == null){
            return false;
        }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId,photoId,null,null,null);  //создаем объект, с которым сравниваем photo из массива
        for (int i = 0; i < size; i++) {
            if (pattern.equals(photos[i])){
            return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findByPredicate(p -> p.getAlbumId() == albumId);
    }

    @Override
    public Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo) {
        //создадим фото с индексом максисально ранней фотогорафии и фото с максимально дольшим индексом
        //бодем искать индексы from и to
        //используем binarySearch
        Photo pattern = new Photo(0,Integer.MIN_VALUE,null,null,dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(photos,0,size,pattern,comparator)-1;//находим индекс
        pattern = new Photo(0,Integer.MAX_VALUE,null,null, LocalDateTime.of(dateTo, LocalTime.MAX));//находим правый край
        int to = -Arrays.binarySearch(photos,from,size,pattern,comparator)-1;

        return Arrays.copyOfRange(photos,from,to);//создаем новый массив с нужными нам фото
    }

    @Override
    public int size() {
        return size;
    }

    private Photo[] findByPredicate(Predicate<Photo> predicate){
        Photo[] res = new Photo[size];
         int j = 0;//счетчик найденных по условию
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])){
                res[j++]= photos[i];
            }
        }
        return Arrays.copyOf(res,j);//копируем только ту часть, где нет null
    }
}
