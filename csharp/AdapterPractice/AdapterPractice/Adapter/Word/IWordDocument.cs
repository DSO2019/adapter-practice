using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter.Word
{
    public interface IWordDocument
    {

        Format getFormat();


        Image getBackground();

        void setMSOfficeVersion(float msOfficeVersion);

        MSLicense getLicense();

        bool restrictEditIfLicenseIsInvalid();

    }
}
