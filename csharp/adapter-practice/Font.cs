using System;



namespace adapter_practice
{
    public class Font
    {
        private readonly String _font;
       
        public Font(String f)
        {
            this._font = f;
        }
        public String GetFont()
        {
            return this._font;
        }
    }
}
