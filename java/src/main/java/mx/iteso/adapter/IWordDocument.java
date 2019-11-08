package mx.iteso.adapter;

import mx.iteso.utils.Format;
import mx.iteso.utils.Image;
import mx.iteso.utils.MSLicense;

/** IWord Document interface. */
public interface IWordDocument {
    /** Format method.
     * @return Format.
     */
    Format getFormat();

    /** Get background.
     * @return background.
     */
    Image getBackground();

    /** Set Office version.
     * @param msOfficeVersion office version.
     */
    void setMSOfficeVersion(float msOfficeVersion);

    /** Get license method.
     * @return license.
     */
    MSLicense getLicense();

    /** Is invalid.
     * @return is invalid.
     */
    boolean restrictEditIfLicenseIsInvalid();
}
