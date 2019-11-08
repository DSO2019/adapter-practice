package mx.iteso.adapter;

import java.awt.Font;
import mx.iteso.interfaces.IGoogleDoc;
import mx.iteso.interfaces.IWordDocument;
import mx.iteso.beans.Format;
import mx.iteso.beans.MSLicense;
import mx.iteso.beans.BackgroundImage;

/** Word to Google Adapter. */
public class WordToGoogle implements IGoogleDoc {

    /** Word Document to be adapted. */
    private IWordDocument wordDocument;

    /** Constructor.
     * @param incomingWordDoc google doc.
    */
    public WordToGoogle(final IWordDocument incomingWordDoc) {
        this.wordDocument = incomingWordDoc;
    }

    /** Font getter.
     * @return the actual Font.
     */
    public Font getFont() {
        return wordDocument.getFormat().getFont();
    }

    /**
     * Style getter.
     * @return the current Format.
     */
    public Format getStyle() {
        return wordDocument.getFormat();
    }

    /**
     * Background getter.
     * @return Background Image.
     */
    public BackgroundImage getBackground() {
        return new BackgroundImage(wordDocument.getBackground());
    }

    /** Sharing permissions setter.
     * @param sharedPermissionNumber permission id.
    */
    public void setSharingPermissions(final int sharedPermissionNumber) {
        return;
    }

    /**
     * Sharing permissions getter.
     * @return permission id.
     */
    public int getSharingPermissions() {
        final MSLicense license = wordDocument.getLicense();
        if (wordDocument.restrictEditIfLicenseIsInvalid(license)) {
            return 0;
        } else {
            return 1;
        }
    }
}
