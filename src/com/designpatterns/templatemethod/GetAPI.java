package com.designpatterns.templatemethod;

public class GetAPI extends APITemplate {
    @Override
    public void validate() {
        System.out.println("Validating get request");
    }

    @Override
    public void preActionLog() {
        System.out.println("Logging get request");
    }

    @Override
    public void postActionLog() {
        System.out.println("Logging get response");
    }

    @Override
    public void action() {
        System.out.println("Performing get request");
    }
}
