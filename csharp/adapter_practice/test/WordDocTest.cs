using adapter_practice.main.document;
using adapter_practice.main.other;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.test
{
    [TestFixture]
    class WordDocTest
    {
        /**
     * Word document.
     */
        private WordDoc wd;
        /**
         * Set up method.
         */
        [SetUp]
    public void SetUp()
        {
            wd = new WordDoc();
        }
        /**
         * Format test.
         */
        [TestCase]
    public void formatTest()
        {
            Object format = new Object();
            Assert.AreEqual(true, format.Equals(wd.getFormat()));
        }
        /**
         * Background test.
         */
        [TestCase]
        public void backgroundTest()
        {
            Image background = new Image();
            Assert.AreEqual(true, background.Equals(wd.getBackground()));
        }
        /**
         * Set office version test.
         */
        [TestCase]
        public void setVersionTest()
        {
            float officeVersion = 10;
            Assert.AreEqual("New office version is 10", wd.setMSOfficeVersion(officeVersion));
        }
        /**
         * Get license test.
         */
        [TestCase]
        public void getLicenseTest()
        {
            MSLicense license = new MSLicense();
            Assert.AreEqual(true, license.Equals(wd.getLicense()));
        }
        /**
         * restrict Edit test.
         */
        [TestCase]
        public void restrictTest()
        {
            MSLicense license = new MSLicense();
            Assert.AreEqual(true, wd.restrictEditIfLicenseIsInvalid(license));
        }
    }
}
