package com.labs.lab2.task2;

public class Task2 {
    public static void main () {
        Queue queue = new Queue(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.pop();
        queue.push(3);
        queue.push(5);
        queue.pop();

    }
}
