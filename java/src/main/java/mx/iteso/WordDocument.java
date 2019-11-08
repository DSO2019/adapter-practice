package mx.iteso;

import mx.iteso.adapter.IWordDocument;
import mx.iteso.utils.MSLicense;
import mx.iteso.utils.Format;
import mx.iteso.utils.Image;

/** WordDocument class. */
public class WordDocument implements IWordDocument {
    /** Format attribute. */
    private Format format = new Format();

    /** Background attribute. */
    private Image background = new Image("someurl.jpg");

    /** Office version attribute. */
    private float msOfficeVersion;

    /** License attribute. */
    private MSLicense msLicense;

    /** Constructor.
     * @param msLicenseNumber license num.
    */
    public WordDocument(final int msLicenseNumber) {
        this.msLicense = new MSLicense(msLicenseNumber);
    }

    /** Get format method.
     * @return the format.
     */
    public Format getFormat() {
        return this.format;
    }

    /** Get background method.
     * @return background.
     */
    public Image getBackground() {
        return this.background;
    }

    /**
     * Get Office version.
     * @return the msOfficeVersion.
     */
    public float getMsOfficeVersion() {
        return msOfficeVersion;
    }

    /** Set office version method.
     * @param newMsOfficeVersion office version.
     */
    public void setMSOfficeVersion(final float newMsOfficeVersion) {
        this.msOfficeVersion = newMsOfficeVersion;
    }

    /** Get license.
     * @return license.
     */
    public MSLicense getLicense() {
        return this.msLicense;
    }

    /** license is invalid.
     * @return is invalid.
     */
    public boolean restrictEditIfLicenseIsInvalid() {
        return !this.msLicense.isValid();
    }
}
