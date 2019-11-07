package mx.iteso.adapter;

import java.awt.*;

import mx.iteso.interfaces.*;
import mx.iteso.beans.Format;
import mx.iteso.beans.Image;
import mx.iteso.beans.MSLicense;

public class GoogleToWord implements IWordDocument{
    IGoogleDoc googleDoc;

    public Font getFont(){
        return googleDoc.getFont();
    }
    
    public Format getFormat(){
        return (Format) googleDoc.getStyle();
    }

    public Image getBackground(){
        return googleDoc.getBackground().getImage();
    }

    public void setMSOfficeVersion(float msOfficeVersion){
        return;
    }

    public MSLicense getLicense(){
        if(googleDoc.getSharingPermissions() == 1){
            return new MSLicense(10001);
        }else{
            return new MSLicense(1);
        }
    }
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense){
        return msLicense.isValid();
    }
}

