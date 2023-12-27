package com.lld.StructuralDesign.flyweight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String,Playper> hm =new HashMap<>();
    public static Playper getPlayers(String type){
        Playper p =null;
        if(hm.containsKey(type))
            p = hm.get(type);
        else
        {
            switch (type)
            {
                case  "Terrorist":
                    System.out.println("Terrorist Create");
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Create");
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }
            hm.put(type,p);
        }
        return p;
    }
}
