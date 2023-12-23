package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String request = generateRequest(random);
            queue.add(request);
            processRequest(request);

            System.out.print("\u001B[38;2;242;194;207mContinue? (Yes/No or +/-) ==> \u001B[0m");
            String answer = scanner.nextLine().replaceAll(" ", "").toLowerCase();

            while (!isValidCommand(answer)) {
                System.out.print("\u001B[38;2;242;148;173mInvalid command. Enter one of the following commands: Yes, No, +, - ==> \u001B[0m");
                answer = scanner.nextLine().replaceAll(" ", "").toLowerCase();
            }

            if (answer.equals("no") || answer.equals("-")) {
                break;
            }
        }
    }

    public static String generateRequest(Random random) {
        int number = random.nextInt(1000) + 1;
        return "Application №" + number;
    }

    public static void processRequest(String request) {
        System.out.println("\u001B[38;2;210;88;113mProcessed application № " + request + "\u001B[0m");
    }

    public static boolean isValidCommand(String answer) {
        return answer.equals("yes") || answer.equals("no") || answer.equals("+") || answer.equals("-");
    }
}
