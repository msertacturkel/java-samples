package gonderilecek_kod;

import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.jar.Pack200;

import javax.swing.ProgressMonitor;

public class PackProgressMonitor extends ProgressMonitor implements PropertyChangeListener {

  public PackProgressMonitor(Component parent) {
    super(parent, null, "Packing", -1, 100);
  }

  public void propertyChange(PropertyChangeEvent event) {
    if (event.getPropertyName().equals(Pack200.Packer.PROGRESS)) {
      String newValue = (String) event.getNewValue();
      int value = Integer.parseInt(newValue);
      this.setProgress(value);
    }
  }
}