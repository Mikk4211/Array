package MikkelSorensen;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        double myList[] = new double[10];

        
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList.length + " values: ");

        //Brugeren giver "myList" en værdi, ved brug af scanner.
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        //myList bliver gjort tilfældig.
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        //Printer tallene i arrayet.
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
            System.out.println(max);
        }


    }
}

