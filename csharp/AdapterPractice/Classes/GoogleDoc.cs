namespace AdapterPractice.Classes
{
    public class GoogleDoc: IGoogleDoc {

        private int _sharingPermissions;

        private readonly Font _font;

        private readonly Format _style;

        private readonly BackgroundImage _backgroundImage;

        public GoogleDoc(Font fnt, BackgroundImage backgroundImage, Format stl, int permissions) {
            _font = fnt;
            _backgroundImage = backgroundImage;
            _style = stl;
            _sharingPermissions = permissions;
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