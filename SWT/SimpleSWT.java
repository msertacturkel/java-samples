

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;

public class SimpleSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		Label label = new Label(shell, SWT.NONE);
		label.setText("merhaba");
		shell.pack();
		label.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
		label.dispose();
	}

}
