package mx.iteso.adapter;
/**Word document class. */
public class WordDocument implements IWordDocument {
    /**MSOfficeVersion. */
    private float msOfficeVersion;
    /**MS License. */
    private MSLicense msLicense;
    /**Image. */
    private Image image;
    /**Constructor. */
    /**image width. */
    private static final float IMAGE_WIDTH = 1024.0f;
    /**image height. */
    private static final float IMAGE_HEIGHT = 720.0f;
    /**Constructor. */
    public WordDocument() {
        this.image = new Image("image", IMAGE_WIDTH, IMAGE_HEIGHT);
    }
    /**
     * @return null.
    */
    public Object getFormat() {
        return null;
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
        return msLicense2.isSupported() == "Current stable version"
        || msLicense2.isSupported() == "Older version, still supported";
    }
}
