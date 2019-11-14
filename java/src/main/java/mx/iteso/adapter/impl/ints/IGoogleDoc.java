package mx.iteso.adapter.impl.ints;

import java.awt.Font;
import mx.iteso.adapter.impl.other.BackgroundImage;
/**
 * Google document interface.
 */
public interface IGoogleDoc {
    /**
     * Gets Font.
     * @return font.
     */
    Font getFont();
    /**
     * @return object of style.
     */
    Object getStyle();
    /**
     * @return Background Image of document.
     */
    BackgroundImage getBackground();
    /**
     *
     * @param sharingPermissions sets permissions.
     */
    void setSharingPermissions(int sharingPermissions);
}
