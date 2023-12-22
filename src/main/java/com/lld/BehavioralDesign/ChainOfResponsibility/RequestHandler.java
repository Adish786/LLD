package com.lld.BehavioralDesign.ChainOfResponsibility;

public abstract class RequestHandler {
   private RequestHandler nextHandler;
    public  RequestHandler(RequestHandler  nextHandler){
        this.nextHandler=nextHandler;
    }

    public RequestHandler getNextHandler(){
        return nextHandler;
    }
   abstract void handle(Request request);
}
