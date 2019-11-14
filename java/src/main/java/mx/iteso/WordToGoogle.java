package mx.iteso;

import java.awt.Font;

import mx.iteso.interfaces.IGoogleDoc;
import mx.iteso.interfaces.IWordDocument;

/**
 * WordDoc to GoogleDoc.
 */
public class WordToGoogle implements IGoogleDoc {

    /**
     * WordDoc.
     */
    private IWordDocument wordDocument;

    /**
     * WordToGoogle.
     * @param wordDocToTransform google doc.
     */
    public WordToGoogle(final IWordDocument wordDocToTransform) {
        this.wordDocument = wordDocToTransform;
    }

    /**
     * getFont().
     * @return font.
     */
    public Font getFont() {
        return wordDocument.getFormat().getFont();
    }

    /**
     * getStyle().
     * @return Format.
     */
    public Format getStyle() {
        return wordDocument.getFormat();
    }

    /**
     * getBackground().
     * @return Background.
     */
    public BackgrdImage getBackground() {
        return new BackgrdImage(wordDocument.getBackground());
    }

    /**
     * setPermissions().
     * @param sharingPermission permission id.
     */
    public void setLicensePermissions(final int sharingPermission) {
        return;
    }

    /**
     * getPermissions().
     * @return permission id.
     */
    public int getLicensePermissions() {
        final MSLicense MSLicense = wordDocument.getMSLicense();
        if (wordDocument.restricInvalidLicense(MSLicense)) {
            return 0;
        } else {
            return 1;
        }
    }
}
