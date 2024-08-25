package com.lld.CreationalDesign.Singleton;

import java.util.ArrayList;
import java.util.List;
//TODO Immutable Class
final class MyImmutableClass {
    private final String name;
    private final List<Object>petNameList;
    MyImmutableClass(String name, List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }
    public String getName(){
        return name;
    }
    public List<Object> getPetNameList(){
        return new ArrayList<>(petNameList);
    }
}

public class Main{
    public static void main(String[] args) {
        List<Object> perNames = new ArrayList<>();
        perNames.add("sj");
        perNames.add("pj");
        MyImmutableClass obj = new MyImmutableClass("myName",perNames);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
    }
}


