package mx.iteso.adapter.impl;


import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.MSLicense;
import mx.iteso.adapter.media.Format;
import mx.iteso.adapter.media.Image;


public class WordDocument implements IWordDocument {
    private Format format;
    private Image backgroundImage;
    private MSLicense msLicense;
    private float msOfficeVersion;

    public WordDocument(final MSLicense msLicense) {
        this.msLicense = msLicense;
    }

    public Format getFormat() {
        return this.format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Image getBackground() {
        return this.backgroundImage;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {
        this.msOfficeVersion = msOfficeVersion;
    }

    public MSLicense getLicense() {
        return this.msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        return false;
    }
}
