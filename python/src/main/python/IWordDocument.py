
from abc import ABC, abstractmethod

class IWordDocument(ABC):

    @abstractmethod
    def getFormat(self):
        pass

    @abstractmethod
    def getBackground(self):
        pass

    @abstractmethod
    def setMSOfficeVersion(self, ms_office_version):
        pass

    @abstractmethod
    def getLicense(self):
        pass

    @abstractmethod
    def restrictEditIfLicenseIsInvalid(self, ms_license):
        pass
