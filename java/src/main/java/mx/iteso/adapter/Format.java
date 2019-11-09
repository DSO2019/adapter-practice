package mx.iteso.adapter;

import java.awt.Font;

public class Format {

    private Font font;

    public Format(){
        int fontSize = 12;
        this.font = new Font("Arial",Font.PLAIN, fontSize);

    }

    public Font getFont(){
        return this.font;
    }
}