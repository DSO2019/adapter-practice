using adapter_practice.main.document;
using adapter_practice.main.other;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.test
{
    [TestFixture]
    class GoogleDocTest
    {
        /**
 * Google document.
 */
        private GoogleDoc gd;
        [SetUp]
    public void SetUp()
        {
            gd = new GoogleDoc();
        }
        /**
         * Font test.
         */
        [TestCase]
    public void testFont()
        {
            Font font = gd.getFont();
            Assert.AreEqual("Arial", font.getName());
        }
        /**
         * Style test.
         */
        [TestCase]
        public void styleTest()
        {
            Object style = new Object();
            Assert.AreEqual(true, style.Equals(gd.getStyle()));
        }
        /**
         * Background image test.
         */
        [TestCase]
        public void backgroundImageTest()
        {
            BackgroundImage bi = new BackgroundImage();
            Assert.AreEqual(true, bi.Equals(gd.getBackground()));
        }
        /**
         * Sharing permissions test.
         */
        [TestCase]
        public void permissionsTest()
        {
            Assert.AreEqual("Sharing permissions are not enabled", gd.setSharingPermissions(0));
            Assert.AreEqual("Sharing permissions enabled", gd.setSharingPermissions(1));
        }
    }
}
