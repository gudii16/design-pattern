package com.gudii16.abstractFactoryMethod.factory;

import product.Button;
import product.CheckBox;
import product.WindowsButton;
import product.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
