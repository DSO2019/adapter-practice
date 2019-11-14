namespace adapter_practice
{
    public class Font {
        private readonly string _font;

        public Font(string fnt) {
            _font = fnt;
        }

        public string GetFont() {
            return _font;
        }
    }
}