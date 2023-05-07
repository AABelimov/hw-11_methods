import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    public static void task1(){
        int year = 2022;

        System.out.println("Task1:");
        if(checkLeapYear(year)) System.out.println(year + " является високосным");
        else System.out.println(year + " не является високосным");
    }

    public static void task2(){
        int clientDeviceYear = 2015;
        int clientOS = 1;

        System.out.println("Task2:");
        checkAndPrintActualVersionForDevice(clientDeviceYear, clientOS);
    }

    public static void task3() {
        int deliveryDistance = 101;
        int daysForDelivery = calculateTimeForDelivery(deliveryDistance);

        System.out.println("Task3:");
        if(daysForDelivery > 0) System.out.println("Потребуется дней: " + daysForDelivery);
        else System.out.println("Доставки нет");
    }

    public static boolean checkLeapYear(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void checkAndPrintActualVersionForDevice(int clientDeviceYear, int clientOS ){
        if(clientOS == 0){
            if(clientDeviceYear < LocalDate.now().getYear()) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientDeviceYear < LocalDate.now().getYear()) System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static int calculateTimeForDelivery(int distance){
        if(distance < 20) return 1;
        else if(distance < 60) return 2;
        else if(distance <= 100) return 3;
        else return -1;
    }
}