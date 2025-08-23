package com.gudii16.abstractFactoryMethod.factory;

import product.Button;
import product.CheckBox;
import product.MacButton;
import product.MacCheckBox;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
