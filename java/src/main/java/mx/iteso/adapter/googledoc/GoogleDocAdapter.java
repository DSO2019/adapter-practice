package mx.iteso.adapter.googledoc;

import mx.iteso.adapter.Image;
import mx.iteso.adapter.word.MSLicense;
import mx.iteso.adapter.word.WordDocument;

public class GoogleDocAdapter extends WordDocument {
    private GoogleDoc mGoogleDoc;
    public GoogleDocAdapter(GoogleDoc newGoogleDoc) {
        this.mGoogleDoc = newGoogleDoc;
    }

    @Override
    public Image getBackground() {
        return super.getBackground();
    }

    @Override
    public MSLicense getLicense() {
        return super.getLicense();
    }

    @Override
    public Object getFormat() {
        return super.getFormat();
    }

    @Override
    public void setMSOfficeVersion(float msOfficeVersion) {
        super.setMSOfficeVersion(msOfficeVersion);
    }

    @Override
    public boolean restrictEditIfLicenseIsInvalid() {
        return super.restrictEditIfLicenseIsInvalid();
    }
}
