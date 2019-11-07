package mx.iteso.adapter;

public class WordDocument implements IWordDocument {
    private float msOfficeVersion;
    private MSLicense msLicense;
    private Image image;
    public WordDocument(){
        this.image = new Image("image", 1024.0f, 720.0f);
    }

    public Object getFormat() {
        return null;
    }

    public Image getBackground() {
        return this.image;
    }

    public void setMSOfficeVersion(float msOfficeVersion_) {
        this.msOfficeVersion = msOfficeVersion_;
        msLicense = new MSLicense(this.msOfficeVersion);

    }

    public MSLicense getLicense() {
        return msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return msLicense.isSupported() == "Current stable version"
        || msLicense.isSupported() == "Older version, still supported"; 
    }
    
}