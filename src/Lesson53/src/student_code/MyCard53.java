package Lesson53.src.student_code;

import java.util.*;

public class MyCard53 {
    private Map<String,String> worldMap = new HashMap<>();
    private Map<String,Integer> mistakeCountMap = new HashMap<>();

    //
    public void addWord(String foreignWord ,String nativeWord){
        this.worldMap.put(foreignWord,nativeWord);
    }

// Метод для практики слов
    public void practice(){
        while (true){
            if (worldMap.isEmpty()){
            System.out.println("Словарь пуст. Пожалуйста, добавьте слова для практики.");
            return;
        }
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

// Преобразование ключей мапы в список для удобного доступа
        ArrayList<String> keys = new ArrayList<>(worldMap.keySet());

        // Случайный выбор слова для проверки
    String randomKey = keys.get(random.nextInt(keys.size()));
    String correctAnswer = worldMap.get(randomKey) ;

// Задаем вопрос
        System.out.println("Какой перевод слова "+ randomKey+" ?");
        String userAnswer = scan.nextLine();

// Проверка ответа

    if (correctAnswer.equalsIgnoreCase(userAnswer)) {
        System.out.println("Correct");
    }else {
        System.out.println("Wrong, Wanna Try again, Yes or No");
        String x = scan.nextLine();
        if (x.equalsIgnoreCase("Yes")){
            continue;
        }if (x.equalsIgnoreCase("no")){
            break;
        }
        if (!mistakeCountMap.containsKey(randomKey)){
            mistakeCountMap.put(randomKey,1);
        }else {
            int count = mistakeCountMap.get(randomKey);
            count++;
            mistakeCountMap.put(randomKey,count);
        }
    }
        }
    }
    public void practiceDifficultWord(){

        for (Map.Entry<String,Integer> entry : mistakeCountMap.entrySet()) {
            String  words = entry.getKey();
            int mistakes = entry.getValue();

            System.out.println("Слово: " + words + ", Количество ошибок: " + mistakes);

        }
    }


    public static void main(String[] args) {
        MyCard53 myCard = new MyCard53();

        myCard.addWord("apple", "яблоко");
        myCard.addWord("dog", "собака");
        myCard.addWord("hello", "привет");
        myCard.addWord("book","книга");
        myCard.addWord("tree","дерево");

        myCard.practice();
        myCard.practiceDifficultWord();
    }
}
