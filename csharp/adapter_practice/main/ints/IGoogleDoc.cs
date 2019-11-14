using adapter_practice.main.other;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main.ints
{
    public interface IGoogleDoc
    {
        /**
         * Gets Font.
         * @return font.
         */
        Font getFont();
        /**
         * @return object of style.
         */
        Object getStyle();
        /**
         * @return Background Image of document.
         */
        BackgroundImage getBackground();
        /**
         *
         * @param sharingPermissions sets permissions.
         */
        void setSharingPermissions(int sharingPermissions);
    }
}
