package com.company;

public class Main {

    public static void main(String[] args) {

        /* create the CountThread thread. */
        CountThread count = new CountThread();

        /* create the HelloThread thread. */
        HelloThread hello = new HelloThread();

        /* start the CountThread instance. */
        count.start();

        /* start the HelloThread instance. */
        hello.start();///dfasdfasdfasdf

    } // End main method
}
