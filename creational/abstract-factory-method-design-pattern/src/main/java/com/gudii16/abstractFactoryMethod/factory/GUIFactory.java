package com.gudii16.abstractFactoryMethod.factory;


import product.Button;
import product.CheckBox;

public interface GUIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
