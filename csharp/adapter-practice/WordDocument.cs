
namespace adapter_practice
{
    public class WordDocument : IWordDocument
    {


        private readonly BackgroundImg _backgroundImage;

        private readonly MsLicense _msLicense;

        private float _version;

        private readonly Format _format;

        public WordDocument()
        {
            Font font = new Font("Verdana");
            this._msLicense = new MsLicense("MS License");
            this._format = new Format(font, "style");
            this._backgroundImage = new BackgroundImg(new Img("SoyUnaUrl"));
        }

        public Format GetFormat()
        {
            return _format;
        }

        public Img GetBackground()
        {
            return this._backgroundImage.GetImage();
        }

        public void SetMOfficeVersion(float msOfficeVersion)
        {
            this._version = msOfficeVersion;
        }

        public MsLicense GetLicense()
        {
            return this._msLicense;
        }

         public bool RestrictEditIfLicenseIsInvalid(MsLicense mslicense)
        {
            return this._msLicense == mslicense;
        }
    }
}
