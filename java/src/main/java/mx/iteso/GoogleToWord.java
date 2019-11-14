package mx.iteso;

import java.awt.Font;

import mx.iteso.interfaces.IGoogleDoc;
import mx.iteso.interfaces.IWordDocument;

/**
 * Convert GoogleDoc to WordDoc.
 */
public class GoogleToWord implements IWordDocument {


    /**
     * @param googleDocToTransform .
     */
    public GoogleToWord(final IGoogleDoc googleDocToTransform) {
        this.googleDoc = googleDocToTransform;
    }


    /**
     * getLicense.
     * @return MSLicense.
     */
    public MSLicense getMSLicense() {
        final int requestedValue = 2000;
        final int invalidNumber = 1;
        if (googleDoc.getLicensePermissions() == 1) {
            return new MSLicense(requestedValue);
        } else {
            return new MSLicense(invalidNumber);
        }
    }

    /**
     * restrictEditIfLicenseIsInvalid.
     * @param MSLicense license.
     * @return invalid Permision.
     */
    public boolean restricInvalidLicense(final MSLicense MSLicense) {
        return !MSLicense.isValid();
    }



    /**
     * setMSOfficeVersion.
     * @param msOfficeLicense the version.
     */
    public void setMSOffice(final float msOfficeLicense) {
        return;
    }

    /**
     * GoogleDoc to convert
     */
    private IGoogleDoc googleDoc;


    /**
     * getFont().
     * @return Font.
     */
    public Font getFont() {
        return googleDoc.getFont();
    }

    /**
     * getFormat().
     * @return format.
     */
    public Format getFormat() {
        return (Format) googleDoc.getStyle();
    }

    /**
     * getBackground.
     * @return background.
     */
    public Image getBackground() {
        return googleDoc.getBackground().getImage();
    }



}
