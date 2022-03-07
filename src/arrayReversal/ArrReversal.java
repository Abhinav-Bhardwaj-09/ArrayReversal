package arrayReversal;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 07/03/22
 * Time: 22:14
 */


public class ArrReversal {

    static void arrayReversal (int [] arr) {
        int leftElement, rightIndex = arr.length;
        for (int index = 0; index < arr.length/2; index++) {
            leftElement = arr[index];
            arr[index] = arr[--rightIndex];
            arr[rightIndex] = leftElement;
        }

        System.out.print("\nReversed Array :  ");
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nSize of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("\nElements of the array (space seperated): ");
        for(int index = 0; index < size; index++) {
            arr[index] = sc.nextInt();
        }
        arrayReversal(arr);

    }
}
