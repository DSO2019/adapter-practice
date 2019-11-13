package mx.iteso.adapter;

/**
 * Class Font.
 */
public class Font {
    /**
     * Attr font name.
     */
    private String fontName;
    /**
     * Attr font size.
     */
    private int fontSize;
    /**
     * Public constructor.
     * @param newFontName Font name
     * @param newFontSize Font size
     */
    public Font(final String newFontName, final int newFontSize) {
        this.fontName = newFontName;
        this.fontSize = newFontSize;
    }
    /**
     * Getter for font name.
     * @return font name
     */
    public String getFontName() {
        return this.fontName;
    }
    /**
     * Getter for font size.
     * @return font size
     */
    public int getFontSize() {
        return this.fontSize;
    }
}
