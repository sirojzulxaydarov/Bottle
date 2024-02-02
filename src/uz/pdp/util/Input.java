package uz.pdp.util;

import java.util.Scanner;

public interface Input {
    static int inputINT(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return inputINT(msg);
        }
    }

    static String inputSTR(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
}
