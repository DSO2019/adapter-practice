package mx.iteso.adapter.impl;

import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.MSLicense;

import java.awt.*;

public class IWordDocumentCreate implements IWordDocument {

    public Object getFormat() {
        return ("get object format");
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
