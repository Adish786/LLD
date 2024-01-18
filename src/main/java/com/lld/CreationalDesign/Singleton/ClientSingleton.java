package com.lld.CreationalDesign.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClientSingleton {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SingletonLazyNonThreadSafe instance1 =  SingletonLazyNonThreadSafe.getInstance();
        System.out.println(instance1.hashCode());

        //TODO  1:- Using clone() method
     //   SingletonLazyNonThreadSafe instance2 =  (SingletonLazyNonThreadSafe)instance1.clone();
      //  System.out.println(instance2.hashCode());

        // TODO 2:- Using Reflection api
       /*
        SingletonLazyNonThreadSafe reflectionInstance =null;
        Constructor[] constructors = SingletonLazyNonThreadSafe.class.getDeclaredConstructors();
        for(Constructor constructor :constructors) {
        constructor.setAccessible(true);
        reflectionInstance = (SingletonLazyNonThreadSafe) constructor.newInstance();
        }
        System.out.println(reflectionInstance.hashCode());
        */
        //TODO 3:- Using Serilization
//Serialize singleton object to a file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();
//Deserialize singleton object from the file
        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonLazyNonThreadSafe instance2 =(SingletonLazyNonThreadSafe)in.readObject();
        in.close();
        System.out.println(instance2.hashCode());

    }

}
