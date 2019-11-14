from GoogleDocument import *
from BackImage import *
from Format import *
from Font import *
import unittest


class GoogleDocumentTest(unittest.TestCase):

    def testPermissions(self):
        self.google_doc.setPermissions(10)
        self.assertEquals(10, self.google_doc.getPermissions())


    def testFont(self):
        self.assertEquals(Font('Arial', 11).getFontText(),
                          self.google_doc.getFont().getFontText())

    def testStyle(self):
        self.assertEquals(Format().getFont().getFontText(),
                          self.google_doc.getStyle()
                          .getFont().getFontText())


    def setUp(self):
        self.google_doc = GoogleDocument()


    def testBackground(self):
        self.assertEquals(BackgroundImage().getImage().get_url(),
                          self.google_doc
                          .getBackground().getImage().get_url())

