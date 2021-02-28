package com.company;

/*CountThread does the counting*/
/*HelloThread does the printing*/

/*CountThread increments a value and prints it.*/
class CountThread extends Thread {

    /* time the thread is paused for ( in ms). */
    int pause;

    /* number of times the message is printed. */
    private static final int TIMES = 10;

    /* run() is the method doing the actual thread task. */
    public void run() {

        /*
         * i is incremented and printed within the for loop.
         */
        for (int i = 0; i < TIMES; i++) {

            try {

                /* print the value of i. */
                System.out.println(i);

                /* generate a random sleep interval. */
                pause = (int) (Math.random() * 3000);

                /* put the thread to sleep. */
                sleep(pause);

            } catch (InterruptedException e) {

                /* print the exception message when necessary. */
                System.out.println(e.toString());

            } // End try-catch
        } // End for
    } // End run method


} // End CountThread class