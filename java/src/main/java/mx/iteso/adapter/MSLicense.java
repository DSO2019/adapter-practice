package mx.iteso.adapter;

/**
 * Microsoft Licence.
 */
public class MSLicense {
    /**
     * Evitar numeros magicos.
     */
    private int licenceNumber;
    /**
     * Numero de licencia falsa.
     */
    private final int falseNumber = 100;

    /**
     * Iniciar Licencia.
     * @param num a iniciar
     */
    public MSLicense(final int num) {
        this.licenceNumber = num;
    }

    /**
     * Getter para licencia de numero.
     * @return licencia.
     */
    public int getLicenceNumber() {
        return licenceNumber;
    }

    /**
     * Setter para licencia de numero.
     * @param number a poner.
     */
    public void setLicenceNumber(final int number) {
        this.licenceNumber = number;
    }

    /**
     * Para ver la licencia si es valida o no.
     * @param msLicense licencia.
     * @return true or false.
     */
    public boolean invalidLicence(final MSLicense msLicense) {
        return msLicense.getLicenceNumber() < falseNumber;
    }
}
