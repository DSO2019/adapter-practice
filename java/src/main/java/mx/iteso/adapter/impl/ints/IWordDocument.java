package mx.iteso.adapter.impl.ints;

import mx.iteso.adapter.impl.other.Image;

import mx.iteso.adapter.impl.other.MSLicense;

public interface IWordDocument {
    public Object getFormat();
    public Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);
}
