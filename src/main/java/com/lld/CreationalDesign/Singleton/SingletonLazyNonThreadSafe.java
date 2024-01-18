package com.lld.CreationalDesign.Singleton;

import java.io.Serializable;
//TODO Pure custom Singleton class
public class SingletonLazyNonThreadSafe extends MyClone implements Serializable {
    private static SingletonLazyNonThreadSafe instance;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone Not Supported");
    }
    public static synchronized SingletonLazyNonThreadSafe getInstance(){
        if(instance==null)
        {
            instance = new SingletonLazyNonThreadSafe();
        }
        return instance;
    }
    protected Object readResolve(){
        return instance;
    }
    private SingletonLazyNonThreadSafe(){
        if(instance!=null){
         throw new IllegalArgumentException("Object can't be created using reflation api");
        }
    }
}
