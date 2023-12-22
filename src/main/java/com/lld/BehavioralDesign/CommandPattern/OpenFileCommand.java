package com.lld.BehavioralDesign.CommandPattern;

public class OpenFileCommand implements  Command {
    private EditiorService editiorService;

    private Editior editior;
public OpenFileCommand(EditiorService editiorService,Editior editior)
{
    this.editiorService=editiorService;
    this.editior=editior;
}
    @Override
    public void execute() {
        this.editiorService.openExistingFile(this.editior.getOpenFilePath());
    }
}
