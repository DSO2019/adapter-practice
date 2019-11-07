package mx.iteso.adapter.impl.document;

import java.awt.Font;

import mx.iteso.adapter.impl.ints.IGoogleDoc;
import mx.iteso.adapter.impl.other.BackgroundImage;

public class GoogleDoc implements IGoogleDoc {
    Font font;
    Object style;
    BackgroundImage bi;

    public GoogleDoc(){
        font = new Font("Arial", 0, 11);
        style = new Object();
        bi = new BackgroundImage();
    }

    public Font getFont() {
        System.out.println("Font is " + font.getName() + " " + font.getSize());
        return font;
    }

    public Object getStyle() {
        System.out.println("Google");
        return style;
    }

    public BackgroundImage getBackground() {
        System.out.println("BackgroundImage from Google");
        return bi;
    }

    public void setSharingPermissions(int SharingPermissions) {
        if(SharingPermissions == 0){
            System.out.println("Sharing permissions are not enabled");
        } else {
            System.out.println("Sharing permissions enabled");
        }
    }


}