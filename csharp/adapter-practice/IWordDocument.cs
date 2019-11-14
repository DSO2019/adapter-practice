

namespace adapter_practice
{
    public interface IWordDocument
    {

        Format GetFormat();

        Img GetBackground();

        void SetMOfficeVersion(float msOfficeVersion);

        MsLicense GetLicense();
        bool RestrictEditIfLicenseIsInvalid(MsLicense msLicense);
    }

}
