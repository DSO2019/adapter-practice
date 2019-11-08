package mx.iteso;

import java.awt.Font;
import mx.iteso.interfaces.IGoogleDoc;
import mx.iteso.beans.Format;
import mx.iteso.beans.BackgroundImage;

/** Google Document class. */
public class GoogleDoc implements IGoogleDoc {
    /** Document font. */
    private Font font;
    /** Document format. */
    private Format style;
    /** Document background image. */
    private BackgroundImage backgroundImage;
    /** Sharing permission id number. */
    private int sharingPermissions;

    /** Constructor. */
    public GoogleDoc() {
        final int sharingPermission = 1;
        this.style = new Format();
        this.font = this.style.getFont();
        this.backgroundImage = new BackgroundImage();
        this.sharingPermissions = sharingPermission;
    }

    /**
     * Font getter.
     * @return the current format.
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * Style getter.
     * @return the current style format.
     */
    public Format getStyle() {
        return this.style;
    }

    /**
     * Background image getter.
     * @return the current background.
     */
    public BackgroundImage getBackground() {
        return this.backgroundImage;
    }

    /**
     * Sharing permissions setter.
     * @param incomingSharingPermission permission to be set.
     */
    public void setSharingPermissions(final int incomingSharingPermission) {
        this.sharingPermissions = incomingSharingPermission;
    }

    /**
     * Sharing permissions getter.
     * @return permission id.
     */
    public int getSharingPermissions() {
        return this.sharingPermissions;
    }
}
