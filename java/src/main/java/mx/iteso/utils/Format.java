package mx.iteso.utils;

import java.awt.Font;

/** Format class. */
public class Format {
    /** Font attribute. */
    private Font font;

    /** Constructor. */
    public Format() {
        final int fontSize = 12;
        this.font = new Font("Calibri", Font.ITALIC, fontSize);
    }

    /** Get font.
     * @return font.
     */
    public Font getFont() {
        return this.font;
    }
}
