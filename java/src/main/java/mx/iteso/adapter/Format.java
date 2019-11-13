package mx.iteso.adapter;

/**
 * Class Format.
 */
public class Format {
    /**
     * Attr type Font.
     */
    private Font mFont;
    /**
     * Public constructor.
     * @param font font for the format
     */
    public Format(final Font font) {
        this.mFont = font;
    }
    /**
     * Getter for the font of the Format.
     * @return Format's font
     */
    public Font getFont() {
        return this.mFont;
    }
}
