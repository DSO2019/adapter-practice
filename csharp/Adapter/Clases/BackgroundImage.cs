namespace Adapter.Clases{
    public class BackgroundImage {
        private readonly Image _image;

        public BackgroundImage(Image img) {
            _image = img;
        }

        public Image GetImage() {
            return _image;
        }
    }
}
