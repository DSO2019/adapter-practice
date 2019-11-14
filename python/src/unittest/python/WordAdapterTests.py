from Font import *
from GoogleDocument import *
from WordDocument import *
from WordAdapter import *
from BackgroundImage import *
from Format import *
from Font import *
import unittest


class WordAdapterTest(unittest.TestCase):

    def setUp(self):
        self.word_doc = WordDocument(1)
        self.google_doc = WordAdapter(self.word_doc)

    def test_get_style(self):
        self.assertEquals(Format().get_font().get_font_name(),
                          self.google_doc.get_style()
                          .get_font().get_font_name())

    def test_get_font(self):
        self.assertEquals(Font('Calibri', 12).get_font_name(),
                          self.google_doc.get_font().get_font_name())

    def test_get_sharing_permissions(self):
        self.assertEquals(1, self.google_doc.get_sharing_permissions())

    def test_get_background(self):
        self.assertEquals(BackgroundImage().get_image().get_url(),
                          self.google_doc
                          .get_background().get_image().get_url())