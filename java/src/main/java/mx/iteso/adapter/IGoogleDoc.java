package mx.iteso.adapter;


import java.awt.Font;

/**
 * Interface for the google document.
 */
public interface IGoogleDoc {

    /**
     * Return the font.
     * @return the font.
     */
    Font getFont();

    /**
     * Return the format.
     * @return the format.
     */
    Format getStyle();

    /**
     * Return the image of the doc.
     * @return the background image.
     */
    BackgroundImage getBackground();

    /**
     * Set the permissions.
     * @param sharingPermissions the permission.
     */
    void setSharingPermissions(int sharingPermissions);

    /**
     * Return the sharing permission.
     * @return the permission.
     */
    int getSharingPermissions();
}
