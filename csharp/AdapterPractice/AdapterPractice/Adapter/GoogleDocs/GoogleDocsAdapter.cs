using System;
using System.Collections.Generic;
using System.Text;
using AdapterPractice.Adapter.Word;

namespace AdapterPractice.Adapter.GoogleDocs
{
    public class GoogleDocsAdapter : IWordDocument
    {

    public IGoogleDoc googleDoc;

    public GoogleDocsAdapter(GoogleDoc newGoogleDoc)
    {
        this.googleDoc = newGoogleDoc;
    }

    public Format getFormat()
    {
        return this.googleDoc.getStyle();
    }

    public Image getBackground()
    {
        return this.googleDoc.getBackground().getImage();
    }

    public void setMSOfficeVersion(float msOfficeVersion)
    {
        return;
    }

    public MSLicense getLicense()
    {
        return this.googleDoc.getSharingPermissions() == 1
            ? new MSLicense(1) : new MSLicense(0);
    }

    public bool restrictEditIfLicenseIsInvalid()
    {
        return !this.getLicense().isValid();
    }
    }
}
