namespace adapter_practice
{
    public class WordDocument : IWordDocument {

        private readonly Font _font;

        private readonly BackgroundImage _backgroundImage;

        private readonly MsLicense _msLicense;

        private float _version;

        private readonly Format _format;

        public WordDocument() {
            _font = new Font("Arial");
            _msLicense = new MsLicense("MS License");
            _format = new Format(_font, "Bold");
            _backgroundImage = new BackgroundImage(new Image("imageUrl"));
        }

        public Format GetFormat() {
            return _format;
        }

        public Image GetBackground() {
            return _backgroundImage.GetImage();
        }

        public void SetMsOfficeVersion(float msOfficeVersion) {
            _version = msOfficeVersion;
        }

        public MsLicense GetLicense() {
            return _msLicense;
        }

        public Font GetFont() {
            return _font;
        }

        public float GetVersion() {
            return _version;
        }

        public bool RestrictEditIfLicenseIsInvalid(MsLicense msLic) {
            return _msLicense == msLic;
        }
    }

}