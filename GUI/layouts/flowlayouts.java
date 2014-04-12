import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

public class flowlayouts {
  public static void main(String[] args) {
    Frame f = new Frame("FlowLayout demo");
    f.setLayout(new FlowLayout());
    f.add(new Button("Red"));
    f.add(new Button("Blue"));
    f.add(new Button("White"));
    List list = new List();
    for (int i = 0; i < args.length; i++) {
      list.add(args[i]);
    }
    f.add(list);
    f.add(new Checkbox("Pick me", true));
    f.add(new Label("Enter name here:"));
    f.add(new TextField(20));
    f.pack();
    f.setVisible(true);
  }
}

   