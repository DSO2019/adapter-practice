package mx.iteso.adapter;

/**
 * Creado por Lucifer.
 */
public interface IGoogleDoc {

    /**
     * @return Font.
     */
    Font getFont();

    /**
     * @return Style.
     */
    Object getStyle();

    /**
     * @return background.
     */
    BackgroundImage getBackground();

    /**
     *
     * @param sharingPermissions sharing permissions.
     */
    void setSharingPermissions(int sharingPermissions);
}

