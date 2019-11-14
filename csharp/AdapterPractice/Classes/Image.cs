namespace AdapterPractice.Classes
{
    public class Image {

        private readonly string _url;

        public Image(string url1) {
            _url = url1;
        }

        public string GetUrl() {
            return _url;
        }
    }
}