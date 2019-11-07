package mx.iteso.adapter;

import java.awt.Font;

import mx.iteso.interfaces.IGoogleDoc;
import mx.iteso.interfaces.IWordDocument;
import mx.iteso.beans.Format;
import mx.iteso.beans.Image;
import mx.iteso.beans.MSLicense;

/** Google to Word Adapter. */
public class GoogleToWord implements IWordDocument {
    /** Google document to be converted. */
    private IGoogleDoc googleDoc;

    /**
     * Font getter.
     * @return the current Font.
     */
    public Font getFont() {
        return googleDoc.getFont();
    }

    /**
     * Format getter.
     * @return the current Format.
     */
    public Format getFormat() {
        return (Format) googleDoc.getStyle();
    }

    /**
     * Background getter.
     * @return background Image.
    */
    public Image getBackground() {
        return googleDoc.getBackground().getImage();
    }

    /** MSOffice Version setter.
     * @param msOfficeVersion the version.
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        return;
    }

    /**
     * MSLicense getter.
     * @return MSLicense.
     */
    public MSLicense getLicense() {
        final int validNumber = 10001;
        final int invalidNumber = 1;
        if (googleDoc.getSharingPermissions() == 1) {
            return new MSLicense(validNumber);
        } else {
            return new MSLicense(invalidNumber);
        }
    }

    /**
     * Restrict edit evaluation.
     * @param msLicense the license to be evaluated.
     * @return if permission should be restricted.
     */
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        return msLicense.isValid();
    }
}
