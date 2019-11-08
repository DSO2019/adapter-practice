package mx.iteso.adapter;

/**
 * Clase.
 */
import mx.iteso.utils.Image;

/**
 * interface.
 */
public interface IWordDocument {
    /**
     *
     * @return .
     */
     Object getFormat();

    /**
     *
     * @return .
     */
     Image getBackground();

    /**
     *
     * @param msOfficeVersion .
     */
     void setMSOfficeVersion(float msOfficeVersion);

    /**
     *
     * @return .
     */
     MSLicense getLicense();

    /**
     *
     * @param msLicense .
     * @return .
     */
     boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
