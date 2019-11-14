using adapter_practice.main.other;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main.ints
{
    public interface IWordDocument
    {
        /**
         * Gets format.
         * @return format.
         */
        Object getFormat();
        /**
         * Gets background.
         * @return image of background.
         */
        Image getBackground();
        /**
         * Sets office version to a float.
         * @param msOfficeVersion office version.
         */
        void setMSOfficeVersion(float msOfficeVersion);
        /**
         * Returns MSLicense.
         * @return MSLicense.
         */
        MSLicense getLicense();
        /**
         * @return boolean of restriction if not valid.
         * @param msLicense license.
         */
        bool restrictEditIfLicenseIsInvalid(MSLicense msLicense);
    }

}
