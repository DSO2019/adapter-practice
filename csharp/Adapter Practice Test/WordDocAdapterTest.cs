using Microsoft.VisualStudio.TestTools.UnitTesting;
using adapter_practice;

namespace Adapter_Practice_Test
{
    [TestClass]
    public class WordDocAdapterTest
    {
        private WordDocAdapter _wordDocAdapter;
        private WordDocument _mockedWordDoc;

        [TestInitialize]
        public void SetUp()
        {
            _mockedWordDoc = new WordDocument();
            _wordDocAdapter = new WordDocAdapter(_mockedWordDoc);

        }

        [TestMethod]
        public void GetFontTest()
        { 
            var result = _wordDocAdapter.GetFont();
            Assert.AreEqual(result.GetFont(), "Arial");

        }

        [TestMethod]
        public void GetStyleTest()
        {
            var result = _wordDocAdapter.GetStyle();
            Assert.AreEqual("bold", result);

        }
        [TestMethod]
        public void GetBackgroundTest()
        {
            var backgroundImage = _wordDocAdapter.GetBackground().GetImage().GetUrl();
            Assert.AreEqual("imageUrl", backgroundImage);
        }

        [TestMethod]
        public void SetSharingPermissionsTest()
        {
            _wordDocAdapter.SetSharingPermissions(3);

        }
    }
}