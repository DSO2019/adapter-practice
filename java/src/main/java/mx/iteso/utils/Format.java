package mx.iteso.utils;

import java.awt.Font;

public class Format {
    private Font font;


    public Format() {
        final int fontSize = 12;
        this.font = new Font("Calibri", Font.ITALIC, fontSize);
    }

    public Font getFont() {
        return this.font;
    }
}