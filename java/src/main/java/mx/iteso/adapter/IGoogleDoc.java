package mx.iteso.adapter;

import java.awt.*;

import mx.iteso.utils.BackgroundImage;

public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}

