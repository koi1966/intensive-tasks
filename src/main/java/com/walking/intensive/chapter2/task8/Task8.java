package com.walking.intensive.chapter2.task8;

import java.util.Random;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int combination;
        int sumFirstThreeDigits;
        int sumLastThreeDigits;

        do {
            combination = random.nextInt(1000000);
            sumFirstThreeDigits = (combination / 100000) + ((combination / 10000) % 10) + ((combination / 1000) % 10);
            sumLastThreeDigits = ((combination / 100) % 10) + ((combination / 10) % 10) + (combination % 10);
        } while (sumFirstThreeDigits != sumLastThreeDigits);

        System.out.println("Сгенерированная комбинация: " + String.format("%06d", combination));
    }




    static double getHappyTicketChance(int ticketNumber){
        // Ваш код
        return 0.0;
    }
}