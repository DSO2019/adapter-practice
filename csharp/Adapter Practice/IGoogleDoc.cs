namespace adapter_practice
{
    public interface IGoogleDoc {

        Font GetFont();

        object GetStyle();

        BackgroundImage GetBackground();

        void SetSharingPermissions(int sharingPermissions);
    }
}