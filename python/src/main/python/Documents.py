from BaseModule import *


class GoogleDoc:
    def __init__(self):
        self.font = Font("TimesNewRoman", 25)
        self.style = Style(self.font)
        self.background = Image(400.0, 600.0)
        self.sharing_permissions = 2

    def set_sharing_permissions(self, sharing_permissions):
        self.sharing_permissions = sharing_permissions

    def get_font(self):
        return self.font

    def get_style(self):
        return self.style

    def get_background(self):
        return self.background

    def get_sharing_permissions(self):
        return self.sharing_permissions


class WordDocument:
    def __init__(self):
        self.license = MSLicense(1.6)
        self.format = Format(Font("Arial", 12))
        self.background = Image(100.0, 200.0)

    def get_license(self):
        return self.license

    def get_format(self):
        return self.format

    def get_background(self):
        return self.background

    def restrict_edit(self):
        return self.license is not None and self.license.get_license_version() < 2.6

    def set_ms_office_version(self, version):
        self.license = MSLicense(version)
