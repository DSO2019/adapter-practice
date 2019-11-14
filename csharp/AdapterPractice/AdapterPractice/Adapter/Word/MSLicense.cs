using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter.Word
{
    public class MSLicense
    {

        private int license = 0;

        public MSLicense(int version)
        {
            this.license = version;
        }

        public int getLicense()
        {
            return this.license;
        }

        public void setLicense(int newLicense)
        {
            this.license = newLicense;
        }

        public bool isValid()
        {
            return this.license > 0;
        }
    }
}
