using adapter_practice.main.other;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.test
{
    [TestFixture]
    class MSLicenseTest
    {
        private MSLicense license;
        /**
         * Set up method.
         */
        [SetUp]
        public void SetUp()
        {
            license = new MSLicense();
        }
        /**
         * Validation test.
         */
        [TestCase]
        public void validationTest()
        {
            Assert.AreEqual(true, license.isValid());
        }
    }
}
}
