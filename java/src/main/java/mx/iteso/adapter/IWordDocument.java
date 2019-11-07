package mx.iteso.adapter;

import mx.iteso.utils.Format;
import mx.iteso.utils.Image;
import mx.iteso.utils.MSLicense;

public interface IWordDocument {
    public Format getFormat();
    public Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);
}
