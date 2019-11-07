package mx.iteso.beans;

import java.awt.*;

public class Format {
    private Font font;

    public Format() {
        int fontSize = 20; 
        this.font = new Font("Roboto", Font.PLAIN, fontSize);
    }

    public Font getFont() {
        return this.font;
    }

}