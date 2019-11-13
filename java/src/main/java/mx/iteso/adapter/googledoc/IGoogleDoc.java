package mx.iteso.adapter.googledoc;

import mx.iteso.adapter.Font;
import mx.iteso.adapter.Image;
import mx.iteso.adapter.Style;

/**
 * IGoogleDoc Interface.
 */
public interface IGoogleDoc {
    /**
     * Font getter.
     * @return GoogleDoc's Font.
     */
    Font getFont();
    /**
     * Style getter.
     * @return GoogleDoc's style.
     */
    Style getStyle();
    /**
     * Background image getter.
     * @return GoogleDoc's background image.
     */
    Image getBackground();
    /**
     * Sharing permissions setter.
     * @param sharingPermissions Sharing permissions.
     */
    void setSharingPermissions(int sharingPermissions);
}
