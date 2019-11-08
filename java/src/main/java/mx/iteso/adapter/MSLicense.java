package mx.iteso.adapter;

/**
 * MS License.
 */
public class MSLicense {
    /**
     * License.
     */
    private String license;

    /**
     * @param lic License
     */
    public MSLicense(final String lic) {
        this.license = lic;
    }

    /**
     * @return License.
     */
    public final String getLicense() {
        return this.license;
    }
}
