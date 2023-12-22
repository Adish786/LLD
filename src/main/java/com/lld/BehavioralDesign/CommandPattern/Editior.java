package com.lld.BehavioralDesign.CommandPattern;

public class Editior {
    private TextBox openFileTextBox;
    private TextBox editorText;
    private Butoon openFileButton;
    private Butoon saveFileButton;
    public Editior(EditiorService editiorService){
        this.openFileTextBox=new TextBox();
        this.editorText=new TextBox();
        this.openFileButton=new Butoon(new OpenFileCommand(editiorService,this),"Open");
        this.saveFileButton=new Butoon(new SaveFileCommand(editiorService,this),"Save");


    }

    public String getOpenFilePath(){
        return this.openFileTextBox.getText();
    }

    public String getEditorText(){
        return this.editorText.getText();
    }
public void setFilePath(String filePath){
        this.openFileTextBox.setText(filePath);
}
public void setEditorText(String editorText){
        this.editorText.setText(editorText);
}

    public void openFile(){
        this.openFileButton.click();
    }
    public void saveFile(){
        this.saveFileButton.click();
    }
}
