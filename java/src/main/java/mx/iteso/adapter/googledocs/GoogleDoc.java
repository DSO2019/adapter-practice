package mx.iteso.adapter.googledocs;

import mx.iteso.adapter.BackgroundImage;

import java.awt.*;
import mx.iteso.adapter.Format;
import mx.iteso.adapter.BackgroundImage;

public class GoogleDoc implements IGoogleDoc{
    private Font font;
    private Format style;
    private BackgroundImage backgroundImage;
    private int sharingPermissions;


    public Font getFont() {
        return this.font;
    }

    public Object getStyle() {
        return this.style;
    }

    public BackgroundImage getBackground() {
        return this.backgroundImage;
    }

    public void setSharingPermissions(final int incomingSharingPermissions) {
        this.sharingPermissions = incomingSharingPermissions;
    }

    public int getSharingPermissions() {
        return 0;
    }
}
