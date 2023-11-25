package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    private static final int[] AGE_ARRAY = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 111, 112, 113, 114};

    public static void main(String[] args) {
        int age = 11;

        System.out.println(getAgeString1(age));
    }

    static String getAgeString(int age) {

        if (age < 0) {
            return "Вы не родились";
        }


//        if (age < 0) {
//            System.out.println("Неверный возраст.");
//        } else if (age % 10 == 1 && age != 11) {
//            System.out.println("Вам " + age + " год.");
//        } еще, если (возраст % 10>= 2 && возраст % 10 <= 4 && возраст!= 12 && возраст!= 13 && возраст!= 14) {
//            System.out.println("Вам " + age + " года.");
//        } else {
//            System.out.println("Вам " + age + " лет.");
//        }

        for (int exceptionAge : AGE_ARRAY) {
            if (age == exceptionAge) {
                return "Вам " + age + " лет";
            }
        }

        return switch (age % 10) {
            case 1 -> "Вам " + age + " год";
            case 2, 3, 4 -> "Вам " + age + " года";
            default -> "Вам " + age + " лет";
        };
    }

    ////
//    public class Main {
//        public static final String[] WORD_CASE = {"год", "года", "лет"};

//        public static void main(String[] args) {
//
//            System.out.println(getAgeString(-9));
//            System.out.println(getAgeString(128));
//            for (int i = 0; i < 128; i++) {
//                System.out.println(getAgeString(i));
//            }
//        }

//        static String getAgeString(int age) {
//            String stringAge = String.valueOf(age);
//
//            int lastDigit = age % 10;
//            int secondLastDigit = 0;
//
//            if (stringAge.length() >= 2) {
//                secondLastDigit = (age / 10) % 10;
//            }
//
//            if (age < 0 || age > 127) {
//                return "Ошибка! Введите правильный возраст.";
//            } else if (lastDigit == 1 && secondLastDigit != 1) {
//                return String.format("Вам %d %s", age, WORD_CASE[0]);
//            } else if (lastDigit > 1 && lastDigit < 5 && secondLastDigit != 1) {
//                return String.format("Вам %d %s", age, WORD_CASE[1]);
//            } else {
//                return String.format("Вам %d %s", age, WORD_CASE[2]);
//            }
        /////////////////////////
static String getAgeString1(int age) {

    String yourAge = "Вам ";

    if (age < 0) {
        return "Ваше летоисчисление еще не началось!";
    } else if (age % 10 == 0 || age % 100 > 10 && age % 100 < 15 || age % 10 > 4) {
        yourAge = yourAge + age + " лет";
    } else if (age % 10 > 1) {
        yourAge = yourAge + age + " года";
    } else {
        yourAge = yourAge + age + " год";
    }
    return yourAge;
}



       }




