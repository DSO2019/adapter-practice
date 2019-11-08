import mx.iteso.adapter.BackgroundImg;
import mx.iteso.adapter.Font;

/**
 * Interface GoogleDoc.
 */
public interface IGoogleDoc {
    /**
     * @return getFont.
     */
    Font getFont();
    /**
     * @return getStyle.
     */
    Object getStyle();
    /**
     * @return background.
     */
    BackgroundImg getBackground();
    /**
     *
     * @param sharingPermissions sharing permissions.
     */
    void setSharingPermissions(int sharingPermissions);
}


