class MSLicense():
    def __init__(self, num):
        self.number = num

    def getNumber(self):
        return self.number

    def setNumber(self, n):
        self.number = n

    def isValid(self):
        validator = 10000
        return self.number > validator
