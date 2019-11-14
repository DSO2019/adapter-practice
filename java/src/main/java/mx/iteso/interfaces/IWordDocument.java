package mx.iteso.interfaces;

import mx.iteso.Format;
import mx.iteso.Image;
import mx.iteso.MSLicense;

/** Word Document Interface. */
public interface IWordDocument {
    /**
     * getFormat().
     * @return format.
     */
    Format getFormat();

    /**
     * getBackground().
     * @return background.
     */
    Image getBackground();

    /**
     * MSOffice version setter.
     * @param msOfficeVersion the current format.
     */
    void setMSOffice(float msOfficeVersion);

    /**
     * getLicense().
     * @return MsLicense.
     */
    MSLicense getMSLicense();

    /**
     * Restrict edit evaluation.
     * @param MSLicense the license to be evaluated.
     * @return if permission should be restricted.
     */
    boolean restricInvalidLicense(MSLicense MSLicense);

}
