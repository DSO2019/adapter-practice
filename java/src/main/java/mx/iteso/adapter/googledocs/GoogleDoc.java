package mx.iteso.adapter.googledocs;

import mx.iteso.adapter.BackgroundImage;

import java.awt.Font;
import mx.iteso.adapter.Format;

/**
 * Google Doc Class.
 */
public class GoogleDoc implements IGoogleDoc {
    /**
     * Font.
     */
    private Font font;
    /**
     * Format.
     */
    private Format format;
    /**
     * Bkground image.
     */
    private BackgroundImage backgroundImage;
    /**
     * shared Permission //denied.
     */
    private int sharingPermissions;

    /**
     *
     * @return font.
     */
    public Font getFont() {
        return this.font;
    }

    /**
     *
     * @return Format.
     */
    public Format getStyle() {
        return this.format;
    }

    /**
     *
     * @return Format???????.
     */
    public Format getFormat() {
        return this.format;
    }

    /**
     *
     * @return background img.
     */
    public BackgroundImage getBackground() {
        return this.backgroundImage;
    }

    /**
     *
     * @param incomingSharingPermissions .
     */
    public void setSharingPermissions(final int incomingSharingPermissions) {
        this.sharingPermissions = incomingSharingPermissions;
    }

    /**
     *
     * @return permission denied.
     */
    public int getSharingPermissions() {
        return 0;
    }
}
