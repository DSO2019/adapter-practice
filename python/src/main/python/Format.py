
from Font import *

class Format:

    def __init__(self):
        self.fontSize = 18
        self.font = Font("Calibri", self.fontSize)

    def getFont(self):
        return self.font
