package com.github.kevinw831205.Utils;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer obeserver){
        this.observers.add(obeserver);
    }

    public void emit(){
        observers.forEach(o->o.update());
    }

}
