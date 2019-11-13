import unittest
from Documents import WordDocument
from Adapters import WordDocumentAdapter
from BaseModule import *


class WordDocumentAdapterTest(unittest.TestCase):

    def setUp(self):
        self.word_doc_adap = WordDocumentAdapter(WordDocument())

    def test_font(self):
        font = self.word_doc_adap.get_font()
        self.assertEqual("Arial", font.get_font_name())
        self.assertEqual(12, font.get_font_size())

    def test_style(self):
        style = self.word_doc_adap.get_style()
        self.assertEqual("Arial", style.get_font().get_font_name())
        self.assertEqual(12, style.get_font().get_font_size())

    def test_background(self):
        background = self.word_doc_adap.get_background()
        self.assertEqual(100.0, background.get_width(), 0.0)
        self.assertEqual(200.0, background.get_height(), 0.0)

    def test_sharing_permissions(self):
        self.assertEqual(1, self.word_doc_adap.get_sharing_permissions())


if __name__ == '__main__':
    unittest.main()
