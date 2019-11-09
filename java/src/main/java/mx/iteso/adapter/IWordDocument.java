package mx.iteso.adapter;

import java.awt.*;
import mx.iteso.adapter.Image;
import mx.iteso.adapter.Format;

public interface IWordDocument {
    public Format getFormat();
    public Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
