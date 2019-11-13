from mockito import mock, verify, when
import unittest

from GoogleDoc import GoogleDoc

class GoogleDoc_tests(unittest.TestCase):

    def setUp(self):
        self.googledoc = GoogleDoc()
    
    def test_getFont(self):
        self.assertEqual("Arial", self.googledoc.getFont().getName())
    
    def test_getStyle(self):
        self.assertEqual("Arial", self.googledoc.getStyle().getFont().getName())
    
    def test_getBackground(self):
        self.assertEqual("img.png", self.googledoc.getBackground().getImage().getUrl());

    def test_share_permissions(self):
        self.assertEquals(1, self.googledoc.getSharingPermissions());
        self.googledoc.setSharingPermissions(0);
        self.assertEquals(0, self.googledoc.getSharingPermissions());

