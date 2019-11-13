package mx.iteso.adapter;

/**
 * Style class.
 */
public class Style {
    /**
     * Attr type Font.
     */
    private Font mFont;
    /**
     * Public constructor.
     * @param font font of the style.
     */
    public Style(final Font font) {
            this.mFont = font;
    }
    /**
     * Font getter.
     * @return Style's font.
     */
    public Font getFont() {
        return this.mFont;
    }
}
