package io.turntabl.threads;

public class HelloThread extends Thread{
    public void show() {
        for(int i = 0; i < 5; ++i){
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }
    public void run() {
      show();
    }

}
