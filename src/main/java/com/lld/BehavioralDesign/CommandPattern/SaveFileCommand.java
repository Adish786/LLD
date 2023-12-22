package com.lld.BehavioralDesign.CommandPattern;

public class SaveFileCommand implements  Command {
    private EditiorService editiorService;
    private Editior editior;
    public SaveFileCommand(EditiorService editiorService,Editior editior){
        this.editiorService=editiorService;
        this.editior=editior;
    }


    @Override
    public void execute() {
        this.editiorService.saveFile(this.editior.getEditorText());
    }
}
