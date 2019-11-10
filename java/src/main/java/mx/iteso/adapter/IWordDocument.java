package mx.iteso.adapter;

/**
 * The intergace of a word document.
 */
public interface IWordDocument {

    /**
     * Return the formar of the doc.
     * @return Format.
     */
    Format getFormat();

    /**
     * Return Background of the doc.
     * @return Image.
     */
    Image getBackground();

    /**
     * Set the version of Office.
     * @param msOfficeVersion verion of Office.
     */
    void setMSOfficeVersion(float msOfficeVersion);

    /**
     * Return the license.
     * @return MSLicense.
     */
    MSLicense getLicense();

    /**
     * Know if the license is invalid.
     * @param msLicense the license.
     * @return if it is or not.
     */
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
