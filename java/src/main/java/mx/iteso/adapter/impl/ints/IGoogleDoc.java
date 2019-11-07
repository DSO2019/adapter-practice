package mx.iteso.adapter.impl.ints;

import java.awt.Font;

import mx.iteso.adapter.impl.other.BackgroundImage;

public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}

