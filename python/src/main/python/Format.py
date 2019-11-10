from Font import *


class Format():

    def __init__(self):
        fontSize = 20
        self.font = Font("Roboto", fontSize)

    def getFont(self):
        return self.font
