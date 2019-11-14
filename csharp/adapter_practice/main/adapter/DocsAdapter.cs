using adapter_practice.main.ints;
using adapter_practice.main.other;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main.adapter
{
    public class DocsAdapter : IWordDocument
    {
        /**
         * Google doc.
         */
        private IGoogleDoc doc;
        /**
         *
         * @param doc1 constructor.
         */
        public DocsAdapter(IGoogleDoc doc1)
        {
            this.doc = doc1;
        }
        /**
         * @return Object of format.
         */
        public Object getFormat()
        {
            return this.doc.getStyle();
        }
        /**
        *@return Image of Background.
        */
        public Image getBackground()
        {
            Object background = this.doc.getBackground();
            return null;
        }
        /**
         * @param msOfficeVersion office version.
         */
        public void setMSOfficeVersion(float msOfficeVersion)
        {
            this.doc.setSharingPermissions((int)msOfficeVersion);
        }
        /**
         * @return MSLicense license;
         */
        public MSLicense getLicense()
        {
            Console.WriteLine("Google docs is free for Google Users.");
            return null;
        }
        /**
         * @return boolean of edit.
         * @param msLicense mslicense.
         */
        public bool restrictEditIfLicenseIsInvalid(MSLicense msLicense)
        {
            Console.WriteLine("You must have a google account to edit.");
            return false;
        }
    }
}
