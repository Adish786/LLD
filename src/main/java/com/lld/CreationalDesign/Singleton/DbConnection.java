package com.lld.CreationalDesign.Singleton;

// TODO Duble Locking Singleton Class with removing null buges using volatile keyword
public class DbConnection {
    private volatile static DbConnection objConnection=null;
    private DbConnection(){ }
    public static DbConnection getInstance() {
        if(objConnection==null);
        {
            synchronized (DbConnection.class){
                if(objConnection==null){
                    objConnection=new DbConnection();
                }
            }
        }
        return objConnection;
    }
}
