package com.designpatterns.command;

/**
 * Commands or events are part of a event based system where they wrap all the
 * information required to execute them, like all the dependencies etc.
 * The execute and unexecute methods are there for revert functionality from the Invoker's point.
 * or to replay the events.
 *
 * Every command will essentially mean some action that can be done and it should have an inverse
 * action associated with it.
 */
public interface ICommand {
    public void execute();
    public void unexecute();
}
