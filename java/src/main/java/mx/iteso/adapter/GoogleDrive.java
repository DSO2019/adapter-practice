package mx.iteso.adapter;

import mx.iteso.adapter.impl.GoogleDocAdapter;

import java.util.ArrayList;

public class GoogleDrive {
    private ArrayList docs;

    public GoogleDrive() {
        docs = new ArrayList();
    }

    public void addDocument(IGoogleDoc googleDoc) {
        docs.add(googleDoc);
    }

    public void listDocs() {
        for (int i = 0; i < docs.size(); i++) {
            IGoogleDoc googleDoc = (IGoogleDoc) docs.get(i);
            System.out.println("Fuente : " + googleDoc.getStyle().getName() + "-"
                    + googleDoc.getStyle().getSize());
        }
    }
}
