package mx.iteso.adapter.impl;
import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.MSLicense;

import java.awt.*;


public class IGoogleDocAdapter implements IWordDocument{
    IGoogleDoc googleDoc;

    public IGoogleDocAdapter(IGoogleDoc googleDoc1){
        this.googleDoc = googleDoc1;
    }


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
