package mx.iteso;

import mx.iteso.adapter.IWordDocument;
import mx.iteso.utils.MSLicense;
import mx.iteso.utils.Format;
import mx.iteso.utils.Image;

public class WordDocument implements IWordDocument {
    private Format format;
    private Image background;
    private float msOfficeVersion;
    private MSLicense msLicense;

    public WordDocument(final int msLicenseNumber) {
        this.msLicense = new MSLicense(msLicenseNumber);
    }

    public Format getFormat() {
        return this.format;
    }

    public Image getBackground() {
        return this.background;
    }

    /**
     * Get Office version.
     * @return the msOfficeVersion.
     */
    public float getMsOfficeVersion() {
        return msOfficeVersion;
    }

    public void setMSOfficeVersion(final float newMsOfficeVersion) {
        this.msOfficeVersion = newMsOfficeVersion;
    }

    public MSLicense getLicense() {
        return this.msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return !this.msLicense.isValid();
    }
    
}