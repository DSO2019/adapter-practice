import unittest
from WordToGoogle import *
from WordDocument import *


class WordToGoogleTest(unittest.TestCase):

    def setUp(self):
        wordDocument = WordDocument(10001)
        self.wordToGoogleAdapter = WordToGoogle(wordDocument)

    def testGetFont(self):
        self.assertEquals("Roboto", self.wordToGoogleAdapter.
                          getFont().getFontName())

    def testGetStyle(self):
        self.assertEquals("Roboto", self.wordToGoogleAdapter.
                          getStyle().getFont().getFontName())

    def testGetBackground(self):
        self.assertEquals("image.png", self.wordToGoogleAdapter.
                          getBackground().getImage().getUrl())

    def testSetSharingPermissions(self):
        self.assertEquals(1, self.wordToGoogleAdapter.
                          getSharingPermissions())
