package mx.iteso;

import mx.iteso.interfaces.IWordDocument;
import mx.iteso.beans.Format;
import mx.iteso.beans.Image;
import mx.iteso.beans.MSLicense;

/** Word Document class. */
public class WordDocument implements IWordDocument {
    /** Document format. */
    private Format format;
    /** Background image. */
    private Image background;
    /** Version. */
    private float msOfficeVersion;
    /** MSLicense. */
    private MSLicense license;

    /** Constructor.
     * @param licenseNum license number.
    */
    public WordDocument(final int licenseNum) {
        this.license = new MSLicense(licenseNum);
        this.format = new Format();
        this.background = new Image("image.png");
    }

    /**
     * Format getter.
     * @return the current format.
     */
    public Format getFormat() {
        return this.format;
    }

    /**
     * Format setter.
     * @param selectedFormat current Format.
     */
    public void setFormat(final Format selectedFormat) {
        this.format = selectedFormat;
    }

    /**
     * Background image getter.
     * @return the current background.
     */
    public Image getBackground() {
        return this.background;
    }

    /**
     * Background image setter.
     * @param img the current Image.
     */
    public void setBackground(final Image img) {
        this.background = img;
    }

    /**
     * MSOffice version getter.
     * @return msOfficeVersion.
     */
    public float getMSOfficeVersion() {
        return this.msOfficeVersion;
    }

    /**
     * MSOffice version setter.
     * @param newMsOfficeVersion the version.
     */
    public void setMSOfficeVersion(final float newMsOfficeVersion) {
        this.msOfficeVersion = newMsOfficeVersion;
    }

    /**
     * License getter.
     * @return the current MsLicense.
     */
    public MSLicense getLicense() {
        return this.license;
    }

    /**
     * License setter.
     * @param lic the current MsLicense.
     */
    public void setLicense(final MSLicense lic) {
        this.license = lic;
    }

    /**
     * Restrict edit evaluation.
     * @param msLicense the current license.
     * @return if permission should be restricted.
     */
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        return !this.license.isValid();
    }
}
