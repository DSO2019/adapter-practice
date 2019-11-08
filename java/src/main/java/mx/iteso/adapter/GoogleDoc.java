package mx.iteso.adapter;

import javafx.scene.layout.BackgroundImage;

import java.awt.Font;

public class GoogleDoc implements IGoogleDoc {
    /**
     * Estilo de la fuente.
     */
    private Font font;
    /**
     * Estilo.
     */
    private Object style;
    /**
     * BackgroundImage.
     */
    private BackgroundImage backgroundImage;
    /**
     * Permisos, 0: sin permisos.
     * 1 : Puede editar, 2: puede ver
     */
    private int permissions;

    /**
     * Obtener tipografia.
     *
     * @return la fuente
     */
    public Font getFont() {
        return font;
    }

    /**
     * Obtener estilo.
     *
     * @return el estilo
     */
    public Object getStyle() {
        return style;
    }

    /**
     * Obtener la imagen de fondo.
     *
     * @return fondo.
     */
    public BackgroundImage getBackground() {
        return backgroundImage;
    }

    /**
     * Obtener permisos de usuario.
     * @param sharingPermissions num, si o no.
     */
    public void setSharingPermissions(final int sharingPermissions) {
        permissions = sharingPermissions;
    }
}
