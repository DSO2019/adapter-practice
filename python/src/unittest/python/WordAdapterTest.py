
from WordDocument import *
from WordAdapter import *
from BackImage import *
from Format import *
from Font import *
import unittest


class WordAdapterTest(unittest.TestCase):

    def setUp(self):
        self.word_doc = WordDocument(1)
        self.google_doc = WordAdapter(self.word_doc)

    def testStyle(self):
        self.assertEquals(Format().getFont().getFontText(),
                          self.google_doc.getStyle()
                          .getFont().getFontText())

    def testBackground(self):
        self.assertEquals(BackgroundImage().getImage().get_url(),
                          self.google_doc
                          .getBackground().getImage().get_url())

    def testPermissions(self):
        self.assertEquals(1, self.google_doc.getPermissions())

    def testFont(self):
        self.assertEquals(Font('Arial', 11).getFontText(),
                          self.google_doc.getFont().getFontText())

