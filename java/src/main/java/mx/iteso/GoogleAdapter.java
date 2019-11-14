package mx.iteso;

import mx.iteso.utils.Format;
import mx.iteso.utils.Image;
import mx.iteso.utils.MSLicense;

/**
 * class GoogleAdapter.
 */
public class GoogleAdapter implements IWordDocument {

    /**
     * google Document.
     */
    private IGoogleDoc googleDocument;

    /**
     * Google Adapter.
     *
     * @param googleDocument google document.
     */
    public GoogleAdapter(final GoogleDocument googleDocument) {
        this.googleDocument = googleDocument;
    }

    /**
     * Get format.
     *
     * @return format.
     */
    public Format getFormat() {
        return this.googleDocument.getStyle();
    }

    /**
     * Set office version.
     *
     * @param msOfficeVersion office version.
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        return;
    }

    /**
     * Get background.
     *
     * @return Image.
     */
    public Image getBackground() {
        return this.googleDocument.getBackground().getImage();
    }

    /**
     * Get license.
     *
     * @return license.
     */
    public MSLicense getLicense() {
        return this.googleDocument.getSharingPermissions() == 1
                ? new MSLicense(1) : new MSLicense(-1);
    }

    /**
     * Is invalid.
     *
     * @return is valid.
     */
    public boolean restrictEditIfLicenseIsInvalid() {
        return !this.getLicense().isValid();
    }
}
