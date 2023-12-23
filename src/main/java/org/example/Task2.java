package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task2 {

    public static boolean isPalindrome(String input) {
        String processed = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : processed.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}