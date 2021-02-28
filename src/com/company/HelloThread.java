package com.company;

/*HelloThread prints "Hello!" at random intervals.*/
class HelloThread extends Thread {

    /* time the thread is paused for (expressed in ms). */
    int pause;

    /* number of times the message is printed. */
    private static final int TIMES = 10;

    /* run() is the method doing the actual thread task. */
    public void run() {

        /* "Hello" is printed TIMES times. */
        for (int i = 0; i < TIMES; i++) {

            try {

                /* print the message. */
                System.out.println("Hello!");

                /* generate a random sleep interval. */
                pause = (int) (Math.random() * 3000);

                /* put the thread to sleep. */
                sleep(pause);

            } catch (InterruptedException e) {

                /* print the exception message. */
                System.out.println(e.toString());

            } // End try-catch
        } // End for
    } // End run method
} // End HelloThread