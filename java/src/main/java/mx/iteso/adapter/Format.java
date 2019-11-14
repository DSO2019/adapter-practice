package mx.iteso.adapter;

/**Format class. */
public class Format {
    /**Font type. */
    private String fontType;
    /**Font size. */
    private int fontSize;
    /**Constructor. */
    public Format(String font, int size) {
        this.fontType = font;
        this.fontSize = size;
    }
    /**@return true if objects are equal.  */
    @Override
    public boolean equals(Object o) {
        Format f = (Format) o;
        return f.fontSize == this.fontSize
        && this.fontType.equals(f.fontType);
    }

    /**@return font type. */
    public String getFontType() {
        return this.fontType;
    }
    /**@return font size. */
    public int getFontSize() {
        return this.fontSize;
    }
}
