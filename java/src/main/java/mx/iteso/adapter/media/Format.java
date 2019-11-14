package mx.iteso.adapter.media;


import java.awt.*;


public class Format {
    /**
     * Format's font.
     */
    private Font font;
    /**
     * Font's size.
     */
    private int size;
    /**
     * Fornt's name.
     */
    private String name;

    /**
     * Class constructor for Format.
     * @param name of font.
     * @param size of font.
     */
    public Format(final String name, final int size) {
        /**
         * Font's name.
         */
        this.name = name;
        /**
         * Font's size.
         */
        this.size = size;
        /**
         * Font.
         */
        this.font = new Font(name, Font.PLAIN, size);
    }

    /**
     * Font's getter method.
     * @return current font
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * Font's size getther method.
     * @return actual size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Name's getter method.
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Size's getter method.
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
        this.font = new Font(this.name, Font.PLAIN, size);
    }

    /**
     * Setter method for name.
     * @param name value
     */
    public void setName(String name) {
        this.name = name;
        this.font = new Font(name, Font.PLAIN, this.size);
    }
}
