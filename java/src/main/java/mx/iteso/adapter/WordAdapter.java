package mx.iteso.adapter;

import java.awt.Font;

import mx.iteso.WordDocument;
import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;
import mx.iteso.utils.MSLicense;

public class WordAdapter implements IGoogleDoc {

    IWordDocument wordDocument;

    public WordAdapter(WordDocument wordDoc) {
        this.wordDocument = wordDoc;
	}

	public Font getFont() {
        return this.wordDocument.getFormat().getFont();
    }

    public Format getStyle() {
        return this.wordDocument.getFormat();
    }

    public BackgroundImage getBackground() {
        return new BackgroundImage(this.wordDocument.getBackground());
    }

    public void setSharingPermissions(final int sharingPermissions) {
        return;
    }

    public int getSharingPermissions() {
        final MSLicense license = this.wordDocument.getLicense();
        return this.wordDocument.restrictEditIfLicenseIsInvalid(license) ? 0 : 1;
    }
}