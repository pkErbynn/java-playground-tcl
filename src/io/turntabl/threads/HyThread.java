package io.turntabl.threads;

public class HyThread extends Thread{ // can implements Runnable
    public void show() {
        for(int i = 0; i < 5; ++i){
            System.out.println("Hy");
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }

    public void run() {
       show();
    }

}

