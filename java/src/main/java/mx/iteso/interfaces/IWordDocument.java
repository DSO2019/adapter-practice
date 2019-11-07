package mx.iteso.interfaces;

import mx.iteso.beans.Format;
import mx.iteso.beans.Image;
import mx.iteso.beans.MSLicense;

public interface IWordDocument {
    public Format getFormat();
    public Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
