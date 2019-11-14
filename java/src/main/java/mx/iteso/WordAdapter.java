package mx.iteso;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

import java.awt.*;

/**
 * Word Adapter class.
 */
public class WordAdapter implements IGoogleDoc {

    /**
     * word Document.
     */
    private IWordDocument wordDocument;

    /**
     * Word Adapter.
     *
     * @param wordDocument document.
     */
    public WordAdapter(final WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    /**
     * Get style.
     *
     * @return format.
     */
    public Format getStyle() {
        return this.wordDocument.getFormat();
    }

    /**
     * Get font.
     *
     * @return Font.
     */
    public Font getFont() {
        return this.wordDocument.getFormat().getFont();
    }

    /**
     * Set sharing permissions.
     *
     * @param sharingPermissions sharingPermissions.
     */
    public void setSharingPermissions(final int sharingPermissions) {
        return;
    }

    /**
     * Get background.
     *
     * @return BackgroundImage.
     */
    public BackgroundImage getBackground() {
        return new BackgroundImage(this.wordDocument.getBackground());
    }

    /**
     * Get sharing permissions.
     *
     * @return int.
     */
    public int getSharingPermissions() {
        return this.wordDocument.restrictEditIfLicenseIsInvalid() ? 0 : 1;
    }
}
