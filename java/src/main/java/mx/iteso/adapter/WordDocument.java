package mx.iteso.adapter;
/**
 * Class WordDocument.
 */
public class WordDocument implements IWordDocument {
    /**
     * Font.
     */
    private Font font;
    /**
     * BackgroundImg.
     */
    private BackgroundImg backgroundImage;
    /**
     * msLicense.
     */
    private MSLicense msLicense;
    /**
     * version.
     */
    private float version;
    /**
     * Format.
     */
    private Format format;
    /**
     * Constructor wordDocument.
     */
    public WordDocument() {
        this.font = new Font("Verdana");
        this.msLicense = new MSLicense("MS License");
        this.format = new Format(this.font, "style");
        this.backgroundImage = new BackgroundImg(new Img("SoyUnaUrl"));
    }
    /**
     * @return getFormat.
     */
    public final Format getFormat() {
        return this.format;
    }
    /**
     * @return backgroundImg.
     */
    public final Img getBackground() {
        return this.backgroundImage.getImage();
    }
    /**
     * @param msOfficeVersion msOfficeVersion.
     */
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        this.version = msOfficeVersion;
    }
    /**
     * @return getLicense.
     */
    public final MSLicense getLicense() {
        return this.msLicense;
    }
    /**
     * @param mslicense msLicense.
     * @return license.
     */
    public final boolean restrictEditIfLicenseIsInvalid(
            final MSLicense mslicense) {
        return this.msLicense == mslicense;
    }
}
