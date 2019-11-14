package mx.iteso;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

import java.awt.*;

/**
 * class GoogleDocument.
 */
public class GoogleDocument implements IGoogleDoc {

    /**
     * BackgroundImage.
     */
    private BackgroundImage background;

    /**
     * sharingPermissions.
     */
    private int sharingPermissions;

    /**
     * Font.
     */
    private Font font;

    /**
     * Format.
     */
    private Format style;

    /**
     * Constructor.
     */
    public GoogleDocument() {
        final int permission = 1;
        this.style = new Format();
        this.font = this.style.getFont();
        this.background = new BackgroundImage();
        this.sharingPermissions = permission;
    }

    /**
     * Get font.
     *
     * @return Font.
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * Get style.
     *
     * @return Format.
     */
    public Format getStyle() {
        return this.style;
    }

    /**
     * Get background.
     *
     * @return BackgroundImage.
     */
    public BackgroundImage getBackground() {
        return this.background;
    }

    /**
     * SetSharingPermissions.
     *
     * @param sharingPermissions sharing permissions.
     */
    public void setSharingPermissions(final int sharingPermissions) {
        this.sharingPermissions = sharingPermissions;
    }

    /**
     * Get sharing permissions.
     *
     * @return int.
     */
    public int getSharingPermissions() {
        return this.sharingPermissions;
    }

}
