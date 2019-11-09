package mx.iteso.adapter;

import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.GoogleDoc;

public class GoogleToWordAdapter implements IWordDocument {
    GoogleDoc googledoc;

    public GoogleToWordAdapter(GoogleDoc google){
        this.googledoc = google;
    }

    public Format getFormat(){
        return this.googledoc.getStyle();
    }

    
    public Image getBackground(){
        return this.googledoc.getBackground().getImage();
    }

    @Override
    public void setMSOfficeVersion(float msOfficeVersion){
        return;
    }
    public MSLicense getLicense(){
        if(googledoc.getSharingPermissions() == 1){
            return new MSLicense(10001);
        }
        return new MSLicense(0);

    }
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense){
        if(msLicense.getNumber() > 10000){
            return false;
        }
        return true;
    }

}