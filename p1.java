import java.util.Scanner;

public class p1 {
    static void rectArea() {
        Scanner scanner = new Scanner(System.in);
        int length, breadth;
        System.out.println("Enter length and breadth:");
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        System.out.println("Area of rectangle is " + (length * breadth));
    }

    static void mulArray() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter values for 1 array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter values for 2 array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i] * arr2[i];
            System.out.print(arr3[i] + "\t");
        }
        System.out.println("\n");
    }

    static void bubbleSort() {
        int n;
        System.out.println("Enter size");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1[j + 1] < arr1[j]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]);
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    rectArea();
                    break;
                case 2:
                    mulArray();
                    break;
                case 3: 
                    bubbleSort();
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 2);
    }
}