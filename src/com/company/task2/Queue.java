package com.company.task2;

import javax.management.QueryEval;

public class Queue {
    private int value;
    private int limit = -1;
    private int counter = 0;
    private Queue front = this;
    private Queue back = null;
    private Queue last = this;

    public Queue () {
        this.front = this;
        this.back = null;
        this.last = this;
    }

    public Queue(int limit) {
        this.limit = limit;
    }

    public void push(int value) {
        if (limit < 0 || counter < limit) {
            Queue cell = new Queue();
            cell.value = value;

            if (counter == 0) this.front = cell;
            last.back = cell;
            last = cell;

            counter++;
        } else {
            System.out.println("The queue is full");
        }
    }

    public int pop () {
        int val = 0;
        if (counter > 0) {
            val = front.value;
            Queue tmp = front.back;
            front.back = null;
            front = tmp;

            counter--;
        } else {
            System.out.println("The queue is empty");
        }

        return val;
    }

    public void show() {
        Queue el = this.front;

        while (el != null) {
            System.out.println(el.value);
            el = el.back;
        }
    }

    public boolean isEmpty () {
        return counter == 0;
    }

    public boolean isFull() {
        return limit > 0 && counter >= limit;
    }
}
