class Font():

    def __init__(self, incomingFamily, incomingSize):
        self.family = incomingFamily
        self.size = incomingSize

    def getFontName(self):
        return self.family
