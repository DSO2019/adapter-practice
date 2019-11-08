package mx.iteso.adapter;


/** Format.*/
public class Format {

    /** font.*/
    private Font font;

    /** style.*/
    private String style;

    /** @param fnt .
     * @param stl .*/
    public Format(final Font fnt, final String stl) {
        this.font = fnt;
        this.style = stl;
    }

    /** @param fnt .*/
    public Format(final Font fnt) {
        this.font = fnt;
    }

    /** @return font.*/
    public final String getFont() {
        return this.font.getFont();
    }

    /** @return font.*/
    public final Font returnFont() {
        return font;
    }

    /** @param fnt .*/
    public final void setFont(final Font fnt) {
        this.font = fnt;
    }

    /** @return style.*/
    public final String getStyle() {
        return this.style;
    }
}
