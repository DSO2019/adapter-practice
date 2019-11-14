using adapter_practice.main.adapter;
using adapter_practice.main.document;
using adapter_practice.main.other;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.test
{
    [TestFixture]
    class GoogleAdapterTest
    {
        /**
    * Google document.
    */
        private GoogleDoc gd;
        /**
         * Google adapter.
         */
        private DocsAdapter ga;

        /**
         * Set up method.
         */
        [SetUp]
    public void SetUp()
        {
            gd = new GoogleDoc();
            ga = new DocsAdapter(gd);
        }
        /**
         * Format test.
         */
        [TestCase]
    public void formatTest()
        {
            Object format = new Object();
            Assert.AreEqual(true, format.Equals(ga.getFormat()));
        }
        /**
         * Background test.
         */
        [TestCase]
        public void backgroundTest()
        {
            Image background = new Image();
            Assert.AreEqual(null, background.Equals(ga.getBackground()));
        }
        /**
         * Set office version test.
         */
        [TestCase]
        public void setVersionTest()
        {
            float officeVersion = 10;
            Assert.AreEqual("New office version is 10", ga.setMSOfficeVersion(officeVersion));
        }
        /**
         * Get license test.
         */
        [TestCase]
        public void getLicenseTest()
        {
            MSLicense license = new MSLicense();
            Assert.AreEqual(null, license.Equals(ga.getLicense()));
        }
        /**
         * restrict Edit test.
         */
        [TestCase]
    public void restrictTest()
        {
            MSLicense license = new MSLicense();
            Assert.AreEqual(false, ga.restrictEditIfLicenseIsInvalid(license));
        }
    }

}
