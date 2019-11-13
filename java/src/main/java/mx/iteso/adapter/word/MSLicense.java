package mx.iteso.adapter.word;

/**
 * MSLicense Class.
 */
public class MSLicense {
    /**
     * Attr license version.
     */
    private double licenseVersion;
    /**
     * Public constructor.
     * @param version license's version.
     **/
    public MSLicense(final double version) {
        this.licenseVersion = version;
    }
    /**
     * License's version getter.
     * @return license's version.
     */
    public double getLicenseVersion() {
        return this.licenseVersion;
    }
}
