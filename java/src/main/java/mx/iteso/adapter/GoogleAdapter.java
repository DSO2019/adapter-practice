package mx.iteso.adapter;

import mx.iteso.GoogleDocument;
import mx.iteso.utils.Format;
import mx.iteso.utils.Image;
import mx.iteso.utils.MSLicense;

public class GoogleAdapter implements IWordDocument {

    private IGoogleDoc googleDocument;

    public GoogleAdapter(GoogleDocument googleDocument) {
        this.googleDocument = googleDocument;
    }

    public Format getFormat() {
        return this.googleDocument.getStyle();
    }

    public Image getBackground() {
        return this.googleDocument.getBackground().getImage();
    }

    public void setMSOfficeVersion(final float msOfficeVersion) {
        return;
    }

    public MSLicense getLicense() {
        return this.googleDocument.getSharingPermissions() == 1 ? 
        new MSLicense(1) : new MSLicense(-1);
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return msLicense.isValid();
    }
}