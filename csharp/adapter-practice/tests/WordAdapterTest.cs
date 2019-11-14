
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace adapter_practice.tests
{
    [TestClass]
    public class WordDocAdapterTest
    {
        private WordAdapter _wordDocAdapter;
        private WordDocument _mockedWordDoc;

        [TestInitialize]
        public void SetUp()
        {
            _mockedWordDoc = new WordDocument();
            _wordDocAdapter = new WordAdapter(_mockedWordDoc);

        }

        [TestMethod]
        public void GetFontTest()
        {
            var result = _wordDocAdapter.GetFont();
            Assert.AreEqual(result.GetFont(), "Verdana");

        }

        [TestMethod]
        public void GetStyleTest()
        {
            var result = _wordDocAdapter.GetStyle();
            Assert.AreEqual("style", result);

        }
        [TestMethod]
        public void GetBackgroundTest()
        {
            var backgroundImage = _wordDocAdapter.GetBackground().GetImage().GetUrl();
            Assert.AreEqual("SoyUnaUrl", backgroundImage);
        }

        [TestMethod]
        public void SetSharingPermissionsTest()
        {
            _wordDocAdapter.SetSharingPermissions(3);

        }
    }
}