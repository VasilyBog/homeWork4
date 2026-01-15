public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("***Задача 1***");
        int age1 = 19;
        System.out.println("Указан возраст человека " + age1);
        if (age1 >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        //Exercise 2
        System.out.println("***Задача 2***");
        int temp = 4;
        System.out.println("Сегодня температура воздуха " + temp);
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //Exercise 3
        System.out.println("***Задача 3***");
        int speed = 75;
        boolean speedLimit = speed > 60;
        if (speedLimit) {
            System.out.println("Скорость превышена");
            System.out.println("Скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Превышения скорости нет");
            System.out.println("Скорость " + speed + " км/ч, можно ездить спокойно");
        }
        //Exercise 4
        System.out.println("***Задача 4***");
        int age3 = 26;
        boolean baby = age3 < 2;
        boolean childGard = age3 >= 2 && age3 < 7;
        boolean school = age3 >= 7 && age3 < 18;
        boolean univer = age3 >= 18 && age3 <= 24;
        if (baby) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему не нужно куда-то ходить");
        } else if (childGard) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if (school) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if (univer) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в ВУЗ");
        } else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу");
        }
        //Exercise 5
        System.out.println("***Задача 5***");
        int age4 = 15;
        boolean ageLimit = age4 < 5;
        boolean children = age4 >= 5 && age4 <= 14;
        if (ageLimit) {
            System.out.println("Если возраст ребенка равен " + age4 + ", то ему нельзя кататься на аттракционе");
        } else {
            if (children) {
                System.out.println("Если возраст ребенка равен " + age4 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age4 + ", то он может кататься самостоятельно");
            }
        }
        //Exercise 6
        System.out.println("***Задача 6***");
        int totalSeats = 102; // всего мест
        int seatingCapacity = 60; // всего сидячих мест, остальные стоячие
        int ticket = 67; // это переменная мой билет
        //Найдем, какое у меня место, сидячее, стоячее или же вагон забит и тебе придаться идти в другой вагон.
        //Допускаю, что номер билета привязан к номерам свободных мест, и что с 1 по 60 это сидячие места.
        // Пассажиры с номером билета от 1 до 60 занимают именно сидячие места.
        if (ticket > totalSeats) {
            System.out.println("В вагоне нет свободных мест, иди в другой вагон");
        } else if (ticket <= seatingCapacity) {
            System.out.println("У тебя сидячее место");
        } else {
            System.out.println("У тебя стоячее место");
        }
        //Exercise 7
        System.out.println("***Задача 7***");
        int one = 13;
        int two = 17;
        int three = 15;
        if (one > two && one > three) {
            System.out.println("Наибольшее число из 3х данных - " + one);
        } else if (one < two && two > three) {
            System.out.println("Наибольшее число из 3х данных - " + two);
        } else {
            System.out.println("Наибольшее число из 3х данных - " + three);
        }
    }
}