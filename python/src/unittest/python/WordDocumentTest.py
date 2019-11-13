import unittest
from src.main.python.Documents import WordDocument


class WordDocumentTest(unittest.TestCase):

    def setUp(self):
        self.word_doc = WordDocument()

    def test_format(self):
        w_format = self.word_doc.get_format()
        self.assertEqual("Arial", w_format.get_font().get_font_name())
        self.assertEqual(12, w_format.get_font().get_font_size())

    def test_background(self):
        background = self.word_doc.get_background()
        self.assertEqual(100.0, background.get_width(), 0.0)
        self.assertEqual(200.0, background.get_height(), 0.0)

    def test_license(self):
        license = self.word_doc.get_license()
        self.assertEqual(1.6, license.get_license_version())


if __name__ == '__main__':
    unittest.main()
