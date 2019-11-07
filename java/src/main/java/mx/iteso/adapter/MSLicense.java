package mx.iteso.adapter;
/** MSLicense class. */
public class MSLicense {
    /**Supported string. */
    String supported;
    /**Current version. */
    float version;
    /**Constructor.
     * @param nVersion version.
     */
    public MSLicense(float nVersion){
        this.version = nVersion;
        if(nVersion <= 12.0) {
            supported = "Old version, no support";
        } else if (nVersion > 12.0 && nVersion <= 16.0){
            supported = "Older version, still supported";
        } else if (nVersion > 16.0) {
            supported = "Current stable version";
        } else {
            supported = "Invalid License";
        }
    }
    /**
     * @return version.
     */
    public float getVersion(){
        return this.version;
    }
    /**
     * @return supported string.
     */
    public String isSupported(){
        return this.supported;
    }
}
