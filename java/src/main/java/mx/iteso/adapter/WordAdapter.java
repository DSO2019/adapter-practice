package mx.iteso.adapter;

import java.awt.Font;

import mx.iteso.WordDocument;
import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

/** Word Adapter class. */
public class WordAdapter implements IGoogleDoc {

    /** Word document attribute. */
    private IWordDocument wordDocument;

    /** Word adapter constructor.
     * @param wordDoc word document.
     */
    public WordAdapter(final WordDocument wordDoc) {
        this.wordDocument = wordDoc;
    }

    /** Get font.
     * @return font.
     */
    public Font getFont() {
        return this.wordDocument.getFormat().getFont();
    }

    /** Get style.
     * @return format.
     */
    public Format getStyle() {
        return this.wordDocument.getFormat();
    }

    /** Get background.
     * @return background.
     */
    public BackgroundImage getBackground() {
        return new BackgroundImage(this.wordDocument.getBackground());
    }

    /** Set sharing permissions.
     * @param sharingPermissions sharing permissions.
     */
    public void setSharingPermissions(final int sharingPermissions) {
        return;
    }

    /** Get sharing permissions.
     * @return sharing permissions.
     */
    public int getSharingPermissions() {
        return this.wordDocument.restrictEditIfLicenseIsInvalid() ? 0 : 1;
    }
}
