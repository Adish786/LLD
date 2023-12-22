package com.lld.BehavioralDesign.CommandPattern;

public class EditiorService {


   void openExistingFile(String filePath){
       System.out.println("Opening an existing file with  File Path" +filePath);
   }

   void closeFile(){
       System.out.println("Closing a Current File");
   }

   void saveFile(String text){
       System.out.println("Saving The Current File " +text);
   }
}
