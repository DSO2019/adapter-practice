package mx.iteso.adapter;

import javafx.scene.layout.BackgroundImage;

import java.awt.Font;

/**
 * Interfaz google documents.
 */
public interface IGoogleDoc {
    /**
     * Obtener tipografia.
     * @return la fuente
     */
    public Font getFont();

    /**
     * Obtener estilo.
     * @return el estilo
     */
    public Object getStyle();

    /**
     * Obtener la imagen de fondo.
     * @return fondo.
     */
    public BackgroundImage getBackground();

    /**
     *Obtener permisos de usuario.
     * @param SharingPermissions num, si o no.
     */
    public void setSharingPermissions(int SharingPermissions);
}

