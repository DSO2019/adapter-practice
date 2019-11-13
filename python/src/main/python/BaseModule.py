
class Font:
    def __init__(self, font_name, font_size):
        self.font_name = font_name
        self.font_size = font_size

    def get_font_name(self):
        return self.font_name

    def get_font_size(self):
        return self.font_size


class Format:
    def __init__(self, font):
        self.font = font

    def get_font(self):
        return self.font


class Image:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def get_width(self):
        return self.width

    def get_height(self):
        return self.height


class Style:
    def __init__(self, font):
        self.font = font

    def get_font(self):
        return self.font


class MSLicense:
    def __init__(self, license_version):
        self.license_version = license_version

    def get_license_version(self):
        return self.license_version
