from Font import *
from GoogleDocument import *
from BackgroundImage import *
from Format import *
from Font import *
import unittest


class GoogleDocumentTest(unittest.TestCase):

    def setUp(self):
        self.google_doc = GoogleDocument()

    def test_get_font(self):
        self.assertEquals(Font('Calibri', 12).get_font_name(),
                          self.google_doc.get_font().get_font_name())

    def test_get_style(self):
        self.assertEquals(Format().get_font().get_font_name(),
                          self.google_doc.get_style()
                          .get_font().get_font_name())

    def test_get_background(self):
        self.assertEquals(BackgroundImage().get_image().get_url(),
                          self.google_doc
                          .get_background().get_image().get_url())

    def test_get_sharing_permissions(self):
        self.google_doc.set_sharing_permissions(10)
        self.assertEquals(10, self.google_doc.get_sharing_permissions())
