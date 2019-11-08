package mx.iteso.adapter;

/**
 * Creado por Lucifer.
 */
public interface IWordDocument {

    /**
     * @return format.
     */
    Object getFormat();

    /**
     * @return background image.
     */
    Image getBackground();

    /**
     * @param msOfficeVersion MS Office Version.
     */
    void setMSOfficeVersion(float msOfficeVersion);

    /**
     * @return MS License.
     */
    MSLicense getLicense();

    /**
     * @param msLicense MS License.
     * @return if license is Invalid.
     */
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
