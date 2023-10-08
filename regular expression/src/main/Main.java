package main;

import IsCorrect.isCorrect;

public class Main {

    public static void main(String[] args) {


        System.out.println(isCorrect.check("Бухалихин Богдан Владиславович 31.03.2023 2001 г. Владивосток"));
        System.out.println(isCorrect.check("Antonova Богдан Владиславович 31.03.2023 2001 г. Владивосток"));
        System.out.println(isCorrect.check("Бухалихин Богдан Владиславович 311.03.2023 2001 г. Владивосток"));
        System.out.println(isCorrect.check("Бухалихин Богдан Владиславович 31.03.2023 2001 г Владивосток"));
        System.out.println(isCorrect.check("Бухалихин Богдан Владиславович 31.03.2023 2001 г. Владивосток"));


    }

}