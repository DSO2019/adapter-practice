namespace AdapterPractice.Classes
{
    public class WordAdapter : IGoogleDoc {

        private readonly WordDocument _word;

        private readonly MsLicense _ms = new MsLicense("MS License");

        private readonly Format _format;

        private readonly Font _font;

        private readonly string _style;

        public WordAdapter(WordDocument word1, Font fnt, Format fmt, string stl) {
            _word = word1;
            _font = fnt;
            _format = fmt;
            _style = stl;
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