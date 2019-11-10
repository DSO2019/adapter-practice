package mx.iteso.adapter;

/**
 * A word document.
 */
public class WordDoc implements IWordDocument {
    /**
     * The format of the document.
     */
    private Format format;

    /**
     * The image of the document.
     */
    private Image img;

    /**
     * The license of microsoft.
     */
    private MSLicense license;

    /**
     * The version of the document.
     */
    private double version;

    /**
     * The recent version of the document.
     */
    private static final double RECENT_VERSION = 1.1;

    /**
     * The valid license number.
     */
    private static final int LICENSE_VALID_NUMBER = 10000;


    /**
     * Creator.
     * @param lscNumber the license number.
     */
    public WordDoc(final int lscNumber) {
        this.format = new Format();
        this.img = new Image("img.png");
        this.license = new MSLicense(lscNumber);
        this.version = RECENT_VERSION;
    }

    @Override
    public final Format getFormat() {
        return this.format;
    }

    @Override
    public final Image getBackground() {
        return this.img;
    }

    @Override
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        this.version = msOfficeVersion;
    }

    @Override
    public final MSLicense getLicense() {
        return this.license;
    }

    @Override
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        if (msLicense.getNumber() > LICENSE_VALID_NUMBER) {
            return false;
        }
        return true;
    }
}
