from Font import *

class Format:

    def __init__(self):
        self.fontSize = 12
        self.font = Font("Ubuntu",self.fontSize)
    
    def getFont(self):
        return self.font

