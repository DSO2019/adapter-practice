using System;


namespace adapter_practice
{
    public class WordAdapter : IGoogleDoc
    {

        private readonly IWordDocument _wordDocument;

        private readonly MsLicense _ms = new MsLicense("MS License");

        private readonly Format _format;


        public WordAdapter(IWordDocument wordDoc)
        {
            this._wordDocument = wordDoc;
            Font font = new Font("Verdana");
            String style = "style";
            _format = new Format(font, style);
        }

        public Font GetFont()
        {
            return _format.ReturnFont();
        }

        public Object GetStyle()
        {
            return _format.GetStyle();
        }

        public BackgroundImg GetBackground()
        {
            return new BackgroundImg(_wordDocument.GetBackground());
        }

        public void SetSharingPermissions(int sharingPermissions)
        {
            _wordDocument.SetMOfficeVersion(sharingPermissions);
            _wordDocument.GetLicense();
            _wordDocument.RestrictEditIfLicenseIsInvalid(_ms);
        }
    }
}
