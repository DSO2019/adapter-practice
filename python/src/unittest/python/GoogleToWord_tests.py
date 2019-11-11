import unittest

from GoogleToWord import *
from GoogleDoc import *
from MSLicense import *


class GoogleToWordTest(unittest.TestCase):

    def setUp(self):
        googleDoc = GoogleDoc()
        self.googleToWordAdapter = GoogleToWord(googleDoc)

    def testFormat(self):
        self.assertEquals("Roboto", self.googleToWordAdapter.
                          getFormat().getFont().getFontName())

    def testgetBackground(self):
        self.assertEquals("image.png", self.googleToWordAdapter.
                          getBackground().getUrl())

    def testLicense(self):
        self.assertEquals(10001, self.googleToWordAdapter.
                          getLicense().getNumber())

    def testRestrictedEdit(self):
        self.assertFalse(self.googleToWordAdapter.
                         restrictEditIfLicenseIsInvalid(MSLicense(10001)))
