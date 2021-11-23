package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }


    public static void task1() {
        // 0 - ios; 1 - android

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 0;

        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
        }

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task3() {

        int year = 2100;

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосный!");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосный!");
        } else if (year % 100 == 0) {
            System.out.println(year + " год  не является високосный!");
        } else {
            System.out.println(year + " год  не является високосный!");
        }

    }

    public static void task4() {

        int deliveryDistance = 100;
        byte days = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);

        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days + 2));

        }

    }

    public static void task5() {

        byte monthNumber = -1;


        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца не существует");
        }


        // второй вариант
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Такого месяца не существует");
        }

    }

}
