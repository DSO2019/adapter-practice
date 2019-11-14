using System;

namespace adapter_practice
{
    public class Format
    {
       
        private Font _font;
       
        private readonly String _style;
       
        public Format( Font fon,  String st)
        {
            this._font = fon;
            this._style = st;
        }
       
        public Format(Font fon)
        {
            this._font = fon;
        }
       
        public String GetFont()
        {
            return this._font.GetFont();
        }
        public Font ReturnFont()
        {
            return _font;
        }
        public void SetFont(Font f)
        {
            this._font = f;
        }
        public String GetStyle()
        {
            return this._style;
        }
    }
}
