public class Main {
    public static void main(String[] args) {

        // task 1
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Не удалось определить ОС");
        }

        // task 2
        short clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                String a = clientDeviceYear < 2015 ? "Установите облегченную версию приложения для iOS по ссылке" : "Установите версию приложения для iOS по ссылке";
                System.out.println(a);
                break;
            case 1:
                String b = clientDeviceYear < 2015 ? "Установите облегченную версию приложения для iOS по ссылке" : "Установите версию приложения для iOS по ссылке";
                System.out.println(b);
                break;
            default:
                System.out.println("Не удалось определить ОС");
        }

        // task 3
        short year = 2021;
        if (year >= 1584) {
            boolean isDivisibleBy4 = year % 4 == 0;
            boolean isNotDivisibleBy100 = year % 100 != 0;
            boolean isDivisibleBy400 = year % 400 == 0;
            if (isDivisibleBy400 || isDivisibleBy4 && isNotDivisibleBy100) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

        // task 4
        int deliveryTime = 1;
        int deliveryDistance = 95;
        String deliveryMessage = "Потребуется дней: ";// + deliveryTime;
        if (deliveryDistance > 100) {
            deliveryMessage = "Свыше 100 км доставки нет";
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime += 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
        }
        System.out.println(deliveryMessage + deliveryTime);
        /**
         * корректно ли так написать? я явно не указала как обработать ситуацию меньше 20 км.
         * Или инициализировать срок доставки в 0, и если меньше 20, то прибавить 1?
         * Или лучше повторять вывод сообщений и вообще не использовать переменную для срока доставки?
         */

        // task 5
        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}