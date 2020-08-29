package com.designpatterns.templatemethod;

public abstract class APITemplate implements APIOperation {

    public abstract void validate();

    public abstract void preActionLog();

    public abstract void postActionLog();

    public abstract void action();

    /**
     * This describes the template for the APIs in our service
     * Each will have to simply implement the abstract methods
     * and automatically they will have the logic to perform the action
     * as per our template.
     */
    public void enact() {
        this.validate();
        this.preActionLog();
        this.action();
        this.postActionLog();
    }
}
