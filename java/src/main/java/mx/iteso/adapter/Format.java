package mx.iteso.adapter;

/**
 * Creado por Lucifer.
 */
public class Format {
    /**
     * font.
     */
    private Font font;
    /**
     * style.
     */
    private String style;

    /**
     * @param fon font.
     * @param st style.
     */
    public Format(final Font fon, final String st) {
        this.font = fon;
        this.style = st;
    }

    /**
     * @param fon font.
     */
    public Format(final Font fon) {
        this.font = fon;
    }

    /**
     * @return font.
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
