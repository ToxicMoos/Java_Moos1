package homeWork20.voter.model;
import java.time.LocalDate;

public class Voter {
    private String name;
    private LocalDate dateOfBirth;

    public Voter(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isEligibleToVote() {
                                               //создается объект 'today' с текущей датой.
        LocalDate today = LocalDate.now();     //Метод now() возвращает текущую дату с учетом системных настроек времени.
        LocalDate votingAgeDate = dateOfBirth.plusYears(18); //Метод plusYears() прибавляет года к дате рождения (dateOfBirth)
        return today.isAfter(votingAgeDate);    //Метод isAfter() сравнивает эти две даты "today и votingAgeDate" и возвращает true или false
    }
}


