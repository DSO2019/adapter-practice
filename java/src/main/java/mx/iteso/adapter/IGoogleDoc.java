package mx.iteso.adapter;

import mx.iteso.adapter.media.Format;
import mx.iteso.adapter.media.Image;
import java.awt.*;

public interface IGoogleDoc {
    public int sharingPermission = 0;
    public Font getFont();
    public void setFont(Format format);
    public Format getStyle();
    public Image getBackground();
}

