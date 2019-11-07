package mx.iteso;


import mx.iteso.interfaces.IWordDocument;
import mx.iteso.beans.Format;
import mx.iteso.beans.Image;
import mx.iteso.beans.MSLicense;

public class WordDocument implements IWordDocument {
    Format format;
    Image background;
    float msOfficeVersion;
    MSLicense license;

    public WordDocument(int licenseNum) {
        this.license = new MSLicense(licenseNum);
    }

    public Format getFormat() {
        return this.format;
    }

    public void setFormat(Format selectedFormat) {
        this.format = selectedFormat;
    }

    public Image getBackground() {
        return this.background;
    }

    public void setBackground(Image img) {
        this.background = img;
    }

    public float getMSOfficeVersion() {
        return this.msOfficeVersion;
    }

    public void setMSOfficeVersion(float newMsOfficeVersion) {
        this.msOfficeVersion = newMsOfficeVersion;
    }

    public MSLicense getLicense(){
        return this.license;
    }

    public void setLicense(MSLicense lic){
        this.license = lic;
    }

    /** Returns if restriction is needed. */
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return !this.license.isValid();
    }
}