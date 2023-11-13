package Lesson53.src.practice;

import java.util.*;

public class LanguageCard {
    // Хранилище для слов и их переводов
    private HashMap<String, String> wordMap = new HashMap<>();
    private Map<String,Integer> mistakeCountMap = new HashMap<>();

    // Метод для добавления нового слова и его перевода
    public void addWord(String foreignWord, String nativeWord) {

        wordMap.put(foreignWord, nativeWord);
    }

    // Метод для практики слов
    public void practice() {
        if (wordMap.isEmpty()) {
            System.out.println("Словарь пуст. Пожалуйста, добавьте слова для практики.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

    while (true){
        // Преобразование ключей мапы в список для удобного доступа
        ArrayList<String> keys = new ArrayList<>(wordMap.keySet());

        // Случайный выбор слова для проверки
        String randomKey = keys.get(random.nextInt(keys.size()));
        String correctAnswer = wordMap.get(randomKey);

        // Задаем вопрос
        System.out.println("Каков перевод слова " + randomKey + "?");
        String userAnswer = scanner.nextLine();

        // Проверка ответа

        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Верно!");
        } else {

            System.out.println("Неверно! Хотите попробовать ещё раз? ");
            mistakeCountMap.containsKey(randomKey);
            if (!mistakeCountMap.containsKey(randomKey)){
                mistakeCountMap.put(randomKey,1);
            }else {
                int count = mistakeCountMap.get(randomKey);
                count++;
                mistakeCountMap.put(randomKey,count);
            }

            System.out.println("Ответьте 'Yes' or 'No ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")){
                continue;
            } else if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
        //        scanner.close();
    }
    }

    public static void main(String[] args) {
        // Пример использования класса LanguageCard
        LanguageCard myCard = new LanguageCard();


        // Добавление слов
        myCard.addWord("apple", "яблоко");
        myCard.addWord("dog", "собака");
        myCard.addWord("hello", "привет");
        myCard.addWord("book","книга");
        myCard.addWord("tree","дерево");

        // Запуск практики
        myCard.practice();
    }
}

