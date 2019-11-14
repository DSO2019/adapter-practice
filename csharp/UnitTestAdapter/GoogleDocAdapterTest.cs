using Microsoft.VisualStudio.TestTools.UnitTesting;
using Adapter.Clases;

namespace UnitTestAdapter
{
    [TestClass]
    public class GoogleDocAdapterTest
    {
        private GoogleAdapter _googleDocAdapter;
        private GoogleDoc _mockedGoogleDoc;

        [TestInitialize]
        public void SetUp()
        {
            _mockedGoogleDoc = new GoogleDoc(new Font("Arial"), new BackgroundImage(new Image("imageUrl")), new Format(new Font("Arial"), "Regular"), 1);
            _googleDocAdapter = new GoogleAdapter(_mockedGoogleDoc);
        }

        [TestMethod]
        public void GetFormatTest()
        {
            var result = _googleDocAdapter.GetFormat().GetFont();
            Assert.AreEqual("Arial", result);
        }

        [TestMethod]
        public void GetBackgroundTest()
        {
            var result = _googleDocAdapter.GetBackground().GetUrl();
            Assert.AreEqual("imageUrl", result);

        }

        [TestMethod]
        public void SetMsOfficeVersionTest()
        {
            _googleDocAdapter.SetMsOfficeVersion(3);
            Assert.AreEqual(3, _googleDocAdapter.GetMsOfficeVersion(), 0);
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
