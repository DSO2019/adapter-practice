using adapter_practice.main.adapter;
using adapter_practice.main.document;
using adapter_practice.main.ints;
using adapter_practice.main.other;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main
{
    public class TestDriveAdapters
    {
        /**
         * Magic number one.
         */
        public static int A = 452;
        /**
         * Magic number two.
         */
        public static int B = 612;
        /**
     * Main class.
     * @param args Arguments.
     */
        public static void main(String[] args)
        {
            IWordDocument wd = new WordDoc();
            IGoogleDoc gd = new GoogleDoc();

            IWordDocument convertedToWD = new DocsAdapter(gd);

            Object format;
            Image background;
            MSLicense license;
            bool edit;


            //Word Document
            format = wd.getFormat();
            background = wd.getBackground();
            license = wd.getLicense();
            edit = wd.restrictEditIfLicenseIsInvalid(license);
            wd.setMSOfficeVersion(A);
            //Converted GD to WD
            format = convertedToWD.getFormat();
            background = convertedToWD.getBackground();
            license = convertedToWD.getLicense();
            edit = convertedToWD.restrictEditIfLicenseIsInvalid(license);
            convertedToWD.setMSOfficeVersion(B);
        }
    }
}
