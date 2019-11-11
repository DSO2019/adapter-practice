import abc


class IWordDocument:

    def get_format(self):
        pass

    def get_background(self):
        pass

    def set_ms_office_version(self, ms_office_version):
        pass

    def get_license(self):
        pass

    def restricted_edit_if_license_is_invalid(self):
        pass
