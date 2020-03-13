package com.ahmad.labelledtextview;

import java.util.HashMap;

public class KVModel {
    Extras extras;
    Attributes attributes;

    public KVModel(Attributes attributes, Extras extras) {
        this.extras = extras;
        this.attributes = attributes;
    }

    public Extras getExtras() {
        return extras;
    }

    /*public void setExtras(Extras extras) {
        this.extras = extras;
    }
*/
    public Attributes getAttributes() {
        return attributes;
    }

    /*public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }*/


}
