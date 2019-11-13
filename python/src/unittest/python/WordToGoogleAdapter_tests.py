from mockito import mock, verify, when
import unittest

from WordToGoogleAdapter import * 
from WordDoc import *

class WordToGoogleAdapter_tests(unittest.TestCase):

    def setUp(self):
        self.worddoc = WordDoc(10001)
        self.wToGoogleAdapter = WordToGoogleAdapter(self.worddoc)
    
    def test_getFont(self):
        self.assertEqual("Ubuntu", self.wToGoogleAdapter.getFont().getName())

    def test_getStyle(self):
        self.assertEquals("Ubuntu", self.wToGoogleAdapter.getStyle().getFont().getName())
    
    def test_getBackground(self):
        self.assertEqual("img.png", self.wToGoogleAdapter.getBackground().getImage().getUrl())
    
    def test_sharePermissions(self):
        self.assertEqual(1, self.wToGoogleAdapter.getSharingPermissions())
        self.wToGoogleAdapter.setSharingPermissions(0)
        self.assertEquals(0, self.wToGoogleAdapter.getSharingPermissions())
        self.wToGoogleAdapter.setSharingPermissions(2)
        self.assertEquals(1, self.wToGoogleAdapter.getSharingPermissions())