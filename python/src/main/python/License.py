class MSLicense():

    def __init__(self, num):
        self.license_number = num

    def getLicSerialNum(self):
        return self.license_number

    def setLicenseSerialN(self, license_number):
        self.license_number = license_number

    def validLicence(self):
        return self.license_number > 0
