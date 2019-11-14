

namespace adapter_practice
{
    public class GoogleDocAdapter:IWordDocument
    {
    
    private readonly IGoogleDoc _googleDoc;
   
    private readonly MsLicense _msLicense;
   
    private float _msVersion;
    
    public GoogleDocAdapter(IGoogleDoc googledoc)
    {
        this._googleDoc = googledoc;
        this._msLicense = new MsLicense("Google license");
    }
    public Format GetFormat()
    {
        return new Format(_googleDoc.GetFont());
    }
    public Img GetBackground()
    {
        BackgroundImg backgroundImage = _googleDoc.GetBackground();
        return new Img(backgroundImage.GetImage().GetUrl());
    }
    public void SetMOfficeVersion(float msOfficeVersion)
    {
        this._msVersion = msOfficeVersion;
    }
    public  float GetMsOfficeVersion()
    {
        return this._msVersion;
    }
    public MsLicense GetLicense()
    {
        return this._msLicense;
    }
    public bool RestrictEditIfLicenseIsInvalid(MsLicense ms)
    {
        return this._msLicense.GetLicense() == ms.GetLicense();
    }

    }
}
