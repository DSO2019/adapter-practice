package mx.iteso.adapter;
/**Word document interface. */
public interface IWordDocument {
    /**get current format.
     * @return format.
    */
    Object getFormat();
    /**get current background.
     * @return background.
    */
    Image getBackground();
    /**Set MS Version.
     * @param msOfficeVersion Version.
    */
    void setMSOfficeVersion(float msOfficeVersion);
    /**get current license.
     * @return License.
    */
    MSLicense getLicense();
    /**get current format.
     * @param msLicense licence.
     * @return edit restriction.
    */
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);
}
