package mx.iteso.adapter;

import java.awt.*;

public class WordDocument implements IWordDocument {

    public Object getFormat() {
        return null;
    }

    public Image getBackground() {
        return null;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {

    }

    public MSLicense getLicense() {
        return null;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return false;
    }
}
