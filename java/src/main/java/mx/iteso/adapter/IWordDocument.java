package mx.iteso.adapter;

import java.awt.Image;

/**
 * Interfaz para WordDocument.
 */
public interface IWordDocument {
    /**
     * Obtener el formato.
     * @return es para font
     */
    public Object getFormat();

    /**
     * Imagen de background.
     * @return cambiarlo a BackgroundImage
     */
    public Image getBackground();

    /**
     * Tipo de version de office.
     * @param msOfficeVersion un flotante con una versión
     */
    public void setMSOfficeVersion(float msOfficeVersion);

    /**
     * Obtener licencia de MSLicence.
     * @return licencia.
     */
    public MSLicense getLicense();

    /**
     * Si getLicence es invalida.
     * @param msLicense checar licencia.
     * @return no puede editar
     */
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
