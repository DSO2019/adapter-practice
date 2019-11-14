from IGoogleDoc import *
from IWordDocument import *
from Format import *
from MSLicense import *
from BackgroundImage import *

class WordAdapter(IGoogleDoc):

    def __init__(self, word_document):
        self.word_document = word_document

    def get_font(self):
        return self.word_document.get_format().get_font()

    def get_style(self):
        return self.word_document.get_format()

    def get_background(self):
        return BackgroundImage(self.word_document.get_background())

    def set_sharing_permissions(self, sharing_permissions):
        return

    def get_sharing_permissions(self):
        if self.word_document.restricted_edit_if_license_is_invalid():
            return 0
        return 1
