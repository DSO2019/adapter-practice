package mx.iteso.adapter.impl.document;

import java.awt.Font;
import mx.iteso.adapter.impl.ints.IGoogleDoc;
import mx.iteso.adapter.impl.other.BackgroundImage;
/**
 * Google doc class.
 */
public class GoogleDoc implements IGoogleDoc {
    /**
     * Font.
     */
    private Font font;
    /**
     * Style.
     */
    private Object style;
    /**
     * Background image.
     */
    private BackgroundImage bi;
    /**
     * Magic number.
     */
    public static final int FONT_SIZE = 11;
    /**
     * Constructor.
     */
    public GoogleDoc() {
        font = new Font("Arial", 0, FONT_SIZE);
        style = new Object();
        bi = new BackgroundImage();
    }
    /**
     * @return Font.
     */
    public Font getFont() {
        System.out.println("Font is " + font.getName() + " " + font.getSize());
        return font;
    }
    /**
     * @return object of style.
     */
    public Object getStyle() {
        System.out.println("Google");
        return style;
    }
    /**
     * @return background image.
     */
    public BackgroundImage getBackground() {
        System.out.println("BackgroundImage from Google");
        return bi;
    }
    /**
     * @param sharingPermissions sharing permissions.
     */
    public void setSharingPermissions(final int sharingPermissions) {
        if (sharingPermissions == 0) {
            System.out.println("Sharing permissions are not enabled");
        } else {
            System.out.println("Sharing permissions enabled");
        }
    }
}
