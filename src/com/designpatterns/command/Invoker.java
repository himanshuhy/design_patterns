package com.designpatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * This is an event based invoker. We can also have a plug-n-play kind of invoker
 *
 * For example, the Invoker can provide certain functions/options to the client, and corresponding
 * to each functionality it will have some command that can be configured. example: TV remote
 */
public class Invoker {
    private List<ICommand> executedCommandList = new ArrayList<>();
    private List<ICommand> pendingCommandList = new ArrayList<>();

    public void addCommand(ICommand command) {
        pendingCommandList.add(command);
    }

    public void runPendingCommands() {
        pendingCommandList.stream().forEach(command -> {
            command.execute();
            executedCommandList.add(command);
        });
        pendingCommandList.clear();
    }

    //Post reverse it will add them back to pending list.
    public void reverseExecutedCommands() {
        final ListIterator<ICommand> iCommandListIterator = executedCommandList.listIterator(executedCommandList.size());
        do {
            iCommandListIterator.previous().unexecute();
        } while (iCommandListIterator.hasPrevious());
        pendingCommandList.addAll(executedCommandList);
        executedCommandList.clear();
    }
}
