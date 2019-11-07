package mx.iteso;

import java.awt.Font;

import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.utils.BackgroundImage;

public class GoogleDocument implements IGoogleDoc {
    private int sharingPermissions = 1;

    public Font getFont() {
        return new Font("TimesRoman", Font.ITALIC, 12);
    }

    public Object getStyle() {
        return (Object) "Google document style";
    }

    public BackgroundImage getBackground() {
        return new BackgroundImage();
    }

    public void setSharingPermissions(int incommingSharingPermissions) {
        this.sharingPermissions = incommingSharingPermissions;
    }

    public int getSharingPermissions() {
        return this.sharingPermissions;
    }
    
}