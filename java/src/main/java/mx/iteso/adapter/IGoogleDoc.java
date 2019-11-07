package mx.iteso.adapter;

import java.awt.Font;
/** */
public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}

