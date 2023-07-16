package Lesson39.practice39.time.timeAppl;

//нет полей
//нет конструктора
//нет ничего


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;

public class TimeAppl {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//date

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate gagarin = LocalDate.of(1961,4,12);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getMonth());
        System.out.println(gagarin.getDayOfYear());//день в году 102-й

        System.out.println("Gagarin Day of month : "+ gagarin.getDayOfMonth());
        System.out.println("Gagarin Day of month : "+ gagarin.getDayOfWeek());

        System.out.println(gagarin.isBefore(currentDate));//ожидаем True
        System.out.println(gagarin.isAfter(currentDate));//ожидаем False

        System.out.println("-------Traveling in Time-----------");
        //add days to current day
        LocalDate newDate = currentDate.plusDays(100);
        System.out.println("Add 100 days: "+newDate);

        newDate = currentDate.plusWeeks(12);
        System.out.println("Add 12 weeks: "+ newDate);

        //two month ago
        newDate = currentDate.minusMonths(2);
        System.out.println("Two month ago: "+newDate);

        //operation with ChronoUnits
        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));//сколько половинных дней прошло от текущего времени
        //centuries -100лет
        newDate =currentDate.plus(10,ChronoUnit.CENTURIES);
        System.out.println("After 1000 years" + newDate);
        //получение интервала времени
        LocalDate lenin = LocalDate.of(1870,4,22);//день рождения ленина
        long res = ChronoUnit.YEARS.between(gagarin,lenin);
        System.out.println("года"+res);

        System.out.println("сравнение дат Compare LocalDate");
        System.out.println(lenin.compareTo(gagarin));//

//LocalDate array sorting
        LocalDate[] dates ={gagarin,currentDate,lenin};
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        System.out.println("---------Date Formatter-------------");
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarin.format(df));
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(gagarin.format(df));

        System.out.println("-----------------------------------");

        String date1 = "03/03/1974";
        String date2 = "23/11/19748";

        LocalDate localDate1 = dateParse(date1);

    }
    private static LocalDate dateParse(String date){
        //
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy]");
        return LocalDate.parse(date,df);
    }
}
