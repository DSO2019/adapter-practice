package mx.iteso.adapter.googledoc;

import mx.iteso.adapter.Font;
import mx.iteso.adapter.Image;

public class GoogleDoc implements IGoogleDoc {

    protected int sharingPermissions;
    protected Font font;
    protected Object style;
    protected Image image;

    public GoogleDoc() {
        font = new Font("TimesNewRoman", 25);
        style = new Object();
        image = new Image(400.0,600.0);
    }
    public Font getFont() {
        return font;
    }
    public Object getStyle() {
        return style;
    }
    public Image getBackground() {
        return image;
    }
    public void setSharingPermissions(final int newSharingPermissions) {
        this.sharingPermissions = newSharingPermissions;
    }
}
