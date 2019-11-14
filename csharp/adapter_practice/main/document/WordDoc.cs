using adapter_practice.main.ints;
using adapter_practice.main.other;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main.document
{
    public class WordDoc : IWordDocument
    {
        /**
         * Format.
         */
        private Object format;
        /**
         * Background.
         */
        private Image background;
        /**
         * License.
         */
        private MSLicense license;
        /**
         * Edit.
         */
        private bool edit;
        /**
         * Constructor.
         */
        public WordDoc()
        {
            format = new Object();
            license = new MSLicense();
            edit = false;
        }
        /**
         * @return object format.
         */
        /**
         * @return object format.
         */
        public Object getFormat()
        {
            Console.WriteLine("Word document format is .exe");
            return format;
        }
        /**
         * @return image of background.
         */
        public Image getBackground()
        {
            Console.WriteLine("Returning background from Word");
            return background;
        }
        /**
         * @param msOfficeVersion office version.
         */
        public void setMSOfficeVersion(float msOfficeVersion)
        {
            Console.WriteLine("New office version is " + msOfficeVersion);
        }
        /**
         * @return MSLicense.
         */
        public MSLicense getLicense()
        {
            Console.WriteLine("Getting the license of MSWord");
            return license;
        }
        /**
         * @return boolean of validation.
         * @param msLicense msLicense.
         */
        public bool restrictEditIfLicenseIsInvalid(MSLicense msLicense)
        {
            return msLicense.isValid();
        }
    }
}
