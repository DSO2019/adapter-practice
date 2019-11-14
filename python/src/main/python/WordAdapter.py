from IGoogleDoc import *
from IWordDocument import *
from Format import *
from License import *
from BackImage import *


class WordAdapter(IGoogleDoc):

    def __init__(self, wordDocument):
        self.wordDocument = wordDocument

    def getFont(self):
        return self.wordDocument.get_format().getFont()

    def getStyle(self):
        return self.wordDocument.get_format()

    def getBackground(self):
        return BackgroundImage(self.wordDocument.getBackground())

    def setPermissions(self, sharing_permissions):
        return

    def getPermissions(self):
        if self.wordDocument.licenceInvalidCannotEdit():
            return 0
        return 1
