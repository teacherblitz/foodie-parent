package com.teacherblitz;

import org.junit.Test;

/**
 * @author: teacherblitz
 * @since: 2020/5/13
 */
public class ThreadTest {

    @Test
    public void fun(){
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest,"sss");
        thread.start();
    }

    static class RunnableTest implements Runnable {

        @Override
        public void run() {
            System.out.println("A");
        }
    }
}
