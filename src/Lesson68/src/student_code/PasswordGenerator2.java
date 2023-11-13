package Lesson68.src.student_code;

import java.security.SecureRandom;

public class PasswordGenerator2 {
    public static void main(String[] args) {
        int passLength = 156;

        String x = passwordGen(passLength);
        System.out.println(x);


    }
    public static String passwordGen(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int intex = random.nextInt( characters.length());
            password.append(characters.charAt(intex));
        }
        return password.toString();
    }
}
