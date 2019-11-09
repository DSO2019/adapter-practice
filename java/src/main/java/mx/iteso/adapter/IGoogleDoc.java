package mx.iteso.adapter;

import mx.iteso.adapter.BackgroundImage;
import mx.iteso.adapter.Format;

import java.awt.*;

public interface IGoogleDoc {
    public Font getFont();
    public Format getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
    public int getSharingPermissions();
}

