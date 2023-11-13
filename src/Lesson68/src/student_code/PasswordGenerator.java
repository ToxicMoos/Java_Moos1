package Lesson68.src.student_code;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = 12; // Указываем желаемую длину пароля

        String x = generatePass(passwordLength);
        System.out.println(x);


    }
    public static String generatePass(int length){
//        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
//        String digits = "0123456789";
//        String allCharacters = uppercaseLetters + lowercaseLetters + digits;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+="; // Строка символов, которые могут использоваться в пароле
        StringBuilder password = new StringBuilder(); // Создаем объект StringBuilder для построения пароля
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length ; i++) {
            int index = random.nextInt(characters.length());// Генерируем случайный индекс символа из строки characters
            password.append(characters.charAt(index));// Добавляем символ с полученным индексом к паролю
        }

        return password.toString();

    }
}
