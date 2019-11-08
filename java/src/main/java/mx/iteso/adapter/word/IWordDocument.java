package mx.iteso.adapter.word;

import mx.iteso.adapter.Image;

import java.text.Format;

public interface IWordDocument {
     Format getFormat();
     Image getBackground();
     void setMSOfficeVersion(float msOfficeVersion);
     MSLicense getLicense();
     boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
