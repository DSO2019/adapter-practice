package mx.iteso.adapter;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Font;
import mx.iteso.utils.Format;

/**
 * clase.
 */
public class DocToGoogle implements IGoogleDoc {
    /**
     * variable.
     */
    private IWordDocument word;
    /**
     * variable.
     */
    private Format f;
    /**
     * variable.
     */
    private int sharingPermissions;

    /**
     *
     * @param w .
     */
    public DocToGoogle(final IWordDocument w) {
        this.word = w;
        f = (Format) word.getFormat();
        this.sharingPermissions = 777;
    }

    /**
     *
     * @return .
     */
    public final Font getFont() {
        return f.getFont();
    }

    /**
     *
     * @return .
     */
    public final Object getStyle() {
        return f.getStyle();
    }

    /**
     *
     * @return .
     */
    public BackgroundImage getBackground() {
        return new BackgroundImage(word.getBackground().getImage());
    }

    /**
     *
     * @param sharingP .
     */
    public void setSharingPermissions(int sharingP) {
        this.sharingPermissions = sharingP;
    }
}
