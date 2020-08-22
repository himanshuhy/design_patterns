package com.designpatterns.factorymethod;

public class GameComponentFactory implements ComponentFactory {
    @Override
    public Component createComponent(int level) {
        if (level == -1){
            return new RandomComponent();
        } else {
            return new LevelBasedComponent(level);
        }
    }
}
