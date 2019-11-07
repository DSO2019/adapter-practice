package mx.iteso;

import java.awt.*;
import mx.iteso.interfaces.IGoogleDoc;
import mx.iteso.beans.Format;
import mx.iteso.beans.BackgroundImage;

public class GoogleDoc implements IGoogleDoc {
    private Font font;
    private Format style;
    private BackgroundImage backgroundImage;
    private int sharingPermissions;

    public GoogleDoc(){
        this.style = new Format();
        this.font = this.style.getFont();
        this.backgroundImage = new BackgroundImage();
        this.sharingPermissions = 0;
    }

    public Font getFont(){
        return this.font;
    }
    public Format getStyle(){
        return this.style;
    }
    public BackgroundImage getBackground(){
        return this.backgroundImage;
    }
    public void setSharingPermissions(int incomingSharingPermission){
        this.sharingPermissions = incomingSharingPermission;
    }

    public int getSharingPermissions(){
        return this.sharingPermissions;
    }

}