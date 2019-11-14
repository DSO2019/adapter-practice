package mx.iteso.utils;

import java.awt.*;

/**
 * class Format.
 */
public class Format {
    /**
     * font.
     */
    private Font font;

    /**
     * Constructor.
     */
    public Format() {
        final int fontSize = 12;
        this.font = new Font("Calibri", Font.ITALIC, fontSize);
    }

    /**
     * Get font.
     *
     * @return Font.
     */
    public Font getFont() {
        return this.font;
    }
}
