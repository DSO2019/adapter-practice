package mx.iteso.adapter;

import java.awt.Font;

/**
 * The format of a document.
 */
public class Format {

    /**
     * The font of the format.
     */
    private Font font;

    /**
     * This is the default size.
     */
    private static final int DEFAULT_SIZE = 12;

    /**
     * Creator.
     */
    public Format() {
        int fontSize = DEFAULT_SIZE;
        this.font = new Font("Arial", Font.PLAIN, fontSize);

    }

    /**
     * Return the font.
     * @return the font.
     */
    public final Font getFont() {
        return this.font;
    }
}
