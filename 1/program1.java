// 1.Write a java program:
// a.To calculate and display the area of a rectangle.
// b.To multiply two arrays and display the result
// c.To sort the elements in ascending and descending order using bubble sort algorithm.
import java.util.*;

public class program1 {

    // Area of rectangle ..
    static void area(float a, float b) {
        System.out.println("Area of Rectangle:" + (a * b));
    }

    // multiplication of arrays..
    static void arrayMult(int arr1[], int arr2[]) {
        int res[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i] * arr2[i];
        }
        System.out.println("The multiplication of 2 arrays are: ");
        for (int el : res) {
            System.out.print(el + " ");
        }
        System.err.println();
    }

    // Sorting..
    static void bubbleSort(int arr[]) {
        int a[] = arr;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Accending Order: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Descending Order: ");
        for (int el : a) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ch;
            System.out.println("1.Area 2.Mult 3.sort");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int a, b;
                    a = sc.nextInt();
                    b = sc.nextInt();
                    area(a, b);
                    break;
                case 2:
                    int n;
                    System.out.println("enter the size of the array:");
                    n = sc.nextInt();
                    int arr1[] = new int[n];
                    int arr2[] = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr1[i] = sc.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                        arr2[i] = sc.nextInt();
                    }
                    arrayMult(arr1, arr2);
                    break;
                case 3:
                    int s;
                    System.out.println("enter the size of the array:");
                    s = sc.nextInt();
                    int arr[] = new int[s];
                    for (int i = 0; i < s; i++) {
                        arr[i] = sc.nextInt();
                    }
                    bubbleSort(arr);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("invalid");

            }
        }

    }
}