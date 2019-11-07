package mx.iteso.adapter;

import javafx.scene.layout.BackgroundImage;

import java.awt.*;

public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}

