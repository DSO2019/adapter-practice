namespace adapter_practice
{
    public class GoogleDoc: IGoogleDoc {

        private int _sharingPermissions;

        private readonly Font _font;

        private readonly Format _style;

        private readonly BackgroundImage _backgroundImage;

        public GoogleDoc() {
            _font = new Font("Arial");
            _backgroundImage = new BackgroundImage(new Image("imgUrl"));
            _style = new Format(_font, "Regular");
            _sharingPermissions = 1;
        }

        public Font GetFont() {
            return _font;
        }

        public object GetStyle() {
            return _style;
        }

        public BackgroundImage GetBackground() {
            return _backgroundImage;
        }

        public int GetSharingPermissions() {
            return _sharingPermissions;
        }

        public void SetSharingPermissions(int permissions) {
            _sharingPermissions = permissions;
        }
    }
}