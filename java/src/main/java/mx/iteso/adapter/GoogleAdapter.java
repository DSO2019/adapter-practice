package mx.iteso.adapter;

import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.IGoogleDoc;

public class GoogleAdapter implements IWordDocument {
    IGoogleDoc googledoc;

    public GoogleAdapter(IGoogleDoc google){
        this.googledoc = google;
    }

    public Object getFormat(){
        this.googledoc.getStyle();
    }

    
    public Image getBackground(){
        this.googledoc.getBackground();
    }

    @Override
    public void setMSOfficeVersion(float msOfficeVersion){
        return;
    }
    public MSLicense getLicense(){
        return new MSLicense();

    }
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense){
        return !msLicense.isValid();
    }

}