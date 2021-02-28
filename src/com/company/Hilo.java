package com.company;

public class Hilo extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " " + i);
            try {
                sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
