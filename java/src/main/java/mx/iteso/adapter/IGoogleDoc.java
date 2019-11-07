package mx.iteso.adapter;

import java.awt.*;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

public interface IGoogleDoc {
    public Font getFont();
    public Format getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
	public int getSharingPermissions();
}

