package mx.iteso.adapter.word;

/**
 * License doc.
 */
public class MSLicense {

    /**
     * Key to license.
     */
    private int license = 0;

    /**
     *
     * @param version .
     */
    public MSLicense(final int version) {
        this.license = version;
    }

    /**
     *
     * @return license.
     */
    public  int getLicense() {
        return this.license;
    }

    /**
     *
     * @param newLicense .
     */
    public void setLicense(final int newLicense) {
        this.license = newLicense;
    }

    /**
     *
     * @return if is valid or not.
     */
    public boolean isValid() {
        return this.license > 0;
    }
}
