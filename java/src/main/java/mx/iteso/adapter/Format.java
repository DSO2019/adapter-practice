package mx.iteso.adapter;

import java.awt.Font;

/**
 * Format of doc.
 */
public class Format {
    /**
     * font.
     */
    private Font font;

    /**
     * define format.
     */
    public Format() {
        final int fontSize = 20;
        this.font = new Font("Arial", Font.BOLD, fontSize);
    }

    /**
     *
     * @return font of doc.
     */
    public Font getFont() {
        return font;
    }
}
