package mx.iteso.adapter.word;

public class MSLicense {
    private float licenseVersion;
    public MSLicense(final float version) {
        this.licenseVersion = version;
    }
    public float getLicenseVersion() {
        return this.licenseVersion;
    }
}
