package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task1 {

    private Queue<Integer> queue = new LinkedList<>();
    private int requestNumber = 0;

    public int getQueueSize() {
        return queue.size();
    }

    public void generateRequest() {
        int requestId = ++requestNumber;
        queue.add(requestId);
        System.out.println("Generated request with ID: " + requestId);
    }

    public void processRequest() {
        if (!queue.isEmpty()) {
            int requestId = queue.remove();
            System.out.println("Processed request with ID: " + requestId);
        } else {
            System.out.println("The queue is empty. No requests to process.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task1 handler = new Task1();
        Random random = new Random();

        while (true) {
            Thread.sleep(random.nextInt(2000));
            handler.generateRequest();

            Thread.sleep(random.nextInt(1000));
            handler.processRequest();
        }
    }
}