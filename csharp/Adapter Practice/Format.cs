namespace adapter_practice
{
    public class Format {

        private Font _font;

        private readonly string _style;

        public Format(Font fnt, string stl) {
            _font = fnt;
            _style = stl;
        }

        public Format(Font fnt)
        {
            _font = fnt;
        }

        public string GetFont() {
            return _font.GetFont();
        }

        
        public Font ReturnFont() {
            return _font;
        }

        
        public void SetFont(Font fnt) {
            _font = fnt;
        }

        
        public string GetStyle() {
            return _style;
        }
    }
}