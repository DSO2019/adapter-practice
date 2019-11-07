package mx.iteso;

import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.MSLicense;
import mx.iteso.utils.Image;

public class WordDocument implements IWordDocument {
    private Object format;
    private Image background;
    private float msOfficeVersion;
    private MSLicense msLicense;

    public Object getFormat() {
        return this.format;
    }

    public Image getBackground() {
        return this.background;
    }

    public void setMSOfficeVersion(float newMsOfficeVersion) {
        this.msOfficeVersion = newMsOfficeVersion;
    }

    public MSLicense getLicense() {
        return this.msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return msLicense.isInvalid();
    }
    
}