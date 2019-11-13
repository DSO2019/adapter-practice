import unittest
from Documents import GoogleDoc
from BaseModule import *


class GoogleDocTest(unittest.TestCase):

    def setUp(self):
        self.google_doc = GoogleDoc()

    def test_font(self):
        font = self.google_doc.get_font()
        self.assertEqual("TimesNewRoman", font.get_font_name())
        self.assertEqual(25, font.get_font_size())

    def test_style(self):
        style = self.google_doc.get_style()
        self.assertEqual("TimesNewRoman", style.get_font().get_font_name())
        self.assertEqual(25, style.get_font().get_font_size())

    def test_background(self):
        background = self.google_doc.get_background()
        self.assertEqual(400.0, background.get_width(), 0.0)
        self.assertEqual(600.0, background.get_height(), 0.0)

    def test_sharing_permissions(self):
        self.assertEqual(2, self.google_doc.get_sharing_permissions())


if __name__ == '__main__':
    unittest.main()
