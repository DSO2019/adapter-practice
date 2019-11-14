namespace Adapter.Clases
{
    public class GoogleAdapter : IWordDocument {

        private readonly GoogleDoc _doc;

        private readonly MsLicense _msLicense;

        private float _msVersion;

        
        public GoogleAdapter(GoogleDoc doc1) {
            _doc = doc1;
            _msLicense = new MsLicense("Google license");
        }

        public Format GetFormat() {
            return new Format(_doc.GetFont());
        }

        public Image GetBackground() {
            var backgroundImage = _doc.GetBackground();
            return new Image(backgroundImage.GetImage().GetUrl());
        }

        public void SetMsOfficeVersion(float msOfficeVersion) {
            _msVersion = msOfficeVersion;
        }

        public float GetMsOfficeVersion() {
            return _msVersion;
        }

        public MsLicense GetLicense() {
            return _msLicense;
        }

        public bool RestrictEditIfLicenseIsInvalid(MsLicense msLic) {
            return _msLicense.GetLicense() == msLic.GetLicense();
        }
    }
}