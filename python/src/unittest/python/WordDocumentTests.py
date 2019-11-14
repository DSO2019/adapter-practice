
from WordDocument import *
from Format import *
from BackgroundImage import *
from Image import *
from MSLicense import *
import unittest


class WordDocumentTest(unittest.TestCase):

    def setUp(self):
        self.word_doc = WordDocument(1)

    def test_format(self):
        self.assertEquals(Font('Calibri', 12).get_font_name(),
                          self.word_doc.get_format()
                          .get_font().get_font_name())

    def test_get_ms_office_version(self):
        self.word_doc.set_ms_office_version(2.0)
        self.assertEquals(2.0, self.word_doc.get_ms_office_version())

    def test_get_background(self):
        self.assertEquals(BackgroundImage().get_image().get_url(),
                          self.word_doc.get_background().get_url())

    def test_license_is_invalid(self):
        self.assertFalse(self.word_doc.
                         restricted_edit_if_license_is_invalid())

    def test_get_license(self):
        self.assertEquals(1, self.word_doc.get_license().get_license_number())
