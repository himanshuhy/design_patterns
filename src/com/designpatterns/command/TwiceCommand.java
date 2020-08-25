package com.designpatterns.command;

public class TwiceCommand implements ICommand{

    private Calculator calculator;

    public TwiceCommand(int someStart) {
        this.calculator = new Calculator(someStart);
    }
    @Override
    public void execute() {
        calculator.twice();
    }

    @Override
    public void unexecute() {
        calculator.half();
    }
}
