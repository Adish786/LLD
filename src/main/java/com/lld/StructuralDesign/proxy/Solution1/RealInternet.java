package com.lld.StructuralDesign.proxy.Solution1;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost)
    {

        System.out.println("Connecting to "+ serverhost);
    }
}
