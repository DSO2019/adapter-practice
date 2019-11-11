from Font import *
from GoogleDoc import *
from BackgroundImage import *
from Format import *
import unittest


class GoogleDocumentTest(unittest.TestCase):

    def setUp(self):
        self.googleDoc = GoogleDoc()

    def testGetFont(self):
        font = self.googleDoc.getFont()
        self.assertEquals("Roboto", font.getFontName())

    def testGetStyle(self):
        style = self.googleDoc.getStyle()
        self.assertEquals("Roboto", style.getFont().getFontName())

    def testgetBackground(self):
        bg = self.googleDoc.getBackground()
        self.assertEquals("image.png", bg.getImage().getUrl())

    def testsetSharingPermissions(self):
        self.googleDoc.setSharingPermissions(0)
        self.assertEquals(0, self.googleDoc.getSharingPermissions())
