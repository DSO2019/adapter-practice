package mx.iteso.adapter;

import java.awt.*;

/**
 * Implementar documento de word.
 */
public class WordDocument implements IWordDocument{
    /**
     * Object para mantener un formato.
     */
    private Object format;
    /**
     * Imagen que se convertira a bg.
     */
    private Image background;
    /**
     * Version de MS
     */
    private float msVersion;
    /**
     * Licencia de MSOffice.
     */
    private MSLicense msLicense;
    /**
     * Obtener el formato.
     *
     * @return es para font
     */
    public Object getFormat() {
        return format;
    }

    /**
     * Imagen de background.
     *
     * @return cambiarlo a BackgroundImage
     */
    public Image getBackground() {
        return background;
    }

    /**
     * Tipo de version de office.
     *
     * @param msOfficeVersion un flotante con una versión
     */
    public void setMSOfficeVersion(float msOfficeVersion) {
        this.msVersion = msOfficeVersion;
    }

    /**
     * Obtener licencia de MSLicence.
     * @return licencia.
     */
    public MSLicense getLicense() {
        return msLicense;
    }

    /**
     * Si getLicence es invalida.
     *
     * @param msLicense checar licencia.
     * @return no puede editar
     */
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return msLicense.invalidLicence(msLicense);
    }
}
