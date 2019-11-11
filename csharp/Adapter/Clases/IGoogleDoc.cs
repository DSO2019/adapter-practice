namespace Adapter.Clases
{
    public interface IGoogleDoc {

        Font GetFont();

        object GetStyle();

        BackgroundImage GetBackground();

        void SetSharingPermissions(int sharingPermissions);
    }
}