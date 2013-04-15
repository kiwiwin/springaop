package org.kiwi.springaop;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Rich {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bank-config.xml");
        Account A = (Account) context.getBean("A");
        Account B = (Account) context.getBean("B");
        System.out.println("before");
        System.out.println(A.query());
        System.out.println(B.query());
        A.transfer(B, 80);
        System.out.println("after");
        System.out.println(A.query());
        System.out.println(B.query());
    }
}
