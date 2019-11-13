from mockito import mock, verify, when
import unittest

from GoogleToWordAdapter import * 
from GoogleDoc import *


class GoogleToWordAdapter_tests(unittest.TestCase):

    def setUp(self):
        self.googledoc = GoogleDoc()
        self.gToWordAdapter = GoogleToWordAdapter(self.googledoc)

    def test_getFormat(self):
        self.assertEqual("Ubuntu", self.gToWordAdapter.getFormat().getFont().getName())

    def test_getBackground(self):
        self.assertEqual("img.png", self.gToWordAdapter.getBackground().getUrl());

    def test_getLicense(self):
        self.assertEqual(10001, self.gToWordAdapter.getLicense().getNumber())
    
    def test_restrict_valid(self):
        self.assertEqual(False, self.gToWordAdapter.restrictEditIfLicenseIsInvalid(self.gToWordAdapter.getLicense()))
    
    def test_restrict_invalid(self):
        self.googledoc.setSharingPermissions(0)
        self.assertEqual(True, self.gToWordAdapter.restrictEditIfLicenseIsInvalid(self.gToWordAdapter.getLicense()))