package mx.iteso.adapter;

import java.awt.Font;
/**Google doc interface. */
public interface IGoogleDoc {
    /**get current font.
     * @return font.
    */
    Font getFont();
    /**get current style.
     * @return style.
    */
    Object getStyle();
    /**get current background.
     * @return background.
    */
    BackgroundImage getBackground();
    /**get current permissions.
     * @param sharingPermissions sharing permissions.
    */
    void setSharingPermissions(int sharingPermissions);
}
