package mx.iteso;

import java.awt.Font;

/**
 * Format.
 */
public class Format {
    /**
     * Font.
     */
    private Font font;

    /**
     * getFont().
     * @return the current font.
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * Format().
     */
    public Format() {
        final int fontSize = 20;
        this.font = new Font("Roboto", Font.PLAIN, fontSize);
    }


}
