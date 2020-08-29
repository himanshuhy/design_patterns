package com.designpatterns.templatemethod;

public class PutAPI extends APITemplate {
    @Override
    public void validate() {
        System.out.println("Validating the put request");
    }

    @Override
    public void preActionLog() {
        System.out.println("Logging put request");
    }

    @Override
    public void postActionLog() {
        System.out.println("Logging put response");
    }

    @Override
    public void action() {
        System.out.println("Performing put request");
    }
}
