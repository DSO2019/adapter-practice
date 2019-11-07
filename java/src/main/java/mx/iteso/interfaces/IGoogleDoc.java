package mx.iteso.interfaces;

import java.awt.*;
import mx.iteso.beans.BackgroundImage;
import mx.iteso.beans.Format;

public interface IGoogleDoc {
    public Font getFont();
    public Format getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
    public int getSharingPermissions();
}

