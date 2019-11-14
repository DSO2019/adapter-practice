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
    class WordAdapterTest
    {
        /**
 * Word document.
 */
        private WordDoc wd;
        /**
         * Converted wd to gd.
         */
        private WordAdapter wa;
        /**
         * Set up method.
         */
        [SetUp]
    public void SetUp()
        {
            wd = new WordDoc();
            wa = new WordAdapter(wd);
        }
        /**
         * Font test.
         */
        [TestCase]
    public void fontTest()
        {
            Assert.AreEqual(null, wa.getFont());
        }
        /**
         * Style test.
         */
        [TestCase]
        public void styleTest()
        {
            Object style = new Object();
            Assert.AreEqual(true, style.Equals(wa.getStyle()));
        }
        /**
         * Get bi test.
         */
        [TestCase]
        public void getBITest()
        {
            BackgroundImage bi = new BackgroundImage();
            Assert.AreEqual(true, bi.Equals(wa.getBackground()));
        }
        /**
         * Sharing permissions test.
         */
        [TestCase]
        public void setPermissionsTest()
        {
            Assert.AreEqual("Sharing permissions are not enabled", wa.setSharingPermissions(0));
            Assert.AreEqual("Sharing permissions enabled", wa.setSharingPermissions(1));
        }
    }
}
