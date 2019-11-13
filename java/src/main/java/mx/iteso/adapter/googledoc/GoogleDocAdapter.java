package mx.iteso.adapter.googledoc;

import mx.iteso.adapter.Format;
import mx.iteso.adapter.Image;
import mx.iteso.adapter.word.MSLicense;
import mx.iteso.adapter.word.WordDocument;

/**
 * GoogleDocAdapter Class.
 */
public class GoogleDocAdapter extends WordDocument {
    /**
     * Attr type GoogleDoc.
     */
    private GoogleDoc mGoogleDoc;
    /**
     * Public constructor.
     * @param newGoogleDoc google doc for adapter.
     */
    public GoogleDocAdapter(final GoogleDoc newGoogleDoc) {
        super();
        this.mGoogleDoc = newGoogleDoc;
        setMSOfficeVersion(mGoogleDoc.getSharingPermissions());
    }
    /**
     * Background image getter.
     * @return Background image for WordDocument.
     */
    @Override
    public Image getBackground() {
        return mGoogleDoc.getBackground();
    }
    /**
     * MSLicense getter.
     * @return MSLicense from the GoogleDoc.
     */
    @Override
    public MSLicense getLicense() {
        return super.getLicense();
    }
    /**
     * Format getter.
     * @return Format getter from the GoogleDoc.
     */
    @Override
    public Format getFormat() {
        return new Format(mGoogleDoc.getFont());
    }
    /**
     * Check if is valid license.
     * @return isValid.
     */
    @Override
    public boolean restrictEditIfLicenseIsInvalid() {
        return super.restrictEditIfLicenseIsInvalid();
    }
}
