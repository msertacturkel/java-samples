package gonderilecek_kod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class timerex {

  public static void main(String[] args) {
    Timer timer = new Timer(1000, new MyTimerActionListener());

    timer.start();
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
    }
    timer.stop();
  }

}

class MyTimerActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {

    System.out.println("asdf");

  }
}