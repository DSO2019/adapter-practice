package mx.iteso.adapter.impl.adapter;

import mx.iteso.adapter.impl.other.Image;

import mx.iteso.adapter.impl.other.MSLicense;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.ints.IGoogleDoc;


public class DocsAdapter implements IWordDocument {
    IGoogleDoc doc;

    public DocsAdapter(IGoogleDoc doc1){
        this.doc = doc1;
    }
    
    
    public Object getFormat() {
        return this.doc.getStyle();
    }

   
    public Image getBackground() {
        Object background = this.doc.getBackground();
        return null;
    }

   
    public void setMSOfficeVersion(float msOfficeVersion) {
        this.doc.setSharingPermissions((int) msOfficeVersion);
    }

 
    public MSLicense getLicense() {
        System.out.println("Google docs is free for Google Users.");
        return null;
    }


    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        System.out.println("You must have a google account to edit.");
        return false;
    }
    
}