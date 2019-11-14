package mx.iteso.adapter.impl.document;

import mx.iteso.adapter.impl.other.Image;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.other.MSLicense;
/**
 * Word document class.
 */
public class WordDoc implements IWordDocument {
    /**
     * Format.
     */
    private Object format;
    /**
     * Background.
     */
    private Image background;
    /**
     * License.
     */
    private MSLicense license;
    /**
     * Edit.
     */
    private boolean edit;
    /**
     * Constructor.
     */
    public WordDoc() {
        format = new Object();
        license = new MSLicense();
        edit = false;
    }
    /**
     * @return object format.
     */
    public Object getFormat() {
        System.out.println("Word document format is .exe");
        return format;
    }
    /**
     * @return image of background.
     */
    public Image getBackground() {
        System.out.println("Returning background from Word");
        return background;
    }
    /**
     * @param msOfficeVersion office version.
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        System.out.println("New office version is " + msOfficeVersion);
    }
    /**
     * @return MSLicense.
     */
    public MSLicense getLicense() {
        System.out.println("Getting the license of MSWord");
        return license;
    }
    /**
     * @return boolean of validation.
     * @param msLicense msLicense.
     */
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        return msLicense.isValid();
    }
}
