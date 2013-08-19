package com.delta.barspeak;

/**
* Created by Kin on 8/13/13.
*/
public interface BarSpeakInterface {

    /**
     * Build UI.
     */
    public abstract void setupUi();

    /**
     * Add systemuihider that does the bare minimum.
     */
    public abstract void addSystemUiHider();

    /**
     * Add EditText that uses onTextChangedListener to update text as text is
     * entered.
     */
    public abstract void addEditTextWithOnTextChanged();
}
