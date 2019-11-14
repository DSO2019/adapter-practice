
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace adapter_practice.tests
{
    
    [TestClass]
    public class GoogleDocAdapterTest
    {
        private GoogleDocAdapter _googleDocAdapter;
        private GoogleDoc _mockedGoogleDoc;

        [TestInitialize]
        public void SetUp()
        {
            _mockedGoogleDoc = new GoogleDoc();
            _googleDocAdapter = new GoogleDocAdapter(_mockedGoogleDoc);
        }
        [TestMethod]
        public void GetFormatTest()
        {
            var result = _googleDocAdapter.GetFormat().GetFont();
            Assert.AreEqual("Verdana", result);
        }

        [TestMethod]
        public void GetBackgroundTest()
        {
            var result = _googleDocAdapter.GetBackground().GetUrl();
            Assert.AreEqual("SoyUnaUrl", result);

        }

        [TestMethod]
        public void SetMsOfficeVersionTest()
        {
            _googleDocAdapter.SetMOfficeVersion(100);
            Assert.AreEqual(100, _googleDocAdapter.GetMsOfficeVersion(), 0);
        }

        [TestMethod]
        public void GetLicenseTest()
        {
            var result = _googleDocAdapter.GetLicense().GetLicense();
            Assert.AreEqual("Google license", result);
        }

        [TestMethod]
        public void RestrictEditIfLicenseIsInvalidTestFalse()
        {
            var ms = new MsLicense("Ms");
            var result = _googleDocAdapter.RestrictEditIfLicenseIsInvalid(ms);
            Assert.AreEqual(false, result);
        }

        [TestMethod]
        public void RestrictEditIfLicenseIsInvalidTestTrue()
        {
            var ms = new MsLicense("Google license");
            var result = _googleDocAdapter.RestrictEditIfLicenseIsInvalid(ms);
            Assert.AreEqual(true, result);

        }
    }
    }

