from Font import *
from IGoogleDoc import *
from IWordDocument import *
from Format import *
from Image import *
from MSLicense import *


class GoogleAdapter(IWordDocument):

    def __init__(self, google_document):
        self.google_document = google_document

    def get_format(self):
        return self.google_document.get_style()

    def get_background(self):
        return self.google_document.get_background().get_image()

    def set_ms_office_version(self, ms_office_version):
        return

    def get_license(self):
        if self.google_document.get_sharing_permissions() == 1:
            return MSLicense(1)
        return MSLicense(-1)

    def restricted_edit_if_license_is_invalid(self):
        return
