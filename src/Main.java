public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int summTillMonth = 0;

        for (int current : arr) {
            summTillMonth += current;
        }
        System.out.println("Сумма трат за месяц составила " + summTillMonth + " рублей");

    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minForOneDay = arr[0];
        int maxForOneDay = arr[0];

        for (int current : arr) {
            if (current > maxForOneDay) {
                maxForOneDay = current;
            }
            if (current < minForOneDay) {
                minForOneDay = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minForOneDay + " рублей. Максимальная сумма трат за день составила " + maxForOneDay + " рублей");

    }


    public static void task3() {
        int[] arr = generateRandomArray();
        double allExpensses = 0;
        int daysInMonth = 30;
        for (int current : arr) {
            allExpensses += current;
        }
        allExpensses /= daysInMonth;

        System.out.println("Средняя сумма трат за месяц составила " + allExpensses + " рублей");

    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }



    }
}
