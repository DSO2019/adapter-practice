package mx.iteso.adapter;

public class Font {
    private String fontName;
    private int fontSize;
    public Font(final String newFontName, final int newFontSize) {
        this.fontName = newFontName;
        this.fontSize = newFontSize;
    }
    public String getFontName() {
        return this.fontName;
    }
    public int getFontSize() {
        return this.fontSize;
    }
}
