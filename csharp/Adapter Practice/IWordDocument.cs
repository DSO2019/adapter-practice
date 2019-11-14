namespace adapter_practice
{
    public interface IWordDocument {

        Format GetFormat();

        Image GetBackground();

        void SetMsOfficeVersion(float msOfficeVersion);

        MsLicense GetLicense();

        bool RestrictEditIfLicenseIsInvalid(MsLicense msLicense);

    }
}