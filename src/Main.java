public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int[] years = new int[3];
        years[0] = 1;
        years[1] = 2;
        years[2] = 3;
        double[] weight = {1.57, 7.654, 9.986};
        char[] number = {'a', 'b', 'c', 'd', 'e'};
    }
    public static void task2 () {
        System.out.println("Задача2");
        int[] years = {1,2,3};
        for (int i=0;i<3;i++) {
            System.out.print(years[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] weights = {1.57, 7.654, 9.986};
        for (int i=0;i<3;i++) {
            System.out.print(weights[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        for (int i=0;i<5;i++) {
            System.out.print(letters[i]);
            if (i != 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача3");
        int[] years = {1,2,3};
        for (int i=2;i>=0;i--) {
            System.out.print(years[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] weights = {1.57, 7.654, 9.986};
        for (int i=2;i>=0;i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        for (int i=4;i>=0;i--) {
            System.out.print(letters[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    public static void task4 () {
        System.out.println("Задача4");
        int[] years = new int[3];
        years[0] = 1;
        years[1] = 2;
        years[2] = 3;
        for (int i=0;i<3;i++) {
        if (years[i] % 2 == 1 )  {
            years[i] = years[i]+1;
        }
            System.out.print(years[i]);
            if (years.length-1!= i) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}