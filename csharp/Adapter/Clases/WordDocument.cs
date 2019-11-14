namespace Adapter.Clases
{
    public class WordDocument : IWordDocument {

        private readonly Font _font;

        private readonly BackgroundImage _backgroundImage;

        private readonly MsLicense _msLicense;

        private float _version;

        private readonly Format _format;

        public WordDocument(Font fnt, MsLicense msLic, Format fmt, BackgroundImage bckimg) {
            _font = fnt;
            _msLicense = msLic;
            _format = fmt;
            _backgroundImage = bckimg;
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