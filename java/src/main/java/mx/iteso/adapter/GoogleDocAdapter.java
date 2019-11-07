package mx.iteso.adapter;

import java.awt.*;

public class GoogleDocAdapter implements IWordDocument {

    GoogleDoc doc;

    public GoogleDocAdapter(GoogleDoc doc1){
        this.doc = doc1;
    }

	public Object getFormat() {
		return null;
	}

	public Image getBackground() {
		return null;
	}

	public void setMSOfficeVersion(float msOfficeVersion) {
		
	}

	public MSLicense getLicense() {
		return null;
	}

	public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
		return false;
	}
}
