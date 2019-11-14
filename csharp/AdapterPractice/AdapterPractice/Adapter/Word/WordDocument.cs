using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter.Word
{
    public class WordDocument : IWordDocument
    {

    private MSLicense msLicense;
    private Format format;
    private Image backgroundImage;
    private float msOfficeVersion;

        public WordDocument(int license)
    {
        this.msLicense = new MSLicense(license);
    }

    
    public Format getFormat()
    {
        return this.format;
    }

   
    public Image getBackground()
    {
        return this.backgroundImage;
    }

  
    public void setMSOfficeVersion(float msOfficeVersion)
    {
        this.msLicense = new MSLicense((int)msOfficeVersion);
    }

  
    public float getMsOfficeVersion()
    {
        return msOfficeVersion;
    }

 
    public void setFormat(Format newformat)
    {
        this.format = newformat;
    }

    public MSLicense getLicense()
    {
        return this.msLicense;
    }

    public bool restrictEditIfLicenseIsInvalid()
    {
        return !this.msLicense.isValid();
    }

    }
}
