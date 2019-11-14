package mx.iteso.adapter;

import mx.iteso.GoogleDocument;
import mx.iteso.utils.Format;
import mx.iteso.utils.Image;
import mx.iteso.utils.MSLicense;

/** GoogleAdapter class. */
public class GoogleAdapter implements IWordDocument {

    /** google document attribute. */
    private IGoogleDoc googleDocument;

    /** Google adapter constructor.
     * @param newGoogleDocument google document.
    */
    public GoogleAdapter(final GoogleDocument newGoogleDocument) {
        this.googleDocument = newGoogleDocument;
    }

    /** Get format.
     * @return format.
     */
    public Format getFormat() {
        return this.googleDocument.getStyle();
    }

    /** Get background.
     * @return background.
     */
    public Image getBackground() {
        return this.googleDocument.getBackground().getImage();
    }

    /** Set office version.
     * @param msOfficeVersion office version.
    */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        return;
    }

    /** Get license.
     * @return license.
     */
    public MSLicense getLicense() {
        return this.googleDocument.getSharingPermissions() == 1
        ? new MSLicense(1) : new MSLicense(-1);
    }

    /** Is invalid.
     * @return is valid.
     */
    public boolean restrictEditIfLicenseIsInvalid() {
        return !this.getLicense().isValid();
    }
}
