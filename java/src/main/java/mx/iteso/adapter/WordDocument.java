package mx.iteso.adapter;

/**
 * Created by Lucifer.
 */
public class WordDocument implements IWordDocument {
    /**
     * Font.
     */
    private Font font;

    /**
     * Background Image.
     */
    private BackgroundImage backgroundImage;

    /**
     * License.
     */
    private MSLicense msLicense;

    /**
     * MS Office Version.
     */
    private float version;

    /**
     * Format.
     */
    private Format format;

    /**
     * Constructor.
     */
    public WordDocument() {
        this.font = new Font("Arial");
        this.msLicense = new MSLicense("MS License");
        this.format = new Format(this.font, "Bold");
        this.backgroundImage = new BackgroundImage(new Image("imageUrl"));
    }

    /**
     * @return Format.
     */
    public final Format getFormat() {
        return this.format;
    }

    /**
     * @return Background Image.
     */
    public final Image getBackground() {
        return this.backgroundImage.getImage();
    }

    /**
     * @param msOfficeVersion MS Office Version.
     */
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        this.version = msOfficeVersion;
    }

    /**
     * @return License.
     */
    public final MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     * @param mslicense MS License.
     * @return if license is invalid.
     */
    public final boolean restrictEditIfLicenseIsInvalid(
            final MSLicense mslicense) {
        return this.msLicense == mslicense;
    }
}
