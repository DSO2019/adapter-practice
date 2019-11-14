package mx.iteso;

import java.awt.Font;

import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

/** Google Document class. */
public class GoogleDocument implements IGoogleDoc {
    /** Font attribute. */
    private Font font;

    /** Format attribute. */
    private Format style;

    /** BackgroundImage attribute. */
    private BackgroundImage background;

    /** sharingPermissions attribute. */
    private int sharingPermissions;

    /** Constructor. */
    public GoogleDocument() {
        final int permission = 1;
        this.style = new Format();
        this.font = this.style.getFont();
        this.background = new BackgroundImage();
        this.sharingPermissions = permission;
    }

    /** Get font method.
     * @return the font.
     */
    public Font getFont() {
        return this.font;
    }

    /** Get style method.
     * @return style.
     */
    public Format getStyle() {
        return this.style;
    }

    /** Get background method.
     * @return background image.
     */
    public BackgroundImage getBackground() {
        return this.background;
    }

    /** Set sharing permissions.
     * @param incommingSharingPermissions sharing permissions.
     */
    public void setSharingPermissions(final int incommingSharingPermissions) {
        this.sharingPermissions = incommingSharingPermissions;
    }

    /** Get sharing permissions.
     * @return sharing permissions.
     */
    public int getSharingPermissions() {
        return this.sharingPermissions;
    }

}
