package mx.iteso.adapter.googledoc;

import mx.iteso.adapter.Font;
import mx.iteso.adapter.Image;

public interface IGoogleDoc {
    Font getFont();
    Object getStyle();
    Image getBackground();
    void setSharingPermissions(final int sharingPermissions);
}
