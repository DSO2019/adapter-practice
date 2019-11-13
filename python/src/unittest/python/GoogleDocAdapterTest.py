import unittest
from src.main.python.Documents import GoogleDoc
from src.main.python.Adapters import GoogleDocAdapter


class GoogleDocAdapterTest(unittest.TestCase):

    def setUp(self):
        self.word_doc_adapter = GoogleDocAdapter(GoogleDoc())

    def test_format(self):
        w_format = self.word_doc_adapter.get_format()
        self.assertEqual("TimesNewRoman", w_format.get_font().get_font_name())
        self.assertEqual(25, w_format.get_font().get_font_size())

    def test_background(self):
        background = self.word_doc_adapter.get_background()
        self.assertEqual(400.0, background.get_width(), 0.0)
        self.assertEqual(600.0, background.get_height(), 0.0)

    def test_license(self):
        license = self.word_doc_adapter.get_license()
        self.assertEqual(2.0, license.get_license_version())


if __name__ == '__main__':
    unittest.main()
