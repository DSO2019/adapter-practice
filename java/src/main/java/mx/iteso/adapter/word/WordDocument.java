package mx.iteso.adapter.word;

import java.text.Format;
import mx.iteso.adapter.Image;

/**
 * Word Doc Class.
 */
public class WordDocument implements IWordDocument {
    /**
     * License.
     */
    private MSLicense msLicense;
    /**
     * Word Version.
     */
    /**
     * Word Format.
     */
    private Format format;
    /**
     * Background.
     */
    private Image backgroundImage;

    /**
     *
     * @param license .
     * New word doc.
     */
    public WordDocument(final int license) {
        this.msLicense = new MSLicense(license);
    }

    /**
     *
     * @return format.
     */
    public mx.iteso.adapter.Format getFormat() {
        return this.format;
    }

    /**
     *
     * @return background.
     */
    public Image getBackground() {
        return this.backgroundImage;
    }

    /**
     *
     * @param msOfficeVersion .
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        this.msLicense = new MSLicense((int) msOfficeVersion);
    }

    /**
     *
     * @return Word Version.
     */
    public float getMsOfficeVersion() {
        return this.msOfficeVersion;
    }

    /**
     *
     * @param newformat .
     */
    public void setFormat(final Format newformat) {
        this.format = newformat;
    }

    /**
     *
     * @return license.
     */
    public MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     *
     * @return if license is valid.
     */
    @Override
    public boolean restrictEditIfLicenseIsInvalid() {
        return !this.msLicense.isValid();
    }

}
