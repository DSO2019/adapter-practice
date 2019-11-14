using Microsoft.VisualStudio.TestTools.UnitTesting;
using Adapter.Clases;

namespace UnitTestAdapter
{
    [TestClass]
    public class WordDocAdapterTest
    {
        private WordAdapter _wordDocAdapter;
        private WordDocument _mockedWordDoc;

        [TestInitialize]
        public void SetUp()
        {
            _mockedWordDoc = new WordDocument(new Font("Arial"), new MsLicense("MS License"),
            new Format(new Font("Arial"), "Bold"), new BackgroundImage(new Image("imageUrl")));
            _wordDocAdapter = new WordAdapter(_mockedWordDoc, new Font("Arial"), new Format(new Font("Arial"), "bold"), "bold");
        }

        [TestMethod]
        public void GetFontTest()
        {
            var result = _wordDocAdapter.GetFont();
            Assert.AreEqual("Arial", result.GetFont());
        }

        [TestMethod]
        public void GetStyleTest()
        {
            var result = (string)_wordDocAdapter.GetStyle();
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
