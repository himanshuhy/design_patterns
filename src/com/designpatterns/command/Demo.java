package com.designpatterns.command;

public class Demo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        ICommand command1 = new TwiceCommand(10);

        ICommand icommand2 = new TwiceCommand(64);

        invoker.addCommand(command1);
        invoker.addCommand(icommand2);

        invoker.runPendingCommands();
        invoker.reverseExecutedCommands();

    }
}
