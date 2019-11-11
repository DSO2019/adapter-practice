namespace Adapter.Clases
{
    public interface IWordDocument {

        object GetFormat();

        Image GetBackground();

        void SetMsOfficeVersion(float msOfficeVersion);

        MsLicense GetLicense();

        bool RestrictEditIfLicenseIsInvalid(MsLicense msLicense);

    }
}