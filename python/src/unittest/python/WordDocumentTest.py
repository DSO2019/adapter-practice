
from WordDocument import *
from Format import *
from BackImage import *
from Image import *
from License import *
import unittest


class WordDocumentTest(unittest.TestCase):

    def setUp(self):
        self.word_doc = WordDocument(1)

    def testBackground(self):
        self.assertEquals(BackgroundImage().getImage().get_url(),
                          self.word_doc.getBackground().get_url())

    def testOfficeVersion(self):
        self.word_doc.setMsOffice(2.0)
        self.assertEquals(2.0, self.word_doc.getOfficeVersion())

    def testLicense(self):
        self.assertEquals(1, self.word_doc.getOfficeLicense().getLicSerialNum())

    def testInvalidLicense(self):
        self.assertFalse(self.word_doc.
                         licenceInvalidCannotEdit())


    def testFormat(self):
        self.assertEquals(Font('Arial', 11).getFontText(),
                          self.word_doc.get_format()
                          .getFont().getFontText())


