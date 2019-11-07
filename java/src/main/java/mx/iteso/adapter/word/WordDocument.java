package mx.iteso.adapter.word;


import mx.iteso.adapter.Image;

public class WordDocument implements IWordDocument {

    protected MSLicense msLicense;
    protected Object format;
    protected Image image;

    public WordDocument() {
        format = new Object();
        image = new Image(100.0, 200.0);
    }

    public Object getFormat() {
        return format;
    }

    public Image getBackground() {
        return image;
    }

    public void setMSOfficeVersion(final float msOfficeVersion) {
        this.msLicense = new MSLicense(msOfficeVersion);
    }

    public MSLicense getLicense() {
        return msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid() {
        return msLicense != null && msLicense.getLicenseVersion() > 1.6;
    }
}
