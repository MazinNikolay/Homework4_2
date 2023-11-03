public class Main {
    public static void main(String[] args) {
        task1(4);
        System.out.println(task2(0, 2015));
        task3(1900);
        task4(1021);
        task5(7);
        task6(15, 81_000);
        task7(20, 10_000, 10_000);
    }

    public static void task1(int clientOS) {
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой операционки нет");
        }
    }

    public static String task2(int clientOS, int clientDeviceYear) {
        switch (clientOS) {
            case 0:
                return (clientDeviceYear < 2015) ? "Установите облегченную версию приложения для iOS по ссылке" : "Установите версию приложения для iOS по ссылке";
            case 1:
                return (clientDeviceYear < 2015) ? "Установите облегченную версию приложения для Android по ссылке" : "Установите версию приложения для Android по ссылке";
            default:
                return "Такой операционки нет";
        }
    }

    public static void task3(int year) {
        if ((year > 1584 && year % 100 != 0 && year % 4 == 0) || (year > 1584 && year % 400 == 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void task4(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else System.out.println("Доставки нет");
    }

    public static void task5(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
                System.out.println("Введите корректное значение");
                break;
        }
    }

    public static void task6(int age, int salary) {
        double limit = 0;
        if (age >= 23) {
            limit = salary * 3;
        } else limit = salary * 2;
        if (salary >= 50_000 && salary < 80_000) {
            limit *= 1.2;
        } else if (salary >= 80_000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

    public static void task7(int age, int salary, int wantedSum) {
        double baseCreditRate = 1.1;
        int creditTime = 12;
        double maxPaymentRate = 0.5;
        double maxPay = 0.0;
        if (age > 23 && age < 30) {
            baseCreditRate += 0.005;
        } else if (age < 23) baseCreditRate += 0.01;
        if (salary > 80_000) baseCreditRate -= 0.07;
        maxPay = (wantedSum * baseCreditRate) / creditTime;
        String maxPayStr = String.format("%.2f", maxPay);
        if (maxPay > (salary * maxPaymentRate)) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayStr + " рублей. Платеж по кредиту " + wantedSum + " рублей. Отказано");
        } else
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayStr + " рублей. Платеж по кредиту " + wantedSum + " рублей. Одобрено");
    }
}