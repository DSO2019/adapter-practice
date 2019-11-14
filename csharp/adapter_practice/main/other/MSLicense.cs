using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main.other
{
    public class MSLicense
    {
        /**
         * Validation bool.
         */
        private bool validation;
        /**
         * Constructor.
         */
        public MSLicense()
        {
            validation = true;
        }
        /**
         * @return validation. Returns validation.
         */
        public bool isValid()
        {
            return validation;
        }
    }
}
