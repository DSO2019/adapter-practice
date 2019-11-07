package mx.iteso.adapter.impl.adapter;

import java.awt.Font;
import mx.iteso.adapter.impl.ints.IGoogleDoc;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.other.BackgroundImage;

public class WordAdapter implements IGoogleDoc {
    IWordDocument wordDocument;

    public WordAdapter(IWordDocument wordDocument1){
        this.wordDocument = wordDocument1;
    }

    public Font getFont() {
        System.out.println("Google's default font is Arial");
        return null;
    }

    public Object getStyle() {
        return (Object) this.wordDocument.getFormat();
    }

    public BackgroundImage getBackground() {
        Object background = this.wordDocument.getBackground();
        return (BackgroundImage) background;
    }

    public void setSharingPermissions(int SharingPermissions) {
        this.wordDocument.setMSOfficeVersion((float) SharingPermissions);    
    }
    
}