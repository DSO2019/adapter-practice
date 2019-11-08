package mx.iteso.adapter;

/**
 * Class Format.
 */
public class Format {
    /**
     * Font.
     */
    private Font font;
    /**
     * Style.
     */
    private String style;
    /**
     * @param fon fon.
     * @param st st.
     */
    public Format(final Font fon, final String st) {
        this.font = fon;
        this.style = st;
    }
    /**
     * @param fon fon.
     */
    public Format(final Font fon) {
        this.font = fon;
    }
    /**
     * @return getfont.
     */
    public final String getFont() {
        return this.font.getFont();
    }

    /**
     * @return font.
     */
    public final Font returnFont() {
        return font;
    }
    /**
     * @param f font.
     */
    public final void setFont(final Font f) {
        this.font = f;
    }
    /**
     * @return style.
     */
    public final String getStyle() {
        return this.style;
    }
}
