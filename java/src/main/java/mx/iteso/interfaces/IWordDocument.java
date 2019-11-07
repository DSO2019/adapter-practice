package mx.iteso.interfaces;

import mx.iteso.beans.Format;
import mx.iteso.beans.Image;
import mx.iteso.beans.MSLicense;

/** Word Document Interface. */
public interface IWordDocument {
    /**
     * Format getter.
     * @return the current format.
     */
    Format getFormat();

    /**
     * Background image getter.
     * @return the current background.
     */
    Image getBackground();

    /**
     * MSOffice version setter.
     * @param msOfficeVersion the current format.
     */
    void setMSOfficeVersion(float msOfficeVersion);

    /**
     * License getter.
     * @return the current MsLicense.
     */
    MSLicense getLicense();

    /**
     * Restrict edit evaluation.
     * @param msLicense the license to be evaluated.
     * @return if permission should be restricted.
     */
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
