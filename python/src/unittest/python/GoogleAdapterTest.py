
from GoogleDocument import *
from GoogleAdapter import *
from Format import *
from BackImage import *

import unittest


class GoogleAdapterTest(unittest.TestCase):

    def testInvalidLicense(self):
        self.assertFalse(self.word_doc.
                         licenceInvalidCannotEdit())

    def setUp(self):
        self.google_doc = GoogleDocument()
        self.word_doc = GoogleAdapter(self.google_doc)

    def testFormat(self):
        self.assertEquals(Font('Arial', 11).getFontText(),
                          self.word_doc.get_format()
                          .getFont().getFontText())


    def testBackground(self):
        self.assertEquals(BackgroundImage()
                          .getImage().get_url(),
                          self.word_doc
                          .getBackground().get_url())

    def testLicense(self):
        self.assertEquals(1,
                          self.word_doc.getOfficeLicense()
                          .getLicSerialNum())



