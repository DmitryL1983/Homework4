public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю - Вы совершеннолетний человек!!!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил. У Вас всё впереди!");
        }
        //Задание 2
        int human = 39;
        if (human >= 7 && human <= 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (human >= 18 && human <= 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (human >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 3
        int occupancy = 60; //занято в вагоне
        int capacity = 102; //всего мест в вагоне
        int sitting = 60; // сидячие места в вагоне
        if (occupancy < sitting) {
            System.out.println("В вагоне есть сидячие места (" + (sitting - occupancy) + " мест)");
        }
        if (occupancy >= sitting && occupancy < capacity) {
            System.out.println("В вагоне есть стоячие места (" + (capacity - occupancy) + "мест)");
        }
        if (occupancy >= capacity) {
            System.out.println("В вагоне мест нет!!!");
        }
        //Задание 1-2
        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Поздравляю - Вы совершеннолетний человек!!!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил. У Вас всё впереди!");
        }
        //Задание 2-2
        int human1 = 23;
        if (human1 >= 7 && human1 <= 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (human1 >= 18 && human1 <= 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 3-2
        int occupancy1 = 99; //занято в вагоне
        int capacity1 = 102; //всего мест в вагоне
        int sitting1 = 60; // сидячие места в вагоне
        if (occupancy1 < sitting1) {
            System.out.println("В вагоне есть сидячие места (" + (sitting1 - occupancy1) + " мест)");
        } else if (occupancy1 >= sitting1 && occupancy1 < capacity1) {
            System.out.println("В вагоне есть стоячие места (" + (capacity1 - occupancy1) + "мест)");
        } else System.out.println("В вагоне мест нет!!!");
        //Задание 1-3
        int personAge = 5;
        boolean Kindergarten = (personAge >= 2 && personAge <= 6);
        boolean School = (personAge >= 7 && personAge <= 18);
        boolean University = (personAge > 16 && personAge < 24);
        if (Kindergarten) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в детский сад");
        } else if (School) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в школу");
        } else if (University) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в университет");
        } else System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить на работу");
            }
        }






