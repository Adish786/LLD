package com.lld.CreationalDesign.AbstractPattern;

import java.util.List;

public class Window implements UIElement{
    private OS style;
    private List<UIElement> uiElements;

    public Window(List<UIElement> uiElements,OS currentOS){
        this.uiElements=uiElements;
        this.style=currentOS;
    }
    @Override
    public void render() {
        System.out.println("Rendring window in " +style);
        for(UIElement uiElement : uiElements)
        {
            uiElement.render();
        }
    }
}
