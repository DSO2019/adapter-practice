package mx.iteso.adapter.impl.adapter;

import mx.iteso.adapter.impl.other.Image;
import mx.iteso.adapter.impl.other.MSLicense;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.ints.IGoogleDoc;

/**
 * Docs Adapter to Word Document class.
 */
public class DocsAdapter implements IWordDocument {
    /**
     * Google doc.
     */
    private IGoogleDoc doc;
    /**
     *
     * @param doc1 constructor.
     */
    public DocsAdapter(final IGoogleDoc doc1) {
        this.doc = doc1;
    }
    /**
     * @return Object of format.
     */
    public Object getFormat() {
        return this.doc.getStyle();
    }
    /**
    *@return Image of Background.
    */
    public Image getBackground() {
        Object background = this.doc.getBackground();
        return null;
    }
    /**
     * @param msOfficeVersion office version.
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        this.doc.setSharingPermissions((int) msOfficeVersion);
    }
    /**
     * @return MSLicense license;
     */
    public MSLicense getLicense() {
        System.out.println("Google docs is free for Google Users.");
        return null;
    }
    /**
     * @return boolean of edit.
     * @param msLicense mslicense.
     */
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        System.out.println("You must have a google account to edit.");
        return false;
    }
}
