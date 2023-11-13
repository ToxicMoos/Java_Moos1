package Lesson54.src.homework;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс для отслеживания посещаемости уроков учениками.
 */
public class AttendanceTracker {
    /**
         * Основная структура данных для хранения информации о посещаемости.
         * Ключ - имя ученика, значение - карта с датами уроков и флагами посещения.
         */
        private Map <String, Map<LocalDate, Boolean>> attendanceMap ;
        /**
         * Конструктор класса.
         */
        public AttendanceTracker() {
            // Инициализация основной структуры данных
            attendanceMap = new HashMap<>();
        }
        /**
         * Метод для добавления нового ученика.
         * @param name Имя ученика.
         */
        public void addStudent(String name) {
            attendanceMap.put(name,new HashMap<>());
        }

        /**
         * Метод для добавления даты урока.
         * @param date Дата урока.
         */
        public void addLessonDate(LocalDate date) {
            // TODO: Реализовать метод
            for (String s : attendanceMap.keySet()) {
                attendanceMap.get(s).put(date,false);
            }
        }
        /**
         * Метод для отметки посещения ученика.
         * @param name Имя ученика.
         * @param date Дата урока.
         * @param attended Флаг посещения (true - ученик был на уроке, false - ученик пропустил урок).
         */
        public void markAttendance(String name, LocalDate date, boolean attended) {

            if (attendanceMap.containsKey(name) && attendanceMap.get(name).containsKey(date)){//проверяем attendanceMap, существует ли ученик с указанным name в качестве ключа, и сравниваем полученное имя с Date
                attendanceMap.get(name).put(date,attended);//если он существует, то добавляем к этой date значение attended
            }else
                System.out.println("The Student with name" + name + " or date" + date + "not found ");
            }
            /**
         * Метод для вывода на экран списка всех учеников с их посещаемостью.
         */
            public  void printAllAttendance() {
                for (String student : attendanceMap.keySet()) {// это цикл, который перебирает каждого ученика (по ключам) в attendanceMap
                    for (Map.Entry<LocalDate,Boolean> entry : attendanceMap.get(student).entrySet()) {////  (Map.Entry<LocalDate, Boolean> - тип записей ;             entrySet()= содержит набор (ключ,значение)
                        System.out.println(entry.getKey()+" "+ entry.getValue());
                    }
                }
            }
            /**
         * Метод для вывода на экран посещаемости отдельного ученика.
         * @param name Имя ученика.
         */
        public void printStudentAttendance(String name) {

            if (attendanceMap.containsKey(name)){
                for (Map.Entry<LocalDate,Boolean> entry : attendanceMap.get(name).entrySet()){
                    System.out.println(entry.getKey() +" "+entry.getValue());
                }
            }else
                System.out.println("Student named '"+ name + "' not found");


        }
    }

