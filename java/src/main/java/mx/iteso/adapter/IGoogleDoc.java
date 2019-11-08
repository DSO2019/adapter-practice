package mx.iteso.adapter;


import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Font;

/**
 * intercace.
 */
public interface IGoogleDoc {
    /**
     *
     * @return .
     */
     Font getFont();

    /**
     *
     * @return .
     */
     Object getStyle();

    /**
     *
     * @return .
     */
     BackgroundImage getBackground();

    /**
     *
     * @param sharingPermissions .
     */
     void setSharingPermissions(int sharingPermissions);
}
