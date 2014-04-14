/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matematik;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Administrator
 */
public class Topla extends SimpleTagSupport {
    private double sayi1;
    private double sayi2;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        double toplam=sayi1+sayi2;
        try {
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            out.println(toplam);
            // out.println("    <blockquote>");

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");

        } catch (java.io.IOException ex) {
            throw new JspException("Error in Topla tag", ex);
        }
    }

    public void setSayi1(double sayi1) {
        this.sayi1 = sayi1;
    }

    public void setSayi2(double sayi2) {
        this.sayi2 = sayi2;
    }
}
