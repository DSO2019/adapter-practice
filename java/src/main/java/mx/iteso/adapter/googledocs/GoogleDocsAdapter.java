package mx.iteso.adapter.googledocs;

import mx.iteso.adapter.Format;
import mx.iteso.adapter.Image;
import mx.iteso.adapter.word.IWordDocument;
import mx.iteso.adapter.word.MSLicense;

/**
 * Google doc Adapter.
 */
public class GoogleDocsAdapter implements IWordDocument {

    /**
     * Google doc.
     */
    private IGoogleDoc googleDoc;

    /**
     *
     * @param newGoogleDoc .
     */
    public GoogleDocsAdapter(final  GoogleDoc newGoogleDoc) {
        this.googleDoc = newGoogleDoc;
    }

    /**
     *
     * @return google format.
     */
    public Format getFormat() {
        return this.googleDoc.getStyle();
    }

    /**
     *
     * @return background.
     */
    public Image getBackground() {
        return this.googleDoc.getBackground().getImage();
    }

    /**
     *
     * @param msOfficeVersion .
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        return;
    }

    /**
     *
     * @return livense.
     */
    public MSLicense getLicense() {
        return this.googleDoc.getSharingPermissions() == 1
                ? new MSLicense(1) : new MSLicense(0);
    }

    /**
     *
     * @return if license is valid.
     */
    public boolean restrictEditIfLicenseIsInvalid() {
        return !this.getLicense().isValid();
    }
}
