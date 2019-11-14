from IWordDocument import *
from Format import *
from Image import *
from MSLicense import *


class WordDocument(IWordDocument):

    def __init__(self, ms_license_number):
        self.ms_license = MSLicense(ms_license_number)
        self.format = Format()
        self.background = Image('someurl.jpg')

    def get_format(self):
        return self.format

    def get_background(self):
        return self.background

    def get_ms_office_version(self):
        return self.ms_office_version

    def set_ms_office_version(self, ms_office_version):
        self.ms_office_version = ms_office_version

    def get_license(self):
        return self.ms_license

    def restricted_edit_if_license_is_invalid(self):
        return not(self.ms_license.is_valid())
