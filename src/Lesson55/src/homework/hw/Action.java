package Lesson55.src.homework.hw;


/**
 * Интерфейс с методом, принимающим один аргумент и ничего не возвращающим (аналог Consumer):
 */
@FunctionalInterface
interface Action<T> {
    void execute(T t);
}
