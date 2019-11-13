package mx.iteso.adapter.word;


import mx.iteso.adapter.Font;
import mx.iteso.adapter.Format;
import mx.iteso.adapter.Image;

/**
 * WordDocument Class.
 */
public class WordDocument implements IWordDocument {
    /**
     * Attr type MSLicense.
     */
    private MSLicense msLicense;
    /**
     * Attr type Format.
     */
    private Format format;
    /**
     * Attr type Image.
     */
    private Image image;
    /**
     * Public constructor.
     */
    public WordDocument() {
        format = new Format(new Font("Arial",
                                     WordDocumentConstants.DEFAULT_FONT_SIZE));
        image = new Image(WordDocumentConstants.DEFAULT_BACKGROUND_WIDTH,
                          WordDocumentConstants.DEFAULT_BACKGROUND_HEIGHT);
        setMSOfficeVersion(WordDocumentConstants.DEFAULT_LICENSE_VERSION);
    }
    /**
     * Format getter.
     * @return WordDocument's Format.
     */
    public Format getFormat() {
        return format;
    }
    /**
     * Background image getter.
     * @return WordDocument's background image.
     */
    public Image getBackground() {
        return image;
    }
    /**
     * MS License setter.
     * @param msOfficeVersion license version.
     */
    public void setMSOfficeVersion(final double msOfficeVersion) {
        this.msLicense = new MSLicense(msOfficeVersion);
    }
    /**
     * MSLicense getter.
     * @return WordDocument's license.
     */
    public MSLicense getLicense() {
        return msLicense;
    }
    /**
     * Check if license is valid.
     * @return isValid
     */
    public boolean restrictEditIfLicenseIsInvalid() {
        return msLicense != null
                && msLicense.getLicenseVersion()
                < WordDocumentConstants.DEFAULT_LICENSE_VERSION_VALIDATION;
    }
}
