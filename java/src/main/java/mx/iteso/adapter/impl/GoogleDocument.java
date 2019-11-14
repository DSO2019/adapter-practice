package mx.iteso.adapter.impl;


import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.media.Image;
import mx.iteso.adapter.media.Format;
import java.awt.*;


public class GoogleDocument implements IGoogleDoc {
    /**
     * Font.
     */
    private Font font;
    /**
     * Style.
     */
    private Format style;
    /**
     * Image.
     */
    private Image image;

    /**
     * Font getter.
     * @return current font
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * Font setter.
     * @param format new format
     */
    public void setFont(Format format) {
        this.font = format.getFont();
        this.style = format;
    }

    /**
     * Format getter.
     * @return current font.
     */
    public Format getStyle() {
        return this.style;
    }

    /**
     * Image getter.
     * @return current image
     */
    public Image getBackground() {
        return this.image;
    }
}
