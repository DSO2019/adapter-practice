package mx.iteso.adapter;

import mx.iteso.utils.Image;

public interface IWordDocument {
    public Object getFormat();
    public Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);
}
