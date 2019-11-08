package mx.iteso.adapter;

import java.awt.*;

public class Format {

    private Font font;

    public Format(){
        final int fontSize = 20;
        this.font = new Font("Arial", Font.ITALIC, fontSize);
    }

    public Font getFont() {
        return font;
    }
}
