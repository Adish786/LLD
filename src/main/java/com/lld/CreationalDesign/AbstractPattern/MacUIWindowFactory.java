package com.lld.CreationalDesign.AbstractPattern;

import java.util.Arrays;

public class MacUIWindowFactory implements UIWindowFactory{
   // @Override
    public static Window createWindow() {
       Window window = new Window(Arrays.asList(ButtonFactory.createButton(OS.MAC),
               TextBoxFactory.createTextBox(OS.MAC)),OS.MAC);
       return window;
    }
}
