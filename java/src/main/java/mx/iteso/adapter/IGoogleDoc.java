package mx.iteso.adapter;

/** Google Doc Interface.*/
public interface IGoogleDoc {

    /** @return Get Format.*/
    Font getFont();

    /** @return Get Style.*/
    Object getStyle();

    /** @return Get Background.*/
    BackgroundImage getBackground();

    /** @param sharingPermissions .*/
    void setSharingPermissions(int sharingPermissions);
}
