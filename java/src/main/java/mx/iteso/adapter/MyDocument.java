package mx.iteso.adapter;


import mx.iteso.adapter.impl.GoogleDocument;
import mx.iteso.adapter.impl.WordDocument;
import mx.iteso.adapter.impl.WordDocumentAdapter;
import mx.iteso.adapter.media.Format;


public class MyDocument {
    public static void main(String[] args) {
        IGoogleDoc googleDoc = new GoogleDocument();
        IWordDocument wordDoc = new WordDocument(new MSLicense(123551));

        googleDoc.setFont(new Format("Curier", 14));
        wordDoc.setFormat(new Format("Arial", 12));
        IGoogleDoc onlineWord = new WordDocumentAdapter(wordDoc);

        GoogleDrive drive = new GoogleDrive();
        drive.addDocument(googleDoc);
        drive.addDocument(onlineWord);
        drive.listDocs();

    }
}
