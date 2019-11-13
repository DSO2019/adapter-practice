from Documents import *


class GoogleDocAdapter(WordDocument):
    def __init__(self, google_doc):
        WordDocument.__init__(self)
        self.google_doc = google_doc
        self.set_ms_office_version(float(self.google_doc.get_sharing_permissions()))

    def get_background(self):
        return self.google_doc.get_background()

    def get_license(self):
        return WordDocument.get_license(self)

    def get_format(self):
        return Format(self.google_doc.get_font())

    def restrict_edit(self):
        return WordDocument.restrict_edit(self)


class WordDocumentAdapter(GoogleDoc):
    def __init__(self, word_document):
        GoogleDoc.__init__(self)
        self.word_document = word_document
        self.set_sharing_permissions(int(word_document.get_license().get_license_version()))

    def get_font(self):
        if self.word_document.get_format() is not None:
            return self.word_document.get_format().get_font()
        return None

    def get_background(self):
        return self.word_document.get_background()

    def get_style(self):
        if self.word_document.get_format() is not None:
            return Style(self.word_document.get_format().get_font())
        return None

    def get_sharing_permissions(self):
        return GoogleDoc.get_sharing_permissions(self)
