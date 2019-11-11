class MSLicense():

    def __init__(self, num):
        self.license_number = num

    def get_license_number(self):
        return self.license_number

    def set_license_number(self, license_number):
        self.license_number = license_number

    def is_valid(self):
        return self.license_number > 0
