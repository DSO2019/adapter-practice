package mx.iteso.adapter.impl;


import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.MSLicense;
import mx.iteso.adapter.media.Format;
import mx.iteso.adapter.media.Image;


public class WordDocument implements IWordDocument {
    /**
     * Format.
     */
    private Format format;
    /**
     * Image.
     */
    private Image backgroundImage;
    /**
     * MSLicense.
     */
    private MSLicense msLicense;
    /**
     * msOfficeVersion.
     */
    private float msOfficeVersion;

    /**
     * Class constructor.
     * @param msLicense license number
     */
    public WordDocument(final MSLicense msLicense) {
        this.msLicense = msLicense;
    }

    /**
     * Format getter.
     * @return format
     */
    public Format getFormat() {
        return this.format;
    }

    /**
     * Format setter.
     * @param format new
     */
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     * Image getter.
     * @return Image
     */
    public Image getBackground() {
        return this.backgroundImage;
    }

    /**
     * msOfficeVersion setter.
     * @param msOfficeVersion number
     */
    public void setMSOfficeVersion(float msOfficeVersion) {
        this.msOfficeVersion = msOfficeVersion;
    }

    /**
     * MSLicense getter.
     * @return
     */
    public MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     * Edir permissions.
     * @param msLicense npi
     * @return
     */
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        return false;
    }
}
