package mx.iteso.adapter.word;

import java.text.Format;
import mx.iteso.adapter.Image;

public class WordDocument implements IWordDocument{
    private MSLicense msLicense;
    private float msOfficeVersion;
    private Format format;
    protected Image BackgroundImage;

    public WordDocument(final int license){
        this.msLicense = new MSLicense(license);
        this.format = new Format();
        this.BackgroundImage = new Image("image.jpg");
    }

    public Format getFormat() {
        return this.format;
    }

    public Image getBackground() {
        return null;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {

    }

    public void setFormat(final Format newformat) {
        this.format = newformat;
    }

    public Image getBackgroundImage() {
        return this.BackgroundImage;
    }

    public void setBackgroundImage(final Image img) {
        this.BackgroundImage = this.img;
    }

    public void setMsLicense(MSLicense msLicense) {
        this.msLicense = msLicense;
    }

    public void setMsOfficeVersion(final float msOfficeVersion) {
        this.msOfficeVersion = msOfficeVersion;
    }

    public float getMsOfficeVersion() {
        return this.msOfficeVersion;
    }

    public MSLicense getLicense() {
        return this.msLicense;
    }


    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return false;
    }
}
