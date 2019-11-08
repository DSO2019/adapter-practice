package mx.iteso.interfaces;

import java.awt.Font;
import mx.iteso.beans.BackgroundImage;
import mx.iteso.beans.Format;

/** Google Document interface. */
public interface IGoogleDoc {
    /**
     * Font getter.
     * @return the current format.
     */
    Font getFont();

    /**
     * Style getter.
     * @return the current style format.
     */
    Format getStyle();

    /**
     * Background image getter.
     * @return the current background.
     */
    BackgroundImage getBackground();

    /**
     * Sharing permissions setter.
     * @param incomingSharingPermission permission to be set.
     */
    void setSharingPermissions(int incomingSharingPermission);

    /**
     * Sharing permissions getter.
     * @return permission id.
     */
    int getSharingPermissions();
}
