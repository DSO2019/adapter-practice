package mx.iteso.adapter;
/**
 * IWord Doc.
 */
public interface IWordDocument {
    /**
     * @return getFormat.
     */
    Object getFormat();
    /**
     * @return image.
     */
    Img getBackground();
    /**
     * @param msOfficeVersion msOfficeVersion.
     */
    void setMSOfficeVersion(float msOfficeVersion);
    /**
     * @return License.
     */
    MSLicense getLicense();
    /**
     * @param msLicense msLicense.
     * @return license.
     */
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
