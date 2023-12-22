package com.lld.BehavioralDesign.CommandPattern;

public class Client {
    public static void main(String[] args) {
        EditiorService editiorService = new EditiorService();
        Editior editior = new Editior(editiorService);
        editior.setFilePath("");
        editior.openFile();
    }
}
