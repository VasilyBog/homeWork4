public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("***Задача 1***");
        int age1 = 19;
        System.out.println("Указан возраст человека " + age1);
        if (age1 >= 18) {
            System.out.println("Он совершеннолетний");
        }
        int age2 = 17;
        System.out.println("Указан возраст человека " + age2);
        if (age2 < 18) {
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
        int age3 = 18;
        boolean baby = age3 < 2;
        boolean childGard = age3 >= 2 && age3 < 7;
        boolean school = age3 >= 7 && age3 < 18;
        boolean univer = age3 >= 18 && age3 <= 24;
        if (baby) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему не нужно куда-то ходить");
        }
        if (childGard) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        }
        if (univer) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в ВУЗ");
        }
        if (!baby && !childGard && !school && !univer) {
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
        int seatingPlacesTaken = 59;
        int totalPlacesTaken = 97;
        if ((102 - totalPlacesTaken - 60 + seatingPlacesTaken) < 0) {
            System.out.println("Ошибка в воде исходных данных. Общее количество доступных мест не может быть меньше свободных сидячих мест");
        } else {
            int availableStandingPlaces;
            int availableSeatingPlaces;
            if (totalPlacesTaken >= 102) {
                System.out.println("В вагоне нет свободных мест");
            } else {
                availableSeatingPlaces = 60 - seatingPlacesTaken;
                availableStandingPlaces = 102 - totalPlacesTaken - availableSeatingPlaces;
                System.out.println("В вагоне достопно " + availableSeatingPlaces + " сидячих мест, и " + availableStandingPlaces + " стоячих мест");
            }
        }
        //Exercise 7
        System.out.println("***Задача 7***");
        int one = 13;
        int two = 15;
        int three = 17;
        if (one > two) {
            if (one > three) {
                System.out.println("Наибольшее число из 3х данных - " + one);
            } else {
                System.out.println("Наибольшее число из 3х данных - " + three);
            }
        } else if (two > three) {
            System.out.println("Наибольшее число из 3х данных - " + two);
        } else {
            System.out.println("Наибольшее число из 3х данных - " + three);
        }
    }
}