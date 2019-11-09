package mx.iteso.adapter;
import mx.iteso.adapter.IWordDocument;

public class WordDoc implements IWordDocument{
    private Format format;
    private Image img;
    private MSLicense license;
    private double version;


    public WordDoc(int lscNumber){
        this.format = new Format();
        this.img = new Image("img.png");
        this.license = new MSLicense(lscNumber);
        this.version = 1.1;
    }

    public Format getFormat(){
        return this.format;
    }
    public Image getBackground(){
        return this.img;
    }
    public void setMSOfficeVersion(float msOfficeVersion){
        this.version = msOfficeVersion;
    }
    public MSLicense getLicense(){
        return this.license;
    }
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense){
        if(msLicense.getNumber() > 10000){
            return false;
        }
        return true;
    }
}