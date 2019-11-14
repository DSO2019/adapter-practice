package mx.iteso;

import mx.iteso.utils.Format;
import mx.iteso.utils.Image;
import mx.iteso.utils.MSLicense;

/**
 * class WordDocument.
 */
public class WordDocument implements IWordDocument {
    /**
     * Format.
     */
    private Format format = new Format();

    /**
     * Background attribute.
     */
    private Image background = new Image("url.jpg");

    /**
     * msOfficeVersion.
     */
    private float msOfficeVersion;

    /**
     * msLicense.
     */
    private MSLicense msLicense;

    /**
     * Constructor.
     *
     * @param msLicenseNumber license.
     */
    public WordDocument(final int msLicenseNumber) {
        this.msLicense = new MSLicense(msLicenseNumber);
    }

    /**
     * get Format.
     *
     * @return Format.
     */
    public Format getFormat() {
        return this.format;
    }

    /**
     * Get background.
     *
     * @return Image.
     */
    public Image getBackground() {
        return this.background;
    }

    /**
     * Get MsOffice version.
     *
     * @return float with version.
     */
    public float getMsOfficeVersion() {
        return msOfficeVersion;
    }

    /**
     * Set MsOffice version.
     *
     * @param msOfficeVersion version.
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        this.msOfficeVersion = msOfficeVersion;
    }

    /**
     * Get license.
     *
     * @return MSLicense.
     */
    public MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     * Restrict if license is invalid.
     *
     * @return boolean.
     */
    public boolean restrictEditIfLicenseIsInvalid() {
        return !this.msLicense.isValid();
    }
}
