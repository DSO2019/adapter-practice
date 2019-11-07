package mx.iteso;

import java.awt.Font;

import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

public class GoogleDocument implements IGoogleDoc {
    private Font font;
    private Format style;
    private BackgroundImage background;
    private int sharingPermissions;

    public GoogleDocument() {
        final int PERMISION = 1;
        this.style = new Format();
        this.font = this.style.getFont();
        this.background = new BackgroundImage();
        this.sharingPermissions = PERMISION;
    }

    public Font getFont() {
        return this.font;
    }

    public Format getStyle() {
        return this.style;
    }

    public BackgroundImage getBackground() {
        return this.background;
    }

    public void setSharingPermissions(final int incommingSharingPermissions) {
        this.sharingPermissions = incommingSharingPermissions;
    }

    public int getSharingPermissions() {
        return this.sharingPermissions;
    }
    
}