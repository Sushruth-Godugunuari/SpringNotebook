package com.springbook;

import  org.springframework.context.support.ClassPathXmlApplicationContext;

public class RentABikeAssembler {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("RentABikeApp-context.xml");
        CommandLineView clv = (CommandLineView)ctx.getBean("commandLineView");
    }
}