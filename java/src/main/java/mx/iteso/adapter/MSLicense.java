package mx.iteso.adapter;
/** MSLicense class. */
public class MSLicense {
    /**Supported string. */
    private String supported;
    /**Current version. */
    private float version;
    /**older version. */
    private static final float OLDER = 12.0f;
    /**newer version. */
    private static final float NEWER = 16.0f;
    /**Constructor.
     * @param nVersion version.
     */
    public MSLicense(final float nVersion) {
        this.version = nVersion;
        if (nVersion <= OLDER) {
            supported = "Old version, no support";
        } else if (nVersion > OLDER && nVersion <= NEWER) {
            supported = "Older version, still supported";
        } else if (nVersion > NEWER) {
            supported = "Current stable version";
        } else {
            supported = "Invalid License";
        }
    }
    /**
     * @return version.
     */
    public float getVersion() {
        return this.version;
    }
    /**
     * @return supported string.
     */
    public String isSupported() {
        return this.supported;
    }
}
