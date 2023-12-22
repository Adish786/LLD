package com.lld.CreationalDesign.AbstractPattern;

public class TextBoxFactory {
    public static TextBox createTextBox(OS currentOS)
    {
        TextBox textBox = null;
        if(currentOS==OS.WINDOWS)
        {
            textBox= new TextBox("","#FFFFFF",currentOS);

        } else if (currentOS==OS.MAC) {
            textBox = new TextBox("","#0000000",currentOS);
        } else if (currentOS==OS.LINUX) {
            textBox = new TextBox("","#234FFFF",currentOS);
        }
        return  textBox;
    }
}
