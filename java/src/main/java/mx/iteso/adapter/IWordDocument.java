package mx.iteso.adapter;

import mx.iteso.adapter.media.Format;
import mx.iteso.adapter.media.Image;

public interface IWordDocument {
    public int sharingPermision = 0;
    public Format getFormat();
    public void setFormat(Format format);
    public Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
