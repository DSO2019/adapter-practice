package mx.iteso.adapter.impl.adapter;

import java.awt.Font;
import mx.iteso.adapter.impl.ints.IGoogleDoc;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.other.BackgroundImage;
/**
 * Word document to google doc adapter class.
 */
public class WordAdapter implements IGoogleDoc {
    /**
     * Word document.
     */
    private IWordDocument wordDocument;
    /**
     *
     * @param wordDocument1 constructor.
     */
    public WordAdapter(final IWordDocument wordDocument1) {
        this.wordDocument = wordDocument1;
    }
    /**
     * @return font.
     */
    public Font getFont() {
        System.out.println("Google's default font is Arial");
        return null;
    }
    /**
     * @return Object of style.
     */
    public Object getStyle() {
        return (Object) this.wordDocument.getFormat();
    }
    /**
     * @return Background image.
     */
    public BackgroundImage getBackground() {
        Object background = this.wordDocument.getBackground();
        return (BackgroundImage) background;
    }
    /**
     * @param sharingPermissions sharing permissions.
     */
    public void setSharingPermissions(final int sharingPermissions) {
        this.wordDocument.setMSOfficeVersion((float) sharingPermissions);
    }
}
