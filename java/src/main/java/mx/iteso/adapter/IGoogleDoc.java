package mx.iteso.adapter;

import java.awt.Font;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

/** IGoogleDoc interface. */
public interface IGoogleDoc {
    /** Get font method.
     * @return font.
    */
    Font getFont();

    /** Get format method.
     * @return format.
     */
    Format getStyle();

    /** Get background method.
     * @return background.
     */
    BackgroundImage getBackground();

    /** Set sharing permissions.
     * @param sharingPermissions sharing permissions.
     */
    void setSharingPermissions(int sharingPermissions);

    /** Get sharing permissions method.
     * @return sharing permissions.
     */
    int getSharingPermissions();
}
