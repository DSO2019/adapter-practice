package mx.iteso;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

import java.awt.*;

/**
 * interface IGoogleDoc.
 */
public interface IGoogleDoc {
    /**
     * Get font.
     *
     * @return font.
     */
    Font getFont();

    /**
     * Get format.
     *
     * @return format.
     */
    Format getStyle();

    /**
     * Get background.
     *
     * @return BackgroundImage.
     */
    BackgroundImage getBackground();

    /**
     * Set sharing permissions.
     *
     * @param sharingPermissions sharingPermissions.
     */
    void setSharingPermissions(int sharingPermissions);

    /**
     * Get sharing permissions.
     *
     * @return int.
     */
    int getSharingPermissions();
}
