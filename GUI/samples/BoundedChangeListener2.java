/**package gonderilecek_kod;

import java.awt.BorderLayout;

import javax.swing.BoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class BoundedChangeListener2 implements ChangeListener {
  public void stateChanged(ChangeEvent changeEvent) {
    Object source = changeEvent.getSource();
    if (source instanceof BoundedRangeModel) {
      BoundedRangeModel aModel = (BoundedRangeModel) source;
      if (!aModel.getValueIsAdjusting()) {
        System.out.println("Changed: " + aModel.getValue());
      }
    } else if (source instanceof JSlider) {
      JSlider theJSlider = (JSlider) source;
      if (!theJSlider.getValueIsAdjusting()) {
        System.out.println("Slider changed: " + theJSlider.getValue());
      }
    } else {
      System.out.println("Something changed: " + source);
    }
  }
}

public class TickSliders {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Tick Slider");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JSlider jSliderOne = new JSlider();
    jSliderOne.addChangeListener(new BoundedChangeListener2());
    frame.add(jSliderOne, BorderLayout.NORTH);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}**/