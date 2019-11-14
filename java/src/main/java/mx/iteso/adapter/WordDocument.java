package mx.iteso.adapter;

/**Word document class. */
public class WordDocument implements IWordDocument {
    /**MSOfficeVersion. */
    private float msOfficeVersion;
    /**MS License. */
    private MSLicense msLicense;
    /**Image. */
    private Image image;
    /**Format. */
    private Format format;
    /**image width. */
    private static final float IMAGE_WIDTH = 1024.0f;
    /**image height. */
    private static final float IMAGE_HEIGHT = 720.0f;
    /**Constructor. */
    public WordDocument() {
        this.image = new Image("image", IMAGE_WIDTH, IMAGE_HEIGHT);
        this.format = new Format("Arial", 12);
        this.msLicense = new MSLicense(16.0f);
    }
    /**
     * @return format.
    */
    public Format getFormat() {
        return this.format;
    }
    /**
     * @return background.
    */
    public Image getBackground() {
        return this.image;
    }
    /**
     * @param msOfficeVersion2 new Office version.
    */
    public void setMSOfficeVersion(final float msOfficeVersion2) {
        this.msOfficeVersion = msOfficeVersion2;
        msLicense = new MSLicense(this.msOfficeVersion);

    }
    /**
     * @return license.
    */
    public MSLicense getLicense() {
        return msLicense;
    }
    /**
     * @param msLicense2 license.
     * @return if license is valid or not.
    */
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense2) {
        this.msLicense = msLicense2;
        return msLicense2.isSupported() == "Current stable version"
        || msLicense2.isSupported() == "Older version, still supported";
    }
}
