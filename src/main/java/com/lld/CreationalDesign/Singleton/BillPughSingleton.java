package com.lld.CreationalDesign.Singleton;

//TODO This is very fast and very popular
public class BillPughSingleton {
    private BillPughSingleton(){}

    //TODO create this inner class will help to creating the object and not able to access outside
    private static class DbConnectionHelper{
        //TODO inislizing the object inside a static inner class
        private static final BillPughSingleton INSTANCE_OBJECT = new BillPughSingleton();
    }
    public static  BillPughSingleton getInstance(){
        return DbConnectionHelper.INSTANCE_OBJECT;
    }
}
