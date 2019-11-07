package mx.iteso.adapter;

import mx.iteso.GoogleDocument;
import mx.iteso.utils.Image;

public class GoogleAdapter implements IWordDocument {

    GoogleDocument googleDocument;

    public GoogleAdapter(GoogleDocument googleDocument) {
        this.googleDocument = googleDocument;
    }

    public Object getFormat() {
        return this.googleDocument.getFont();
    }

    public Image getBackground() {
        Object background = (Object) this.googleDocument.getBackground();
        return (Image) background;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {
        this.googleDocument.setSharingPermissions((int) msOfficeVersion);
    }

    public MSLicense getLicense() {
        Object license = (Object) this.googleDocument.getSharingPermissions();
        return (MSLicense) license;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return false;
    }
    
}