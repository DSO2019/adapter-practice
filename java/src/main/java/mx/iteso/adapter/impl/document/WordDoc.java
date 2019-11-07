package mx.iteso.adapter.impl.document;

import mx.iteso.adapter.impl.other.Image;

import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.other.MSLicense;

public class WordDoc implements IWordDocument {
    Object format;
    Image background;
    MSLicense license;
    boolean edit;

    public WordDoc(){
        format = new Object();
        license = new MSLicense();
        edit = false;
    }

    public Object getFormat() {
        System.out.println("Word document format is .exe");
        return format;
    }

    public Image getBackground() {
        System.out.println("Returning background from Word");
        return background;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {
        System.out.println("New office version is " + msOfficeVersion);
    }

    public MSLicense getLicense() {
        System.out.println("Getting the license of MSWord");
        return license;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return msLicense.isValid();
    }

}