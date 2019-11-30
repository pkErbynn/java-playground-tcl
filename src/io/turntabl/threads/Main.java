package io.turntabl.threads;

//class HyThread {
//    public void show() {
//        for(int i = 0; i < 5; ++i)
//            System.out.println("Hy");
//        try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
//    }
//}
//class HelloThread {
//    public void show() {
//        for(int i = 0; i < 5; ++i)
//            System.out.println("Hello");
//        try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
//    }
//}


public class Main {
    public static void main(String[] args) throws InterruptedException {

        // extends Thread
        HelloThread hello = new HelloThread();
        HyThread hy = new HyThread();
        hello.start();
        Thread.sleep(2000);
        hy.start();

        // implement Runnable
//        HelloThread hello = new HelloThread();
//        Thread threadHello = new Thread(hello, "hello thread");
//        HyThread hy = new HyThread();
//        Thread threadHy = new Thread(hy, "hyThread");
//        threadHello.start();
//        threadHy.start();

    }

}
