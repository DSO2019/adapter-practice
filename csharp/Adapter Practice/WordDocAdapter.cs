namespace adapter_practice
{
    public class WordDocAdapter : IGoogleDoc {

        private readonly WordDocument _word;

        private readonly MsLicense _ms = new MsLicense("MS License");

        private readonly Format _format;

        private readonly Font _font;

        private readonly string _style;

        public WordDocAdapter(WordDocument word) {
            _word = word;
            _font = new Font("Arial");
            _style = "bold";
            _format = new Format(_font, _style);
        }

        public Font GetFont() {
            return _font;
        }

        public object GetStyle() {
            return _style;
        }

        public object GetFormat() {
            return _format;
        }

        public BackgroundImage GetBackground() {
            return new BackgroundImage(_word.GetBackground());
        }

        public void SetSharingPermissions(int sharingPermissions) {
            _word.SetMsOfficeVersion(sharingPermissions);
            _word.GetLicense();
            _word.RestrictEditIfLicenseIsInvalid(_ms);
        }

    }
}