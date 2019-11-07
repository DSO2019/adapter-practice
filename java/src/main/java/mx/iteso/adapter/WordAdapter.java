package mx.iteso.adapter;

public class WordAdapter implements IGoogleDoc {

    WordDocument word;

    public WordAdapter(WordDocument word1){
        this.word = word1;
    }

    public Font getFont() {
        return null;
    }

    public Object getStyle() {
        return null;
    }

    public BackgroundImage getBackground() {
        return null;
    }

    public void setSharingPermissions(int SharingPermissions) {

    }

}
