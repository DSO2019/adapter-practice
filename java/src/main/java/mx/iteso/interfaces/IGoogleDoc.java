package mx.iteso.interfaces;

import java.awt.Font;

import mx.iteso.BackgrdImage;
import mx.iteso.Format;

/**
 * IGoogleDoc interface.
 */
public interface IGoogleDoc {
    /**
     * getFont().
     * @return the current format.
     */
    Font getFont();

    /**
     * getStyle().
     * @return the current style format.
     */
    Format getStyle();

    /**
     * getBackground().
     * @return the current background.
     */
    BackgrdImage getBackground();

    /**
     * Sharing permissions setter.
     * @param sharingPermission permission to be set.
     */
    void setLicensePermissions(int sharingPermission);

    /**
     * Sharing permissions getter.
     *
     * @return permission id.
     */
    int getLicensePermissions();
}

