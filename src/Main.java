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

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            }
        }

    private static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        int sum = 0;
        float averages;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        averages = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " +averages+" рублей");

    }

    private static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("Зфдфча 2");
        int maxExpenses = -1;
        int minExpenses = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpenses) {
                maxExpenses = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minExpenses) {
                minExpenses = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
    }


    private static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Сумма трат за месяц составила " + arr[i] + " рублей");

        }


    }
}