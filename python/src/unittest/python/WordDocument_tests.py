
from WordDocument import *
from Format import *
from Image import *
from MSLicense import *
import unittest


class WordDocumentTest(unittest.TestCase):

    def setUp(self):
        self.wordDocument = WordDocument(10001)

    def testFormat(self):
        self.wordDocument.setFormat(Format())
        self.assertEquals("Roboto", self.wordDocument.
                          getFormat().getFont().getFontName())

    def testgetBackground(self):
        self.wordDocument.setBackground(Image("image.png"))
        self.assertEquals("image.png", self.wordDocument.
                          getBackground().getUrl())

    def testMSOfficeVersion(self):
        self.wordDocument.setMSOfficeVersion(2.1)
        self.assertEquals("2.1", str(self.wordDocument.getMSOfficeVersion()))

    def testLicense(self):
        self.wordDocument.setLicense(MSLicense(10001))
        self.assertEquals(10001, self.wordDocument.
                          getLicense().getNumber())

    def testRestrictedEdit(self):
        self.assertFalse(self.wordDocument.
                         restrictEditIfLicenseIsInvalid(MSLicense(10001)))
