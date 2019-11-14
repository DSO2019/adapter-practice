package mx.iteso;

import java.awt.Font;

import mx.iteso.interfaces.IGoogleDoc;

/**
 * GoogleDoc.
 */
public class GoogleDoc implements IGoogleDoc {
    /**
     * font.
     */
    private Font font;
    /**
     * format.
     */
    private Format style;
    /**
     * backgroundImage.
     */
    private BackgrdImage backgrdImage;
    /**
     * Sharing permission id number.
     */
    private int sharingPermissions;

    /**
     * Constructor.
     */
    public GoogleDoc() {
        final int sharingPermission = 1;
        this.style = new Format();
        this.font = this.style.getFont();
        this.backgrdImage = new BackgrdImage();
        this.sharingPermissions = sharingPermission;
    }

    /**
     * getFont().
     * @return the current format.
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * getStyle().
     * @return the current style format.
     */
    public Format getStyle() {
        return this.style;
    }

    /**
     * background .
     * @return background.
     */
    public BackgrdImage getBackground() {
        return this.backgrdImage;
    }

    /**
     * setLicensePermissions.
     * @param sharingLicensePermission permission to be set.
     */
    public void setLicensePermissions(final int sharingLicensePermission) {
        this.sharingPermissions = sharingLicensePermission;
    }

    /**
     * getLicensePermissions().
     * @return permission.
     */
    public int getLicensePermissions() {
        return this.sharingPermissions;
    }
}
