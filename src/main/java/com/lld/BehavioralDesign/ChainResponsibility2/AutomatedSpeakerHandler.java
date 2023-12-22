package com.lld.BehavioralDesign.ChainResponsibility2;

public class AutomatedSpeakerHandler extends CallHandlerBase{
    @Override
    public PhoneCallResponse response(PhoneCall call) {
        System.out.println("Busy!"+call.toString()+"Please call later");
        return PhoneCallResponse.ACCEPTED;
    }
}
