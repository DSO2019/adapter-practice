from mockito import mock, verify, when
import unittest

from WordDoc import *

class WordDoc_tests(unittest.TestCase):

    def setUp(self):
        self.worddoc = WordDoc(10001)
    
    def test_get_format(self):
        self.assertEqual("Ubuntu", self.worddoc.getFormat().getFont().getName())
    
    def test_get_background(self):
        self.assertEqual("img.png", self.worddoc.getBackground().getUrl())
    
    def test_get_license(self):
        self.assertEqual(10001, self.worddoc.getLicense().getNumber())

    def test_restric_valid(self):
        self.assertEqual(False, self.worddoc.restrictEditIfLicenseIsInvalid(self.worddoc.getLicense()))

    def test_restrict_invalid(self):
        self.worddoc = WordDoc(1)
        self.assertEquals(True, self.worddoc.restrictEditIfLicenseIsInvalid(self.worddoc.getLicense()))
    
    