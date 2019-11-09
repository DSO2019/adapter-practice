package mx.iteso.adapter;

import mx.iteso.adapter.IGoogleDoc;
import java.awt.*;
import mx.iteso.adapter.BackgroundImage;
import mx.iteso.adapter.Format;

public class GoogleDoc implements IGoogleDoc {
    private Font font;
    private BackgroundImage bckImage;
    private Format style;
    private int shrPermissions;

    public GoogleDoc(){
        this.style = new Format();
        this.font = this.style.getFont();
        this.bckImage = new BackgroundImage(new Image("img.png"));
        this.shrPermissions = 1;
    }

    public Font getFont(){
        return this.font;
    }

    public Format getStyle(){
        return this.style;
    }

    public BackgroundImage getBackground(){
        return this.bckImage;
    }

    public void setSharingPermissions(int SharingPermissions){
        this.shrPermissions = SharingPermissions;
    }

    public int getSharingPermissions(){
        return this.shrPermissions;
    }

}