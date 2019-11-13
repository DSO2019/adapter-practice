package mx.iteso.adapter.word;

import mx.iteso.adapter.Format;
import mx.iteso.adapter.Image;

/**
 * IWordDocument Interface.
 */
public interface IWordDocument {
    /**
     * Format getter.
     * @return WordDocument's Format.
     */
    Format getFormat();
    /**
     * Background image getter.
     * @return WordDocument's background image.
     */
    Image getBackground();
    /**
     * MSLicense setter.
     * @param msOfficeVersion license version.
     */
    void setMSOfficeVersion(double msOfficeVersion);
    /**
     * MSLicense getter.
     * @return WordDocument's license.
     */
    MSLicense getLicense();

    /**
     * Check if license id valid.
     * @return isValid.
     */
    boolean restrictEditIfLicenseIsInvalid();
}
