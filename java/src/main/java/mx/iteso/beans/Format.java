package mx.iteso.beans;

import java.awt.Font;

/** Format class. */
public class Format {
    /** The current font. */
    private Font font;

    /** Constructor. */
    public Format() {
        final int fontSize = 20;
        this.font = new Font("Roboto", Font.PLAIN, fontSize);
    }

    /** Font getter.
     * @return the current font.
     */
    public Font getFont() {
        return this.font;
    }
}
