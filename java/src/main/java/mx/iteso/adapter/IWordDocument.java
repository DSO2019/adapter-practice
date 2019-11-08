package mx.iteso.adapter;

/** Word Interface.*/
public interface IWordDocument {

    /** @return Format.*/
    Object getFormat();

    /** @return Background.*/
    Image getBackground();

    /** @param msOfficeVersion .*/
    void setMSOfficeVersion(float msOfficeVersion);

    /** @return License.*/
    MSLicense getLicense();

    /** @return license
     * @param msLicense
     *  .*/
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
