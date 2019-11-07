package mx.iteso.adapter.word;

import mx.iteso.adapter.Image;

public interface IWordDocument {
    Object getFormat();
    Image getBackground();
    void setMSOfficeVersion(float msOfficeVersion);
    MSLicense getLicense();
    boolean restrictEditIfLicenseIsInvalid();
}
