package mx.iteso;

import mx.iteso.utils.Format;
import mx.iteso.utils.Image;
import mx.iteso.utils.MSLicense;

/**
 * interface IWordDocument.
 */
public interface IWordDocument {
    /**
     * get Format.
     *
     * @return Format.
     */
    Format getFormat();

    /**
     * Get Background.
     *
     * @return Image.
     */
    Image getBackground();

    /**
     * Set Office version.
     *
     * @param msOfficeVersion msOfficeVersion.
     */
    void setMSOfficeVersion(float msOfficeVersion);

    /**
     * Get license.
     *
     * @return MSLicense.
     */
    MSLicense getLicense();

    /**
     * Check if invalid.
     *
     * @return boolean.
     */
    boolean restrictEditIfLicenseIsInvalid();
}
