package Lesson20.voter.model;
import java.time.LocalDate;
//Реализовать класс Избиратель (модель).
// Обеспечить невозможность регистрации в качестве избирателя лица, которому еще не исполнилось 18 лет в классе-апликации.

public class VoterAppl {
    public static void main(String[] args) {
        Voter[] voters = new Voter[5];

        voters[0] = new Voter("Rambo D. ", LocalDate.of(1990, 5, 15));
        voters[1] = new Voter("John Conor", LocalDate.of(2013, 10, 20));
        voters[2] = new Voter("Barak Obama", LocalDate.of(1995, 2, 8));
        voters[3] = new Voter("Bill Clinton", LocalDate.of(2021, 6, 30));
        voters[4] = new Voter("Angela Merkel.", LocalDate.of(1988, 9, 12));

        // Проверка права голоса для каждого избирателя
        for (Voter voter : voters) { //для перебора каждого избирателя в массиве voters
            if (voter.isEligibleToVote()) {
                System.out.println(voter.getName() + " does have the right to vote");
            } else {
                System.out.println(voter.getName() + " does NOT have the right to vote");
            }
        }
    }
}







