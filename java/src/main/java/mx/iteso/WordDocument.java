package mx.iteso;

import mx.iteso.interfaces.IWordDocument;

/**
 * WordDoc.
 */
public class WordDocument implements IWordDocument {
    /**
     * format.
     */
    private Format format;
    /**
     * image.
     */
    private Image background;
    /**
     * msOfficeVersion.
     */
    private float msOfficeVersion;
    /**
     * MSLicense.
     */
    private MSLicense MSLicense;

    /**
     * Constructor.
     * @param licenseNum license number.
     */
    public WordDocument(final int licenseNum) {
        this.MSLicense = new MSLicense(licenseNum);
        this.format = new Format();
        this.background = new Image("image.png");
    }

    /**
     * MSOffice version setter.
     * @param newMsOfficeVersion the version.
     */
    public void setMSOffice(final float newMsOfficeVersion) {
        this.msOfficeVersion = newMsOfficeVersion;
    }

    /**
     * getLicense().
     * @return the current MsLicense.
     */
    public MSLicense getMSLicense() {
        return this.MSLicense;
    }

    /**
     * setLicense()
     * @param lic the current MsLicense.
     */
    public void setMSLicense(final MSLicense lic) {
        this.MSLicense = lic;
    }

    /**
     * Restrict edit evaluation.
     * @param MSLicense the current license.
     * @return if permission should be restricted.
     */
    public boolean restricInvalidLicense(final MSLicense MSLicense) {
        return !this.MSLicense.isValid();
    }


    /**
     * getFormat().
     * @return the current format.
     */
    public Format getFormat() {
        return this.format;
    }

    /**
     * setFormat().
     * @param selectedFormat current Format.
     */
    public void setFormat(final Format selectedFormat) {
        this.format = selectedFormat;
    }

    /**
     * getBackground().
     * @return the current background.
     */
    public Image getBackground() {
        return this.background;
    }

    /**
     * setBackground().
     * @param img the current Image.
     */
    public void setBackground(final Image img) {
        this.background = img;
    }

    /**
     *getMSOfficeVersion().
     * @return msOfficeVersion.
     */
    public float getMSOffice() {
        return this.msOfficeVersion;
    }


}
