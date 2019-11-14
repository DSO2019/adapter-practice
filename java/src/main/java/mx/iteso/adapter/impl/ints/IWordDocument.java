package mx.iteso.adapter.impl.ints;

import mx.iteso.adapter.impl.other.Image;
import mx.iteso.adapter.impl.other.MSLicense;
/**
 * Word document interface.
 */
public interface IWordDocument {
    /**
     * Gets format.
     * @return format.
     */
    Object getFormat();
    /**
     * Gets background.
     * @return image of background.
     */
    Image getBackground();
    /**
     * Sets office version to a float.
     * @param msOfficeVersion office version.
     */
    void setMSOfficeVersion(float msOfficeVersion);
    /**
     * Returns MSLicense.
     * @return MSLicense.
     */
    MSLicense getLicense();
    /**
     * @return boolean of restriction if not valid.
     * @param msLicense license.
     */
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);
}
