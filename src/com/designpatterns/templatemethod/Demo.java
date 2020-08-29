package com.designpatterns.templatemethod;

public class Demo {
    public static void main(String[] args) {
        APIOperation get = new GetAPI();
        get.enact();
        APIOperation put = new PutAPI();
        put.enact();
    }
}
